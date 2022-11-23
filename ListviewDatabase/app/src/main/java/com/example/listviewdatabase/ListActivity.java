package com.example.listviewdatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {
 DatabaseHelper databaseHelper;
 private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        listView=findViewById(R.id.listId);
        databaseHelper=new DatabaseHelper(this);
        loadData();
    }

    public void loadData()
    {
        Cursor cursor=databaseHelper.showData();
        ArrayList<String>listdata=new ArrayList<>();
        if(cursor.getCount()==0)
        {
            Toast.makeText(getApplicationContext(),"No data found",Toast.LENGTH_LONG).show();
        }
        else{
            while (cursor.moveToNext())
            {
                listdata.add(cursor.getString(0)+"\t"+cursor.getString(1));
            }
            final ArrayAdapter<String>adapter=new ArrayAdapter<String>(ListActivity.this,R.layout.listitem,R.id.txtid,listdata);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    String value=adapter.getItem(i);
                    Toast.makeText(getApplicationContext(),value,Toast.LENGTH_LONG).show();
                }
            });
        }
    }
}