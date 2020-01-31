package com.example.tigerlionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
    private ImageView I1,I2,I3,I4,I5,I6,I7,I8,I9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        I1=findViewById(R.id.imageView1);
        I2=findViewById(R.id.imageView2);
        I3=findViewById(R.id.imageView3);
        I4=findViewById(R.id.imageView4);
        I5=findViewById(R.id.imageView5);
        I6=findViewById(R.id.imageView6);
        I7=findViewById(R.id.imageView7);
        I8=findViewById(R.id.imageView8);
        I9=findViewById(R.id.imageView9);
        I1.animate().translationXBy(-1100);
        I1.animate().translationYBy(-1100);
        I4.animate().translationXBy(-1100);
        I7.animate().translationXBy(-1100);
        I7.animate().translationYBy(1100);

        I3.animate().translationXBy(1100);
        I3.animate().translationYBy(-1100);
        I6.animate().translationXBy(1100);
        I9.animate().translationXBy(1100);
        I9.animate().translationYBy(1100);

        I2.animate().translationYBy(-1100);
        I8.animate().translationYBy(1100);


        I5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                I1.animate().translationXBy(1100).rotationBy(360).setDuration(3000);
                I1.animate().translationYBy(1100).rotationBy(360).setDuration(3000);
                I4.animate().translationXBy(1100).rotationBy(360).setDuration(3000);
                I7.animate().translationXBy(1100).rotationBy(360).setDuration(3000);
                I7.animate().translationYBy(-1100).rotationBy(360).setDuration(3000);

                I3.animate().translationXBy(-1100).rotationBy(360).setDuration(3000);
                I3.animate().translationYBy(1100).rotationBy(360).setDuration(3000);
                I6.animate().translationXBy(-1100).rotationBy(360).setDuration(3000);
                I9.animate().translationXBy(-1100).rotationBy(360).setDuration(3000);
                I9.animate().translationYBy(-1100).rotationBy(360).setDuration(3000);

                I2.animate().translationYBy(1100).rotationBy(360).setDuration(3000);
                I8.animate().translationYBy(-1100).rotationBy(360).setDuration(3000);
                v.animate().rotationBy(3600).setDuration(5000);







            }
        });
    }
    
}
