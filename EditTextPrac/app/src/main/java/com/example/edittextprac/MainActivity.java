package com.example.edittextprac;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private EditText editText1, editText2;
private Button addbtn, subbtn;
private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1=findViewById(R.id.etextId1);
        editText2=findViewById(R.id.etextId2);
        addbtn=findViewById(R.id.addBtnId);
        subbtn=findViewById(R.id.subBtnId);
        text=findViewById(R.id.textId);

        addbtn.setOnClickListener(this);
        subbtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        try{

            String num1=editText1.getText().toString();
            String num2=editText2.getText().toString();
            double number1=Double.parseDouble(num1);
            double number2=Double.parseDouble(num2);
            double res;

            if(view.getId()==R.id.addBtnId)
            {
                res=number1+number2;
                text.setText("Summation: "+res);

            }

            if(view.getId()==R.id.subBtnId)
            {
                res=number1-number2;
                text.setText("Subtraction: "+res);

            }
        }
        catch (Exception e)
        {
            Toast.makeText(MainActivity.this,"Please enter your input",Toast.LENGTH_SHORT).show();
        }

    }
}