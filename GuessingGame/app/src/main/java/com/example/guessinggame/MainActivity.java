package com.example.guessinggame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
     private EditText editText;
     private Button button;
     private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.numId);
        button=findViewById(R.id.btnId);
        textView=findViewById(R.id.txtId);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.btnId)
        {
            String number=editText.getText().toString();
            if(number.isEmpty())
            {
               errorMessage();
            }
            else{
                int num=Integer.parseInt(number);
                if(num>5)
                {
                    errorMessage();
                }
                else{
                    Random random=new Random();
                    int randomNum=random.nextInt(5)+1;
                    if(num==randomNum)
                    {
                        textView.setText("Congrats!!! You win.");
                    }
                    else {
                        textView.setText("You guess wrong number.Random number is: "+randomNum);
                    }
                }

            }


        }
    }

    void errorMessage()
    {
        editText.setError("Please enter a valid number");
        editText.requestFocus();
    }
}