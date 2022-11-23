package com.example.listviewadapter;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
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
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listId);
        countryName=getResources().getStringArray(R.array.country_name);
        CustomAdapter adapter=new CustomAdapter(this,countryName,flags);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String value=countryName[i];
                Toast.makeText(MainActivity.this,value,Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this,CountryProfile.class);
                intent.putExtra("name",value);
                startActivity(intent);

            }
        });
    }
    public  void onBackPressed(){
        AlertDialog.Builder abuilder;
        abuilder=new AlertDialog.Builder(MainActivity.this);
        abuilder.setTitle(R.string.Text);
        abuilder.setMessage(R.string.mes_Text);
        abuilder.setIcon(R.drawable.ic_launcher_background);
        abuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        abuilder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        abuilder.setNeutralButton("CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this,"You click on CANCEL button",Toast.LENGTH_SHORT).show();
            }
        });
        AlertDialog alertDialog=abuilder.create();
        alertDialog.show();

    }
}