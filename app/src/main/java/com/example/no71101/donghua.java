package com.example.no71101;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.os.Bundle;

public class donghua extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donghua);

//        View imageView = findViewById(R.id.image_view);
//        ObjectAnimator scaleXAnimator = ObjectAnimator.ofFloat(imageView,
//                "scaleX", 1.1f, 0.9f);
//        scaleXAnimator.setRepeatCount(ValueAnimator.INFINITE);
//        scaleXAnimator.setInterpolator(new LinearInterpolator());
//        scaleXAnimator.setDuration(1000);
//        scaleXAnimator.setRepeatMode(ValueAnimator.REVERSE);
//
//        ObjectAnimator scaleYAnimator = ObjectAnimator.ofFloat(imageView,
//                "scaleY", 1.1f, 0.9f);
//        scaleYAnimator.setRepeatCount(ValueAnimator.INFINITE);
//        scaleYAnimator.setInterpolator(new LinearInterpolator());
//        scaleYAnimator.setDuration(1000);
//        scaleYAnimator.setRepeatMode(ValueAnimator.REVERSE);
//
//        AnimatorSet animatorSet = new AnimatorSet();
//        animatorSet.playTogether(scaleXAnimator, scaleYAnimator);
//        animatorSet.start();

        Animator animator = AnimatorInflater.loadAnimator(this, R.animator.breath);
        animator.setTarget(findViewById(R.id.image_view));
        animator.start();
    }
}
