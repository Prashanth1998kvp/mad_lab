package com.example.llab2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
ImageButton b1;
Switch sc;
ConstraintLayout c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sc=findViewById(R.id.switch1);
        b1=findViewById(R.id.b1);
        c=findViewById(R.id.layout);

        CalendarView cs = new CalendarView(this);
        c.addView(cs);
        sc.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    c.removeView(cs);
                    b1.setEnabled(true);
                }
                else {
                    c.addView(cs);
                    b1.setEnabled(false);
                }
            }
        });

    }
}