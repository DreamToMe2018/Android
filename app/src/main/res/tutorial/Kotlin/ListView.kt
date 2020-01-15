package tutorial.Kotlin

import android.content.DialogInterface
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.apptutorialkotlin.R
import kotlinx.android.synthetic.main.simple_list_item_1.*

class ListView: AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.simple_list_item_1)

        // 然後宣告ArrayAdapter必須定義好item的資料型態，此例為String型態。
        // 可以直接用.addAll()一次添加多個字串
        val myAdapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1)
        myAdapter.addAll("三個鉛筆","四個腳踏車")

        // 當'新增'按鈕被點擊時
        btn_add.setOnClickListener {
            val msg = msg_input.text.toString()
            if (msg != "")// 如果'輸入字串'不為空字串，將'輸入字串'插入到myAdapter內
                myAdapter.insert(msg, 0)
        }

        // 當'清空'按鈕被點擊時
        btn_clear.setOnClickListener{
            var alertDialog = AlertDialog.Builder(this)
            alertDialog.setTitle("刪除")
            alertDialog.setMessage("確定要刪除全部item嗎？")

            alertDialog.setPositiveButton("取消",{dialog, which ->
                Toast.makeText(this,"取消", Toast.LENGTH_SHORT).show()
            })
            alertDialog.setNegativeButton("確認",{dialog, which ->
                myAdapter.clear()
            })

            var alert = alertDialog.create()
            alert.show()
        }
        // 當main_listview中某個item被點擊時
        main_listview.setOnItemClickListener { adapterView, view, i, l ->
            val msg = myAdapter.getItem(i)
            var alertDialog = AlertDialog.Builder(this)
            alertDialog.setTitle("刪除")
            alertDialog.setMessage("確定要刪除$msg？")

            alertDialog.setPositiveButton("取消",{dialog, which ->
                Toast.makeText(this,"取消", Toast.LENGTH_SHORT).show()
            })
            alertDialog.setNegativeButton("確定",{dialog, which ->
                myAdapter.remove(msg)
            })

            var alert = alertDialog.create()
            alert.show()
        }
        main_listview.adapter = myAdapter

        // ArrayAdapter<T>.getItem(position: Int)
        //功用: 取得某個位置的值，用整數索引當作參數
        //ArrayAdapter<T>.remove(某個值: T)
        //那個某個值的型態是依據你ArrayAdapter當初建構T的型態而定，
        //在範例中是String型態。
        //功用: 從ArrayAdapter中移除某個值
        //ArrayAdapter<T>.clear()
        //功用: 清空ArrayAdapter中所有值。
    }
}