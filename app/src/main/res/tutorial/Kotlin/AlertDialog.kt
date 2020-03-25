package tutorial.Kotlin

import android.content.DialogInterface
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.apptutorialkotlin.R
import kotlinx.android.synthetic.main.button_main.*

class AlertDialog : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.button_main)

        btn.setOnClickListener {
            // 建立AlertDialog.Builder物件 透過實作介面產生AlertDialog
            var alertDialog = AlertDialog.Builder(this)
            alertDialog.setTitle("誰是正妹")
            alertDialog.setMessage("周子瑜")

            // 以下程式碼可產生按鈕
            // 其中setPositiveButton/setNegativeButton/setNeutralButton差異在按鈕產生的位置
            alertDialog.setPositiveButton("cancel",{dialog, which ->
                Toast.makeText(this,"取消", Toast.LENGTH_SHORT).show()
                })
            alertDialog.setNegativeButton("confirm",{dialog, which ->
                Toast.makeText(this,"確認", Toast.LENGTH_SHORT).show()
            })
            alertDialog.setNeutralButton("item",{dialog, which ->
                Toast.makeText(this,"列表", Toast.LENGTH_SHORT).show()
            })

            var alert = alertDialog.create()
            alert.show()
        }

        // 另外的範例
        var alertDialog = AlertDialog.Builder(this)
        alertDialog.setTitle("誰是正妹")
        alertDialog.setMessage("周子瑜")
        alertDialog
            .setPositiveButton("確定") { dialog, which ->
                showWitch(dialog, which) // -1
            }
            .setNegativeButton("拒絕") { dialog, which ->
                showWitch(dialog, which) // -2
            }
            .setNeutralButton("稍後決定") { dialog, which ->
                showWitch(dialog, which) // -3
            }
        var alert = alertDialog.create()
        alert.show()

        // 選擇清單，一樣有分三種型態
        // 傳統單一選項清單
        val options = arrayOf("選項一", "選項二", "選項三")
        val alertBuilder = AlertDialog.Builder(this)
        alertBuilder
            .setTitle("標題")
            .setItems(options) { _, which  ->
                Log.i("SHOW_CONFIG", which.toString())
            }

        // 確認式單一選項清單
        alertBuilder
            .setTitle("標題")
            .setSingleChoiceItems(R.array.options, -1) { _, which ->
                Log.i("SHOW_CONFIG", which.toString())
            }

        alertBuilder
            .setTitle("標題")
            .setSingleChoiceItems(R.array.options, -1) { _, which ->
                Log.i("SHOW_CONFIG", which.toString())
            }
            .setPositiveButton("確定") { dialog, which ->
                showWitch(dialog, which)
            }
            .setNegativeButton("取消") { dialog, which ->
                showWitch(dialog, which)
            }

        // 確認式複選清單
        alertBuilder
            .setTitle("標題")
            .setSingleChoiceItems(R.array.options, -1) { _, which ->
                Log.i("SHOW_CONFIG", which.toString())
            }

        alertBuilder
            .setTitle("標題")
            .setMultiChoiceItems(R.array.options, null) { _, which, isChecked ->
                Log.i("SHOW_CONFIG", "$which $isChecked")
            }
            .setPositiveButton("確定") { dialog, which ->
                showWitch(dialog, which)
            }
            .setNegativeButton("取消") { dialog, which ->
                showWitch(dialog, which)
            }

        // 透過 Logcat 的資訊，可以知道每次勾選選項時，會得到該選項及變更值，因此可以使用一個容器統一裝載
        // ，以下程式碼示範如何記錄勾選的項目：
        // 取得 XML 中陣列長度
        val arraySize = resources.getStringArray(R.array.options).size
        // 宣告一個相同大小的布林陣列，預設為 false，也可指定為 true 讓開啟對話方塊預設全選
        var arrOpts = BooleanArray(arraySize) { false }
        alertBuilder
            .setTitle("標題")
            // 第二參數 null 改為 arrOpts
            .setMultiChoiceItems(R.array.options, arrOpts) { _, which, isChecked ->
                // 每次勾選項目時，將陣列對應值更新
                arrOpts[which] = isChecked
                Log.i("SHOW_CONFIG", "${arrOpts.toList()}")
            }
    }

    // 在 onCreate 之外建立的函式
    private fun showWitch(dialog: DialogInterface?, which: Int) {
        Log.i("SHOW_CONFIG", which.toString())
    }
}