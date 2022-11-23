package com.example.listviewdatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    DatabaseHelper databaseHelper;
    private EditText idEtxt,nameEtxt;
    private Button savebtn,showbtn,updatebtn,deletebtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        databaseHelper=new DatabaseHelper(this);
        SQLiteDatabase sqLiteDatabase =databaseHelper.getWritableDatabase();

        idEtxt=findViewById(R.id.uid);
        nameEtxt=findViewById(R.id.nameid);
        savebtn=findViewById(R.id.saveId);
        showbtn=findViewById(R.id.showId);
        updatebtn=findViewById(R.id.updateId);
        deletebtn=findViewById(R.id.deleteId);

        savebtn.setOnClickListener(this);
        showbtn.setOnClickListener(this);
        updatebtn.setOnClickListener(this);
        deletebtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        String id=idEtxt.getText().toString();
        String name=nameEtxt.getText().toString();

        if(view.getId()==R.id.saveId)
        {
            if(id.equals("")&&name.equals(""))
            {
                Toast.makeText(getApplicationContext(),"Enter all data",Toast.LENGTH_LONG).show();
            }
            else {
                long rowid=databaseHelper.insertdata(id,name);
                if(rowid==-1)
                {
                    Toast.makeText(getApplicationContext(),"data not inserted",Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"data inserted successfully",Toast.LENGTH_LONG).show();
                }
            }

        }

        else if(view.getId()==R.id.showId)
        {
            Intent intent=new Intent(MainActivity.this,ListActivity.class);
            startActivity(intent);
        }
       else if(view.getId()==R.id.updateId)
        {
           int a=databaseHelper.updatedata(id,name);
           if(a==0)
           {
               Toast.makeText(getApplicationContext(),"data not updated",Toast.LENGTH_LONG).show();

           }
           else{
               Toast.makeText(getApplicationContext(),"data updated successfully",Toast.LENGTH_LONG).show();
           }
        }
        else if(view.getId()==R.id.deleteId)
        {
            int b=databaseHelper.deletedata(id);
            if(b==0)
            {
                Toast.makeText(getApplicationContext(),"data not deleted",Toast.LENGTH_LONG).show();

            }
            else{
                Toast.makeText(getApplicationContext(),"data deleted successfully",Toast.LENGTH_LONG).show();
            }
        }

    }
}