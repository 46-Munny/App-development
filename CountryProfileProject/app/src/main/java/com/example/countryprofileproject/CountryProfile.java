package com.example.countryprofileproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class CountryProfile extends AppCompatActivity {
   private TextView textView;
   private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_profile);
        textView=findViewById(R.id.txtId);
        imageView=findViewById(R.id.imgId);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Bundle bundle= getIntent().getExtras();
        if(bundle!=null)
        {
            String countryName=bundle.getString("name");
            showDetails(countryName);
        }
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId()==android.R.id.home)
        {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
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