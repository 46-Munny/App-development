package com.example.datepickerdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     private TextView textView;
     private Button btn;
     private DatePicker datePicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.text);
        btn=findViewById(R.id.btnId);
        datePicker=findViewById(R.id.dateId);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               textView.setText(currentDate());
            }
        });
    }
   String currentDate(){
        StringBuilder st = new StringBuilder();
        st.append("Current Date:");
        st.append(datePicker.getDayOfMonth()+"/");
        st.append((datePicker.getMonth()+1)+"/");
        st.append(datePicker.getYear());
        return st.toString();

    }
}