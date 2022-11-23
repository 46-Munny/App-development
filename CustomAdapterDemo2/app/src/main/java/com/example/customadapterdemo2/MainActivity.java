package com.example.customadapterdemo2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private String[] countryName;
    int[] flags={R.drawable.bangla,R.drawable.india,R.drawable.pakistan};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        listView=findViewById(R.id.listId);
        countryName=getResources().getStringArray(R.array.country_name);
        CustomAdapter adapter=new CustomAdapter(this,countryName,flags);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String value=countryName[i];
                Toast.makeText(MainActivity.this,value,Toast.LENGTH_SHORT).show();

            }
        });
    }

}