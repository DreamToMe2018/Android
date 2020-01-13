package tutorial.Kotlin

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.apptutorialkotlin.R
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.snackbar_main.*

class SnackBarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.snackbar_main)

        btn.setOnClickListener {
            // 簡單版本
            Snackbar.make(snackBar_view,"你是周子瑜",5000).show()
            // 右側可以有按鈕事件 自訂action
            Snackbar.make(snackBar_view,"你是山東之虎",5000)
                .setAction("按鈕測試", View.OnClickListener {
                    Toast.makeText(this,"天氣之子", Toast.LENGTH_SHORT).show()
                }).show()
        }
    }
}