package tutorial.Kotlin

import android.os.Bundle
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
    }
}