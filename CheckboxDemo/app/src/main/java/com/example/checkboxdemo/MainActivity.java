package com.example.checkboxdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button showButton;
    private CheckBox milkc,sugarc,waterc;
    private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showButton=findViewById(R.id.showBtn);
        milkc=findViewById(R.id.milk);
        sugarc=findViewById(R.id.sugar);
        waterc=findViewById(R.id.water);
        text=findViewById(R.id.showtxt);
        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder stringBuilder=new StringBuilder();
                if(milkc.isChecked())
                {
                    String value=milkc.getText().toString();
                    stringBuilder.append(value+" is ordered\n");
                }
                if(sugarc.isChecked())
                {
                    String value=sugarc.getText().toString();
                    stringBuilder.append(value+" is ordered\n");
                }
                if(waterc.isChecked())
                {
                    String value=waterc.getText().toString();
                    stringBuilder.append(value+" is ordered\n");
                }
                text.setText(stringBuilder);
            }
        });
    }
}