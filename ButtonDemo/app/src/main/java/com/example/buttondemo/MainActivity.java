package com.example.buttondemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {
    private Button bid, logoutbid;
    private TextView nid;
    int cnt, cnt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bid = findViewById(R.id.buttonId);
        nid = findViewById(R.id.nameText);
        logoutbid = findViewById(R.id.logoutbuttonId);
        Handler handler=new Handler();
        bid.setOnClickListener(handler);
        logoutbid.setOnClickListener(handler);

    }

    class Handler implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            if (view.getId() == R.id.logoutbuttonId) {
                cnt++;
               // nid.setText("Logout button is clicked " + cnt + " times");
                //using Toast
               // Toast.makeText(MainActivity.this,"Logout button is clicked "+cnt+" times",Toast.LENGTH_SHORT).show();
                Toast toast=Toast.makeText(MainActivity.this,"Logout button is clicked "+cnt+" times",Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.LEFT,140,20);
                toast.show();
            } else {
                cnt2++;
                //nid.setText("Login button is clicked " + cnt2 + " times");
                //using Toast
                //Toast.makeText(MainActivity.this,"Login button is clicked "+cnt2+" times",Toast.LENGTH_SHORT).show();
                Toast toast=Toast.makeText(MainActivity.this,"Login button is clicked "+cnt2+" times",Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER,0,0);
                toast.show();
            }
        }
    }

}