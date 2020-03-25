package tutorial.Kotlin

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class ManagedSQLLiteOpenHelper(context: Context) : SQLiteOpenHelper(context,dbname,factory,version)
{
    // onCreate做的就是建立資料表
    // onUpgrade則是當資料表結構有變動之類的進行更新的函數(當VERSION_NUMBER改變)。

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

    //
    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    // 查詢
    fun getAllProducts(db: SQLiteDatabase) : List<String> {
        val projection = arrayOf("name")

        val queryCursor = db.query("student",
            projection,
            null,
            null,
            null,
            null,
            null
        )

        val productList = mutableListOf<String>()
        queryCursor?.let {cursor ->
            while (cursor.moveToNext()) {
                // 取得Column在此cursor的索引
                val nameIndex = cursor.getColumnIndex("name")

                // 取得要填入每個item的值
                val productName = cursor.getString(nameIndex)

                // 建立一個當前的Product，並塞到product列表中
                //val currentProduct = Product(productName, productPrice, productQuality)
                productList.add(productName)
            }
        }

        // 關閉查詢Cursor的連接
        queryCursor.close()

        // 回傳 從Sql查詢取得的product列表
        return productList
    }
}