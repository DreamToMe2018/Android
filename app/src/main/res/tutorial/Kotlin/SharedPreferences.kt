package tutorial.Kotlin

import android.content.Context
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class SharedPreferences : AppCompatActivity() {
    val TAG = javaClass.simpleName
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

        // 獲取 SharedPreferences資料值
        val sharedPref = getSharedPreferences("mydata",Context.MODE_PRIVATE)

        // 設定 SharedPreferences資料值
        sharedPref.edit().putBoolean("first_login",true).apply()
        sharedPref.edit().putString("id","0123456789").apply()
        sharedPref.edit().putInt("Score",100).apply()

        // 讀取 SharedPreferences資料值
        Log.d(TAG,"first_login: "+sharedPref.getBoolean("first_login",false))
        Log.d(TAG,"id: "+sharedPref.getString("id",""))
        Log.d(TAG,"Score: "+sharedPref.getInt("Score",0))
    }
}