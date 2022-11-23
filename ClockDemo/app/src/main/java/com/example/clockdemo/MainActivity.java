package com.example.clockdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.TextClock;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private AnalogClock analogClock;
    private TextClock textClock;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        analogClock=findViewById(R.id.aclockId);
        textClock=findViewById(R.id.tclockId);
        analogClock.setOnClickListener(this);
        textClock.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.aclockId)
        {
            Toast.makeText(MainActivity.this,"Analog Clock",Toast.LENGTH_SHORT).show();
        }
       else
        {
            Toast.makeText(MainActivity.this,"Text Clock",Toast.LENGTH_SHORT).show();
        }
    }
}