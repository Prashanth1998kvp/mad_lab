package com.example.llll;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button Add,Remove;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Add = findViewById(R.id.button);
        Remove = findViewById(R.id.button2);

        Fragment fragment = new FragmentTest();

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().add(R.id.f1,fragment).commit();
                Toast.makeText(MainActivity.this,"fragment added", Toast.LENGTH_SHORT).show();

            }
        });
        Remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().remove(fragment).commit();
                Toast.makeText(MainActivity.this,"fragment remove", Toast.LENGTH_SHORT).show();


            }
        });
    }
}