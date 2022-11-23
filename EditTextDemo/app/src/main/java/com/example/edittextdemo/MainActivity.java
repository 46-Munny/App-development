package com.example.edittextdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private EditText etext1,etext2;
private Button addButton,subButton;
private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etext1=findViewById(R.id.editText1);
        etext2=findViewById(R.id.editText2);
        addButton=findViewById(R.id.addBtn);
        subButton=findViewById(R.id.subBtn);
        result=findViewById(R.id.resultText);
        addButton.setOnClickListener(this);
        subButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        try{
            String number1=etext1.getText().toString();
            String number2=etext2.getText().toString();
            double num1=Double.parseDouble(number1);
            double num2=Double.parseDouble(number2);
            double res;

            if(view.getId()==R.id.addBtn)
            {
                res=num1+num2;
                result.setText("The result is: "+res);
            }
            else
            {
                res=num1-num2;
                result.setText("The result is: "+res);
            }
        }
        catch (Exception e){
            Toast.makeText(MainActivity.this,"PLease Enter Number",Toast.LENGTH_SHORT).show();
        }


    }
}