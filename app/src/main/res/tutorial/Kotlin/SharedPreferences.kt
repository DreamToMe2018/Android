package tutorial.Kotlin

import android.content.Context
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.apptutorialkotlin.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.textView
import kotlinx.android.synthetic.main.sharedpreferences.*

class SharedPreferences : AppCompatActivity() {
    val TAG = javaClass.simpleName
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.sharedpreferences)

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

        savebtn.setOnClickListener {
            var txt = et.text.toString()
            sharedPref.edit().putString("Name",txt).apply()
        }

        showbtn.setOnClickListener {
            textView.text = sharedPref.getString("Name","")
        }
    }
}