package com.example.listviewdatabase;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME="user.db";
    private static final String TABLE_NAME="userDetails";
    private static final String ID="id";
    private  static final String NAME="name";
    private static final int VERSION_NO=1;
    private static final String CREATE_TABLE="CREATE TABLE "+TABLE_NAME+" ( "+ID+" INTEGER,"+NAME+" VARCHAR(60) NOT NULL);";
    private static final String DROP_TABLE="DROP TABLE IF EXISTS "+TABLE_NAME;
    private Context context;

    public DatabaseHelper( Context context) {
        super(context, DATABASE_NAME, null, VERSION_NO);
        this.context=context;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        try {
            sqLiteDatabase.execSQL(CREATE_TABLE);
            Toast.makeText(context,"onCreate is called",Toast.LENGTH_LONG).show();
        }
        catch (Exception e)
        {
            Toast.makeText(context,"Exception: "+e,Toast.LENGTH_LONG).show();
        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        try {

            Toast.makeText(context,"onUpgrade is called",Toast.LENGTH_LONG).show();
            sqLiteDatabase.execSQL(DROP_TABLE);

            onCreate(sqLiteDatabase);
        }
        catch (Exception e)
        {
            Toast.makeText(context,"Exception: "+e,Toast.LENGTH_LONG).show();
        }
    }

    public  long insertdata(String id,String name)
    {
        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(ID,id);
        contentValues.put(NAME,name);
        long rowid=sqLiteDatabase.insert(TABLE_NAME,null,contentValues);
        return  rowid;
    }

    public Cursor showData()
    {
        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
        Cursor cursor=sqLiteDatabase.rawQuery("SELECT * FROM "+TABLE_NAME,null);
        return cursor;
    }

    public int updatedata(String id,String name)
    {
        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(ID,id);
        contentValues.put(NAME,name);
        int a=sqLiteDatabase.update(TABLE_NAME,contentValues,ID+"=?",new String[]{id});
        return a;

    }
    public  int deletedata(String id)
    {
        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
        int b=sqLiteDatabase.delete(TABLE_NAME,ID+" =?",new String[]{id});
        return b;

    }
}
