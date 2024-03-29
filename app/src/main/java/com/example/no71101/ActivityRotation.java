package com.example.no71101;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.animation.LinearInterpolator;

public class ActivityRotation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rotation);

        ObjectAnimator animator = ObjectAnimator.ofFloat(findViewById(R.id.image_view),
                "rotation", 0, 360);
        animator.setRepeatCount(ValueAnimator.INFINITE);
        animator.setInterpolator(new LinearInterpolator());
        animator.setDuration(4000);
        animator.setRepeatMode(ValueAnimator.RESTART);
        animator.start();

//        Animator animator = AnimatorInflater.loadAnimator(this, R.animator.rotate);
//        animator.setTarget(findViewById(R.id.image_view));
//        animator.start();

//        final View v = findViewById(R.id.image_view);
//        ValueAnimator valueAnimator = ValueAnimator.ofFloat(0, 360);
//        valueAnimator.setRepeatCount(ValueAnimator.INFINITE);
//        valueAnimator.setInterpolator(new LinearInterpolator());
//        valueAnimator.setRepeatMode(ValueAnimator.RESTART);
//        valueAnimator.setDuration(8000);
//        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
//            @Override
//            public void onAnimationUpdate(ValueAnimator animation) {
//                v.setRotation((float) animation.getAnimatedValue());
//            }
//        });
//        valueAnimator.start();
    }

    @Override
    public void finish() {
        super.finish();
//        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }
}
