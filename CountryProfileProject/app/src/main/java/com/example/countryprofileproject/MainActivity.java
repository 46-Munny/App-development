package com.example.countryprofileproject;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
 private Button bgButton,inButton,pButton;
 Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bgButton=findViewById(R.id.bangladeshId);
        inButton=findViewById(R.id.indiaId);
        pButton=findViewById(R.id.pakistanId);
        bgButton.setOnClickListener(this);
        inButton.setOnClickListener(this);
        pButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.bangladeshId)
        {
            Intent intent=new Intent(MainActivity.this,CountryProfile.class);
            intent.putExtra("name","Bangladesh");
            startActivity(intent);
        }

        if(view.getId()==R.id.indiaId)
        {
            Intent intent=new Intent(MainActivity.this,CountryProfile.class);
            intent.putExtra("name","India");
            startActivity(intent);
        }

        if(view.getId()==R.id.pakistanId)
        {
            Intent intent=new Intent(MainActivity.this,CountryProfile.class);
            intent.putExtra("name","Pakistan");
            startActivity(intent);
        }
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