package com.example.implicitintent2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private Button phnbtn,webbtn,mapbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        phnbtn=findViewById(R.id.callId);
        webbtn=findViewById(R.id.webId);
        mapbtn=findViewById(R.id.locationId);

        phnbtn.setOnClickListener(this);
        webbtn.setOnClickListener(this);
        mapbtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.callId)
        {
            Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:+8801709216382"));
            startActivity(intent);
        }
        else if(view.getId()==R.id.webId)
        {
            Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.studywithanis.com"));
            startActivity(intent);
        }
       else if(view.getId()==R.id.locationId)
        {
            Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("geo:24.896837,91.902739"));
            startActivity(intent);
        }
    }
}