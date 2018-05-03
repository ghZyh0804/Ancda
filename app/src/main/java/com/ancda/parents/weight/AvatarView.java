package com.ancda.parents.weight;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout;

import com.ancda.parents.R;

/**
 * Description:
 *
 * @author huangbiao
 * @date 2015年8月29日
 */
public class AvatarView extends RelativeLayout {
    private CircleImageView avatar;
    private ImageView type;
    private int drawableId = R.drawable.user_vip_type;

    public AvatarView(Context context) {
        super(context);
        initView(context);
    }

    public AvatarView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView(context);
    }

    public AvatarView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        initView(context);
    }

    private void initView(Context context) {
        avatar = new CircleImageView(context);
        LayoutParams params = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
        avatar.setLayoutParams(params);
        this.addView(avatar, params);
        avatar.setScaleType(ScaleType.CENTER_CROP);
        avatar.setImageResource(R.drawable.shape_loading_bg);
      // avatar.setIsStroke(true);
      // avatar.setsetStrokeColor("#e1e2e2");
      // avatar.setStrokeWidth(1);
        type = new ImageView(context);
        LayoutParams p = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        p.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, RelativeLayout.TRUE);
        p.addRule(RelativeLayout.ALIGN_PARENT_RIGHT, RelativeLayout.TRUE);
        type.setImageResource(drawableId);
        type.setLayoutParams(p);
        this.addView(type, p);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int mode = MeasureSpec.getMode(widthMeasureSpec);
        int w = 30;
        if (mode == MeasureSpec.EXACTLY) {
            w = MeasureSpec.getSize(widthMeasureSpec) / 2;
        }
        android.view.ViewGroup.LayoutParams params = type.getLayoutParams();
        params.width = w;
        params.height = w;
//        type.setLayoutParams(params);

        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

//    @Override
//    public void setBackground(Drawable background) {
//        avatar.setImageDrawable(background);
//    }
//    
//    @Override
//    @Deprecated
//    public void setBackgroundDrawable(Drawable background) {
//        avatar.setImageDrawable(background);
//    }
//    
//    @Override
//    public void setBackgroundResource(int resid) {
//        avatar.setImageResource(resid);
//    }

    public CircleImageView getAvatar() {
        return avatar;
    }

    public void setTypeByDrawableId(int drawableId) {
        this.drawableId = drawableId;
        type.setImageResource(this.drawableId);
    }

    public void setTypeVisibility(boolean isVisibility) {
        type.setVisibility(isVisibility ? VISIBLE : INVISIBLE);
    }

    public void setTypeByRoleidId(String roleid) {
        if ("1".equals(roleid)) {
            this.drawableId = R.drawable.user_director_type;
        } else if ("2".equals(roleid)) {
            this.drawableId = R.drawable.user_teacher_type;
        } else if ("3".equals(roleid)) {
            this.drawableId = R.drawable.user_parent_type;
        } else if ("4".equals(roleid)) {
            this.drawableId = R.drawable.user_vip_type;
        }
        type.setImageResource(this.drawableId);
    }


}
