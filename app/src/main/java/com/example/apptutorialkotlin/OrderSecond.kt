package com.example.apptutorialkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_order_second.*

class OrderSecond : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_second)

        var sugarName=""
        var iceName = ""
        iceGroup.setOnCheckedChangeListener { _, checkedId ->
            when(checkedId)            {
                R.id.ice1 ->{
                    iceName = "微冰"
                }
                R.id.ice2->{
                    iceName = "少冰"
                }
                R.id.ice3->{
                    iceName = "正常冰"
                }
            }
        }

        sugarGroup.setOnCheckedChangeListener { _, checkedId ->
            when(checkedId){
                R.id.sugar1 ->{
                    sugarName = "無糖"
                }
                R.id.sugar2 ->{
                    sugarName= "少糖"
                }
                R.id.sugar3 ->{
                    sugarName = "半糖"
                }
                R.id.sugar4 ->{
                    sugarName = "全糖"
                }
            }
        }

        sent.setOnClickListener {
            var bundle = Bundle()
            var drinkName = edit.text.toString()
            bundle.putString("drinkName",drinkName)
            bundle.putString("ice",iceName)
            bundle.putString("sugar",sugarName)

            val newIntent = Intent()
            newIntent.putExtra("key",bundle)
            setResult(10,newIntent)

            finish()
        }
    }
}
