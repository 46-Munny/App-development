package com.example.intent2demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
   private Button button2;
   private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        button2=findViewById(R.id.buttonId);
        editText=findViewById(R.id.etextId);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(SecondActivity.this,FirstActivity.class);
                String value=editText.getText().toString();
                intent.putExtra("key",value);
                setResult(1,intent);
                finish();
            }
        });
    }
}