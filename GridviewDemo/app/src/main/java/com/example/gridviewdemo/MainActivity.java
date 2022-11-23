package com.example.gridviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
 private GridView gridView;
    private String[] countryName;
    int[] flags={R.drawable.bangla,R.drawable.india,R.drawable.pakistan};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView=findViewById(R.id.gridId);
        countryName=getResources().getStringArray(R.array.country_name);

        CustomAdapter adapter=new CustomAdapter(this,countryName,flags);
        gridView.setAdapter(adapter);
    }
}