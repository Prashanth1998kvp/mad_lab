package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

ImageButton b1;
Switch sw;
ConstraintLayout cs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sw= findViewById(R.id.switch1);
        b1= findViewById(R.id.b1);
        cs=findViewById(R.id.layout);
        CalendarView c = new CalendarView(this);
        cs.addView(c);
        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    cs.removeView(c);
                    b1.setEnabled(true);
                }
                else{
                    cs.addView(c);
                    b1.setEnabled(false);
                }
            }
        });

    }
}