package com.example.alertdilogedemo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private Button button;
private AlertDialog.Builder abuilder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.btn);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
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
                Toast.makeText(MainActivity.this,"You click on No button",Toast.LENGTH_SHORT).show();
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