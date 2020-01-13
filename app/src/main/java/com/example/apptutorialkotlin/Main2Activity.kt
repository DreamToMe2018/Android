package com.example.apptutorialkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    // 第一頁面
    // 另外在傳遞資料時 也可以利用Bundle
    // 好處是可以傳遞資訊時可以多筆資料一次傳送 也就是打包

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        btn.setOnClickListener {
            // 取得tv值
            //var value = tv.text.toString()
            var value ="我就是最萌最可愛的彌豆子"
            // 創立Intent並指定跳轉頁面
            var intent_value = Intent(this,Main3Activity::class.java)

            // 單向傳遞
            // 可多筆一次傳送
            var bundle = Bundle()
            bundle.putString("key1",value)
            bundle.putInt("key2",20)
            intent_value.putExtra("key3",bundle)
            // 送到另一個頁面
            startActivity(intent_value)
        }
    }
}
