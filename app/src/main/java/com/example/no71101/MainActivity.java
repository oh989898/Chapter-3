package com.example.no71101;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView2button = (TextView)findViewById(R.id.textView2);
        TextView textView3button = (TextView)findViewById(R.id.textView3);
        //textView2button.setOnClickListener(new View.OnClickListener() {
        //    @Override
         //   public void onClick(View view) {
         //       Toast.makeText(MainActivity.this,"点击了白色按钮",Toast.LENGTH_SHORT).show();
         //   }
        //});
       // textView3button.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //    public void onClick(View view) {
        //        Toast.makeText(MainActivity.this,"点击了红色按钮",Toast.LENGTH_SHORT).show();
        //    }
       // });
    }
    public void myClick (View view){
        Intent intent = new Intent(MainActivity.this,AnimationActivity.class);
        startActivity(intent);
    }
    public void myClick2 (View view){
        Intent intent = new Intent(MainActivity.this,ActivityHeart.class);
        startActivity(intent);
    }
    public void myClick3 (View view){
        Intent intent = new Intent(MainActivity.this,ActivityRotation.class);
        startActivity(intent);
    }
    public void myClick4 (View view){
        Intent intent = new Intent(MainActivity.this,ActivityLoading.class);
        startActivity(intent);
    }
}
