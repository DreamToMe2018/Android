package tutorial.Kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.apptutorialkotlin.R
import kotlinx.android.synthetic.main.activity_main.textView
import kotlinx.android.synthetic.main.okhttp.*
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import org.json.JSONArray
import org.json.JSONObject
import java.lang.reflect.Array
import kotlin.concurrent.thread

class Okhttp : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.okhttp)

        btn.setOnClickListener {
            // 要用同一個執行續
            //  Runnable = action
            thread {
                Runnable {
                    setupView()
                }.run()
            }.start()
        }
    }

    private fun setupView(){
        val client : OkHttpClient = OkHttpClient()
        // 首先建立一個OkHttpClient的物件，
        // 接著在透過Request類別去Builder出一個Request 網址我們就設定為 Google 首頁，
        // 再透過OkHttpClient 的 newCall 接收這個 Request，最後，
        // 利用 execute 方法去執行這個 Http Request，然後把回來的字串用TextView呈現出來。
        // 這邊要特別注意一點 必須用非同步的方式來執行execute()
        val request = Request.Builder()
            .url("https://api.kcg.gov.tw/api/service/Get/76409999-d13e-4cb2-814c-61444ac45d12")
            .build()
        try {
            // 由於字串從 Response 回來還是處於 Worker Thread，從 Response 內取出 body 的字串，
            // 就是我們要的內容，因此可以透過 runOnUiThread 的方法更新 TextView 的內容。
            val response : Response = client.newCall(request).execute()
            val resStr : String = response.body().toString()
            // 在UI線程上運行指定的操作。
            // 如果當前線程是UI線程，則立即執行該操作。
            // 如果當前線程不是UI線程，則將操作發佈到UI線程的事件隊列。
            runOnUiThread {
                Runnable {
                    textView.text = resStr

                    // 解JSON
                    var array : JSONArray = JSONArray(resStr)
                    ParsingJSON(array)
                }.run()
            }
        }catch (e: Exception){
            e.printStackTrace()
        }
    }

    // ＪＳＯＮ解析
    fun ParsingJSON(Array:JSONArray){

        for (i in 0..(Array.length()-1)){
            val jsonObject: JSONObject =Array.getJSONObject(i)
            val name = jsonObject.getString("停車場名稱").toString()
            val address = jsonObject.getString("停車場位置").toString()
            val money = jsonObject.getString("收費標準").toString()
        }
    }
}