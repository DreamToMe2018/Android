package com.example.apptutorialkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_main3.*

class Main3Activity : AppCompatActivity() {
    // 第二頁面
    // 第二個畫面如何取值
    // intent.getStringExtra("key值")就可以取得由前一個畫面傳遞過來的值
    // 不過由於前一個畫面我是取string值傳送 所以這邊用getStringExtra
    // 如果是其他數值類型應該會用get數值型態Extra 並且可傳遞Array
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        // 這是範例
        val value = intent.getStringExtra("Key")
        textView4.text = value

        // 單向傳遞
        // 跟第一頁面有關連
        // 特別注意兩點
        // 第一個是資料型態
        // 第二個是bundle的包裝形式 因為bundle可以包bundle
        // 所以指定到bundle最後一層時 直接用get資料型態即可
        var value2 = intent.getBundleExtra("key3").getString("key1")
        textView4.setText( "自介" + value2)

        var value3 = intent.getBundleExtra("key3").getInt("key2")
        textView5.text = value3.toString()

        // 雙向傳遞
        // 雙向傳遞需要用到startActivityForResult()啟動第二個Activity
        // SetResult()儲存要返回的資料
        // 第二個Activity 要使用finish方法結束
        // 重寫OnActivityResult()取得返回資料
    }
}
