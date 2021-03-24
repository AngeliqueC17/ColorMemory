package com.example.colormemory;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class SQLiteHelper extends SQLiteOpenHelper {

    public static String BDD_NAME="ColorMemory", TABLE_NAME="Color", ID="id";
    public static String LAST_NAME="last_name", FIRST_NAME="first_name", BIRTH="birth", EMAIL="email", GENDER="gender", PASSWORD="password", SCORE="score";

    public SQLiteHelper(@Nullable Context context) {
        super(context, BDD_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql =
                "CREATE TABLE " + TABLE_NAME + " (" +
                        ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                        LAST_NAME + " TEXT," +
                        FIRST_NAME + " TEXT," +
                        BIRTH + " DATE," +
                        EMAIL + " TEXT," +
                        GENDER + " TEXT," +
                        PASSWORD + " TEXT," +
                        SCORE + " INTEGER)";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        String sql= "DROP TABLE IF EXISTS " + TABLE_NAME;
        db.execSQL(sql);
        onCreate(db);
    }

    boolean addPlayer(String last_name, String first_name, String email, String birth, String gender, String password, String score) {

        SQLiteDatabase db=this.getWritableDatabase();

        ContentValues data=new ContentValues();
        data.put(LAST_NAME, last_name);
        data.put(FIRST_NAME, first_name);
        data.put(EMAIL, email);
        data.put(BIRTH, String.valueOf(birth));
        data.put(GENDER, gender);
        data.put(PASSWORD, password);
        data.put(SCORE, score);

        long result=db.insert(TABLE_NAME, null, data);
        if(result!=-1) {
            return true;
        }
        else
            return false;
    }

    boolean connection(String email, String password) {
        SQLiteDatabase db = this.getReadableDatabase();
        String sql = "SELECT * FROM Color WHERE email='" + email + "'AND password='" + password + "'";
        Cursor cursor = db.rawQuery(sql, null);
        if (cursor.moveToFirst()) {
            return true;
        }
        else
            return false;
    }
}
