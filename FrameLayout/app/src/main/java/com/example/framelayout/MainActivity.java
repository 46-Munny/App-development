package com.example.framelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView text1, text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1=findViewById(R.id.txt1Id);
        text2=findViewById(R.id.txt2Id);
        text1.setOnClickListener(this);
        text2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.txt1Id)
        {
            text1.setVisibility(view.GONE);
            text2.setVisibility(view.VISIBLE);
        }
        else if(view.getId()==R.id.txt1Id)
        {
            text2.setVisibility(view.GONE);
            text1.setVisibility(view.VISIBLE);
        }
    }
}