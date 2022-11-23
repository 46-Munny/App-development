package com.example.cardviewdemo2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView school,hospital,restaurant,airport;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        school=findViewById(R.id.schoolId);
        hospital=findViewById(R.id.hospitalId);
        restaurant=findViewById(R.id.restaurantId);
        airport=findViewById(R.id.airportId);

        school.setOnClickListener(this);
        hospital.setOnClickListener(this);
        restaurant.setOnClickListener(this);
        airport.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        if(view.getId()==R.id.schoolId)
        {
            Intent intent=new Intent(MainActivity.this,SchoolActivity.class);
            startActivity(intent);
        }

        else if(view.getId()==R.id.hospitalId)
        {
            Intent intent=new Intent(MainActivity.this,HospitalActivity.class);
            startActivity(intent);
        }
        else if (view.getId()==R.id.restaurantId)
        {
            Intent intent=new Intent(MainActivity.this,RestaurantActivity.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.airportId)
        {
            Intent intent=new Intent(MainActivity.this,AirportActivity.class);
            startActivity(intent);
        }
    }
}