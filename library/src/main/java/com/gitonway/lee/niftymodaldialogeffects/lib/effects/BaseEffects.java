package com.gitonway.lee.niftymodaldialogeffects.lib.effects;

import android.view.View;

import com.nineoldandroids.animation.AnimatorSet;
import com.nineoldandroids.view.ViewHelper;

/**
 * Created by lee on 2014/7/30.
 */
public abstract  class BaseEffects {
    public final int DURATION = 1 * 700;

    private long mDuration=DURATION ;

    private AnimatorSet mAnimatorSet;

    {
        mAnimatorSet = new AnimatorSet();
    }

    protected abstract void setupAnimation(View view);

    public void start(View view) {
        reset(view);
        setupAnimation(view);
        mAnimatorSet.start();
    }
    public void reset(View view) {
        ViewHelper.setPivotX(view, view.getMeasuredWidth() / 2.0f);
        ViewHelper.setPivotY(view, view.getMeasuredHeight() / 2.0f);
    }


    public AnimatorSet getAnimatorSet() {
        return mAnimatorSet;
    }


}
