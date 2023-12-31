package com.example.nav.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.example.nav.R;

public class FDB extends SQLiteOpenHelper {

    private static int DB_VERSION = 1;
    private static String DB_NAME = "MEZMURDB";
    private static String table_name = "MEZMURDB";
    public static String KEY_ID = "id";
    public static String ITEM_TITLE = "ITEMTITLE";

    public static String SONG = "songs";
    public static String FBS = "fbs";


    // dont forget write this spaces
    private static String CREATE_TABLE = "CREATE TABLE " + table_name + "("
            + KEY_ID + " TEXT," + ITEM_TITLE + " TEXT,"  + FBS + " TEXT)";

    public FDB(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {



    }

    // create empty table
    public void insertEmpty() {
        SQLiteDatabase db;
        db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
// enter your value
       // insert data into database
      for (int x = 1; x < 11; x++) {
           cv.put(KEY_ID, x);
            cv.put(FBS, "0");
          //  cv.put(SONG, R.string.berket);
            db.insert(table_name, null, cv);
        }


    }

    public void insertIntoTheDatabase(String item_title, String id, String fav_status,int song) {
        SQLiteDatabase db;
        db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(KEY_ID, id);
        cv.put(ITEM_TITLE, item_title);
        cv.put(FBS, fav_status);
      //  cv.put(SONG,song);
        db.insert(table_name, null, cv);

    }

    // read all data
    public Cursor readalldata(String id) {
        SQLiteDatabase db = this.getReadableDatabase();
        String sql = "select * from " + table_name + " where " + KEY_ID+"="+id+"";
        return db.rawQuery(sql, null, null);
    }

    // remove line from database
    public void removefav(String id) {
        SQLiteDatabase db = this.getWritableDatabase();
        String sql = "UPDATE " + table_name + " SET  "+FBS+" ='0' WHERE "+KEY_ID+"="+id+"";
        db.execSQL(sql);


    }

    // select all favorite list
    public Cursor selectallfavoritelist() {
        SQLiteDatabase db = this.getReadableDatabase();
        String sql = "SELECT * FROM " + table_name + " WHERE "+FBS+" ='1'";
        return db.rawQuery(sql, null, null);


    }

}