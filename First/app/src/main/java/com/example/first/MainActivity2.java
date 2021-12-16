package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import javax.xml.namespace.QName;

public class MainActivity2 extends AppCompatActivity {
TextView msg;
String st;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        msg= findViewById(R.id.t2);
        Intent i=getIntent();
        st= getIntent().getStringExtra("message");
        msg.setText(st);

    }
}