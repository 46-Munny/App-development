package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listId);
        String[] name={"Munny","Mukti","Maruf"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,name);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Fragment fragment;
      if(i==0)
      {
          fragment=new munny();
          FragmentManager fragmentManager=getFragmentManager();
          FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
          fragmentTransaction.replace(R.id.fragmentId,fragment);
          fragmentTransaction.commit();
      }

      else if(i==2)
      {
          fragment=new maruf();
          FragmentManager fragmentManager=getFragmentManager();
          FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
          fragmentTransaction.replace(R.id.fragmentId,fragment);
          fragmentTransaction.commit();
      }
    }
}