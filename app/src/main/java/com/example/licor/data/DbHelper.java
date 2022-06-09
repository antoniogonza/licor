package com.example.licor.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHelper {
    public class LicorDbHelper extends SQLiteOpenHelper {
        public static final int DATABASE_VERSION = 1;
        public static final String DATABASE_NAME = "Licor.db";

        public LicorDbHelper(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);


        }

        @Override
        public void onCreate(SQLiteDatabase sqLiteDatabase) {
            sqLiteDatabase.execSQL("CREATE TABLE " + Licor.TABLE_NAME +"(" + Licor.id + " INTEGER PRIMARY KEY AUTOINCREMENT,\"\n" + Licor.id + " TEXT NOT NULL,\"\n" +
                    + Licor.Nombre + " TEXT NOT NULL,\"\n"
                    + Licor.Dificultad + " TEXT NOT NULL,\"\n" +
                    + Licor.Ingredientes + " TEXT NOT NULL,\"\n" +
                    + Licor.Preparacion + " TEXT NOT NULL,\"\n" +
                    +Licor.Tiempo + "TEXT NOT NULL,\""  );

        }

        private void sqLiteDatabase() {
        }

        @Override
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        }
    }
}
