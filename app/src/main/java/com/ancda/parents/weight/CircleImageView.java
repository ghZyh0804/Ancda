package com.ancda.parents.weight;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.graphics.drawable.GradientDrawable;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;

import com.ancda.parents.R;

@SuppressLint("AppCompatCustomView")
public class CircleImageView extends ImageView {

    private static final Xfermode MASK_XFERMODE;
    private Bitmap mask;
    private Paint paint;
    private int mBorderWidth = 0;
    private int mBorderColor = Color.parseColor("#ffffff");
    private boolean isStroke = false;
    private float density = 1;

    private static final int LAYER_FLAGS = Canvas.MATRIX_SAVE_FLAG | Canvas.CLIP_SAVE_FLAG | Canvas.HAS_ALPHA_LAYER_SAVE_FLAG
            | Canvas.FULL_COLOR_LAYER_SAVE_FLAG | Canvas.CLIP_TO_LAYER_SAVE_FLAG;

    static {
        PorterDuff.Mode localMode = PorterDuff.Mode.DST_IN;
        MASK_XFERMODE = new PorterDuffXfermode(localMode);
    }

    public CircleImageView(Context paramContext) {
        super(paramContext);
        density = paramContext.getResources().getDisplayMetrics().density;
        init();
    }

    public CircleImageView(Context paramContext, AttributeSet paramAttributeSet) {
        this(paramContext, paramAttributeSet, 0);
        density = paramContext.getResources().getDisplayMetrics().density;
        parseAttributes(paramContext,paramAttributeSet);
        init();
    }

    public CircleImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
        super(paramContext, paramAttributeSet, paramInt);
        setScaleType(ScaleType.CENTER_CROP);
        density = paramContext.getResources().getDisplayMetrics().density;
        parseAttributes(paramContext,paramAttributeSet);
        init();
    }

    private void parseAttributes(Context paramContext,AttributeSet attrs) {
        TypedArray a = paramContext.obtainStyledAttributes(attrs, R.styleable.CircleImageView);
        mBorderColor = a.getColor(R.styleable.CircleImageView_border_color, mBorderColor);
        mBorderWidth = a.getDimensionPixelOffset(R.styleable.CircleImageView_border_width, 0);
        if(mBorderWidth > 0){
            isStroke = true;
        }
        a.recycle();
        String defultNamespace = "http://schemas.android.com/apk/res/android";
        String attributeValue = attrs.getAttributeValue(defultNamespace, "background");
        if (attributeValue != null && attributeValue.length() > 1) {
            if ("#".equals(attributeValue.substring(0, 1))) {
                int mColor = Color.parseColor(attributeValue);
                setBackgroundColor(mColor);
            }
        }
    }

    private void init() {
        if (this.paint == null) {
            final Paint localPaint = new Paint();
            localPaint.setFilterBitmap(false);
            localPaint.setAntiAlias(true);
            localPaint.setXfermode(MASK_XFERMODE);
            this.paint = localPaint;
        }
    }

    @SuppressWarnings("deprecation")
    @SuppressLint("NewApi")
    @Override
    public void setBackgroundColor(int color) {
        GradientDrawable sd = (GradientDrawable) getResources().getDrawable(R.drawable.circle_bg);
        sd.setColor(color);
        if (VERSION.SDK_INT >= 16) {
            setBackground(sd);
        } else {
            setBackgroundDrawable(sd);
        }
    }

    /**
     * 设置是否需要边框
     *
     * @param isStroke
     */
    public void setIsStroke(boolean isStroke) {
        this.isStroke = isStroke;
        invalidate();
    }

    public void setStrokeWidth(int widthByDip) {
        mBorderWidth = (int) ((density * widthByDip) + 0.5f);
        invalidate();
    }

    public void setsetStrokeColor(String color) {
        if (!TextUtils.isEmpty(color)) {
            mBorderColor = Color.parseColor(color);
            invalidate();
        }
    }

    @Override
    protected void onDraw(Canvas paramCanvas) {

        final int width = getWidth();
        final int height = getHeight();
        /** 保存layer */
        paramCanvas.saveLayerAlpha(0.0F, 0.0F, width, height, 0xff, LAYER_FLAGS);
        /** 设置drawable的大小 */
        // // localDrawable.setBounds(0, 0, width, height);
        /** 将drawable绑定到bitmap(this.mask)上面（drawable只能通过bitmap显示出来） */
        // // localDrawable.draw(paramCanvas);
        /** 调用父类画目标图片 **/
        super.onDraw(paramCanvas);
        if ((this.mask == null) || (this.mask.isRecycled())) {
            this.mask = createOvalBitmap(width, height);
        }
        /** 将bitmap画到canvas上面 */
        paramCanvas.drawBitmap(this.mask, 0.0F, 0.0F, this.paint);
        /** 将画布复制到layer上 */
        paramCanvas.restore();
        if (isStroke) {
            drawBorder(paramCanvas, width, height);
        }
    }

    /**
     * 绘制最外面的边框
     *
     * @param canvas
     * @param width
     * @param height
     */
    private void drawBorder(Canvas canvas, final int width, final int height) {
        if (mBorderWidth == 0) {
            return;
        }
        final Paint mBorderPaint = new Paint();
        mBorderPaint.setStyle(Paint.Style.STROKE);
        mBorderPaint.setAntiAlias(true);
        mBorderPaint.setColor(mBorderColor);
        mBorderPaint.setStrokeWidth(mBorderWidth);
        /**
         * 坐标x：view宽度的一般 坐标y：view高度的一般 半径r：因为是view的宽度-border的一半
         */
        canvas.drawCircle(width >> 1, height >> 1, (width - mBorderWidth) >> 1, mBorderPaint);
        canvas = null;
    }

    /**
     * 获取一个bitmap，目的是用来承载drawable;
     * <p/>
     * 将这个bitmap放在canvas上面承载，并在其上面画一个椭圆(其实也是一个圆，因为width=height)来固定显示区域
     *
     * @param width
     * @param height
     * @return
     */
    public Bitmap createOvalBitmap(final int width, final int height) {
        Bitmap.Config localConfig = Bitmap.Config.ARGB_8888;
        Bitmap localBitmap = Bitmap.createBitmap(width, height, localConfig);
        Canvas localCanvas = new Canvas(localBitmap);
        Paint localPaint = new Paint();
        localPaint.setAntiAlias(true);
        final int padding = (mBorderWidth - 3) > 0 ? mBorderWidth - 3 : 1;
        /**
         * 设置椭圆的大小(因为椭圆的最外边会和border的最外边重合的，如果图片最外边的颜色很深，有看出有棱边的效果，所以为了让体验更加好，
         * 让其缩进padding px)
         */
        RectF localRectF = new RectF(padding, padding, width - padding, height - padding);
        localCanvas.drawOval(localRectF, localPaint);
        return localBitmap;
    }
}
