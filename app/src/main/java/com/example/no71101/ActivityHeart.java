package com.example.no71101;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.os.Bundle;

public class ActivityHeart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heart);

        Animator animator = AnimatorInflater.loadAnimator(this, R.animator.breath);
        animator.setTarget(findViewById(R.id.image_view));
        animator.start();
    }
}
