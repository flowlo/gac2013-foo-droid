package gac.freecycle;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

//public class DBHelper extends SQLiteOpenHelper {
//
//    public DBHelper(Context context) {
//        super(context, "DemoDB", null, 1);
//    }
//
//    @Override
//    public void onCreate(SQLiteDatabase db) {
//        StringBuilder builder=new StringBuilder();
//        // countries table
//        builder.append("CREATE TABLE Countries ");
//        builder.append("(_id INTEGER PRIMARY KEY AUTOINCREMENT,");
//        builder.append("NAME TEXT) ");
//        db.execSQL(builder.toString());
//        // Names table
//        // Virtual table for full text search
//        builder.setLength(0);
//        builder.append("CREATE VIRTUAL TABLE NAMES USING FTS3");
//        builder.append("(");
//        builder.append("name TEXT) ");
//        db.execSQL(builder.toString());
//        builder=new StringBuilder();
//
//        //dummy  data
////        InsertData(db);
//
//    }
//
////    void InsertData(SQLiteDatabase db)
////    {
////        ContentValues cv=new ContentValues();
////        cv.put("NAME","USA");
////        db.insert("Countries", "NAME", cv);
////        cv.put("NAME","UK");
////        db.insert("Countries", "NAME", cv);
////        cv.put("NAME","Spain");
////        db.insert("Countries", "NAME", cv);
////        cv.put("NAME","ITALY");
////        db.insert("Countries", "NAME", cv);
////        cv.put("NAME","Germany");
////        db.insert("Countries", "NAME", cv);
////
////        cv=new ContentValues();
////        cv.put("name","John");
////        db.insert("NAMES", "name", cv);
////        cv.put("name","Jack");
////        db.insert("NAMES", "name", cv);
////        cv.put("name","Ann");
////        db.insert("NAMES", "name", cv);
////        cv.put("name","Adam");
////        db.insert("NAMES", "name", cv);
////        cv.put("name","Sarah");
////        db.insert("NAMES", "name", cv);
////
////    }
//
//    @Override
//    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
//        // TODO Auto-generated method stub
//
//    }
//
//    /**
//     * Return all countries
//     * @return
//     */
//    public ArrayListgetCountries(){
//        ArrayList countries=new ArrayList();
//        SQLiteDatabase db=this.getReadableDatabase();
//        Cursor c=db.rawQuery("select * from Countries", null);
//        while(c.moveToNext()){
//            String country=c.getString(1);
//            countries.add(country);
//        }
//        c.close();
//        return countries;
//    }
//    /**
//     * Return all names
//     * @return
//     */
//
//    public ArrayListgetNames(){
//        ArrayList names=new ArrayList();
//        Cursor c=this.getReadableDatabase().rawQuery("select * FROM Names", null);
//        while(c.moveToNext()){
//            String name=c.getString(0);
//            names.add(name);
//        }
//        c.close();
//        return names;
//    }
//}