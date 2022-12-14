package com.example.progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

private ProgressBar progressBar;
int progress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);


        progressBar=findViewById(R.id.progressId);
        Thread thread =new Thread(new Runnable() {
            @Override
            public void run() {
               dowork();
            }
        });
        thread.start();

    }

    public void dowork()
    {
       for(progress=10;progress<=100;progress=progress+10)
       {
           try {
               Thread.sleep(1000);
               progressBar.setProgress(progress);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
    }
}