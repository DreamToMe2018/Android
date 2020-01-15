package tutorial.Kotlin

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class ManagedSQLLiteOpenHelper(context: Context) : SQLiteOpenHelper(context,dbname,factory,version)
{
    // 變數
    companion object{
        internal val dbname = "mydatabase"
        internal val factory = null
        internal val version = 1
    }

    // 初始化
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("create table student(id integer primary key autoincrement ,name varchar(20))")
    }

    // 新增
    fun insertName(name:String){
        val db :SQLiteDatabase = writableDatabase
        val values = ContentValues()
        values.put("name",name)

        db.insert("student",null,values)
    }

    // 修改
    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}