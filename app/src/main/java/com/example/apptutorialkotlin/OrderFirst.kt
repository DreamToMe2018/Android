package com.example.apptutorialkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_order_first.*

class OrderFirst : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_first)

        // 實作按鈕轉頁 使用starActivityForResult 給予resquestCode
        btn.setOnClickListener {
            var intent = Intent(this,Main2Activity::class.java)
            // 下一頁會回傳給上一頁
            startActivityForResult(intent,0)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == 0){
            if(resultCode == 10){

                var drinkName = data?.getBundleExtra("key")?.getString("drinkName")
                drink.text = drinkName
                var iceName = data?.getBundleExtra("key")?.getString("ice")
                ice.text=iceName
                var sugarName = data?.getBundleExtra("key")?.getString("sugar")
                sugar.text = sugarName
            }
        }
    }
}
