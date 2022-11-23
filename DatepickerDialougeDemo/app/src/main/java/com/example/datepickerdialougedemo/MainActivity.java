package com.example.datepickerdialougedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
     private Button btn;
     private TextView textView;
     private DatePickerDialog datePickerDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btnId);
        textView = findViewById(R.id.text);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        DatePicker datePicker= new DatePicker(this);
        int day=datePicker.getDayOfMonth();
        int month=datePicker.getMonth()+1;
        int year=datePicker.getYear();
        datePickerDialog=new DatePickerDialog(this,
                new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                       textView.setText(i2+"/"+(i1+1)+"/"+i);
                    }
                },year,month,day);
        datePickerDialog.show();

    }  
}