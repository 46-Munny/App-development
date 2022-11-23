package com.example.customadapterdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CountryProfile extends AppCompatActivity {
     private TextView textView;
     private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_profile);
        textView=findViewById(R.id.txt2Id);
        imageView=findViewById(R.id.img2Id);

        Bundle bundle= getIntent().getExtras();
        if(bundle!=null)
        {
            String countryName=bundle.getString("name");
            showDetails(countryName);
        }
    }

    void showDetails(String countryName)
    {
        if(countryName.equals("Bangladesh"))
        {
            imageView.setImageResource(R.drawable.bg);
            textView.setText(R.string.bnang_txt);
        }
        if(countryName.equals("India"))
        {
            imageView.setImageResource(R.drawable.ind);
            textView.setText(R.string.ind_txt);
        }

        if(countryName.equals("Pakistan"))
        {
            imageView.setImageResource(R.drawable.pak);
            textView.setText(R.string.pak_txt);
        }
    }
    }
