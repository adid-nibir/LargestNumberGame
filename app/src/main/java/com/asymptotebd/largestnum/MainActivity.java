package com.asymptotebd.largestnum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int points,r1,r2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        points=0;
        Random rand = new Random();
        r1=rand.nextInt(10);
        r2=rand.nextInt(10);
        while (r1==r2)
            r2=rand.nextInt(10);

        Button b1=findViewById(R.id.btnL);
        b1.setText(Integer.toString(r1));
        Button b2=findViewById(R.id.btnR);
        b2.setText(Integer.toString(r2));

    }

    public void leftBtnPress(View view) {
        if(r1>r2)
            points++;
        else
            points--;

        Random rand = new Random();
        r1=rand.nextInt(10);
        r2=rand.nextInt(10);
        while (r1==r2)
            r2=rand.nextInt(10);
        TextView tv = findViewById(R.id.points);
        tv.setText("Points : "+points);
        Button b1=findViewById(R.id.btnL);
        b1.setText(Integer.toString(r1));
        Button b2=findViewById(R.id.btnR);
        b2.setText(Integer.toString(r2));
    }

    public void rightBtnPress(View view) {
        if(r2>r1)
            points++;
        else
            points--;

        Random rand = new Random();
        r1=rand.nextInt(10);
        r2=rand.nextInt(10);
        while (r1==r2)
            r2=rand.nextInt(10);
        TextView tv = findViewById(R.id.points);
        tv.setText("Points : "+points);
        Button b1=findViewById(R.id.btnL);
        b1.setText(Integer.toString(r1));
        Button b2=findViewById(R.id.btnR);
        b2.setText(Integer.toString(r2));
    }
}
