package com.example.diarywithsharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=findViewById(R.id.editId);
        button=findViewById(R.id.btnId);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txt=editText.getText().toString();
                if(!txt.equals(""))
                {
                    write(txt);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Please enter some data",Toast.LENGTH_SHORT).show();
                }
            }
        });
        read();
    }

    public  void write(String txt)
    {
        SharedPreferences sharedPreferences=getSharedPreferences("userDiary", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString("namekey",txt);

        editor.commit();

        Toast.makeText(getApplicationContext(),"Data stored successfully",Toast.LENGTH_SHORT).show();
    }

    public void read()
    {
        SharedPreferences sharedPreferences=getSharedPreferences("userDiary", Context.MODE_PRIVATE);
        if(sharedPreferences.contains("namekey"))
        {
            String txt2=sharedPreferences.getString("namekey","Data not found");

           editText.setText(txt2);
        }
    }
}