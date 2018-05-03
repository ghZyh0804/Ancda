package com.ancda.parents.weight;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

import com.ancda.parents.R;


/**
 * 动态列表中动态发布的动画控件
 * @author  huangbiao
 */
public class PublishingImageView extends android.support.v7.widget.AppCompatImageView {

    private AnimationDrawable anim;

    public PublishingImageView(Context context) {
        super(context);
        initAnima();
    }

    public PublishingImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initAnima();
    }

    public PublishingImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initAnima();
    }

    private void initAnima(){
        if(!isInEditMode()){
            setBackgroundResource(R.drawable.publish_anima);
            anim = (AnimationDrawable)getBackground();
        }
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
//        setBackgroundResource(R.drawable.l_1);
        if(anim != null){
            anim.stop();
//            tryRecycleAnimationDrawable();
        }
        anim = null;
    }

    private void tryRecycleAnimationDrawable(){
        if(anim == null){
            return;
        }
        for (int i = 0; i < anim.getNumberOfFrames(); i++) {
            try {
                Drawable frame = anim.getFrame(i);
                if (frame instanceof BitmapDrawable) {
                    ((BitmapDrawable) frame).getBitmap().recycle();
                }
                frame.setCallback(null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if(anim != null && !anim.isRunning()){
            anim.start();
        }
    }

    @Override
    public void setVisibility(int visibility) {
        super.setVisibility(visibility);
        if(visibility == VISIBLE){
            startAnima();
        }else {
            stopAnima();
        }
    }

    public void startAnima(){
        if(anim == null){
            initAnima();
        }
        if(anim != null && !anim.isRunning()){
            anim.start();
        }
    }

    public void stopAnima(){
//        setBackgroundResource(R.drawable.l_1);
        if(anim != null ){
            anim.stop();
            anim = null;
//            tryRecycleAnimationDrawable();
//            anim = null;
        }
    }
}
