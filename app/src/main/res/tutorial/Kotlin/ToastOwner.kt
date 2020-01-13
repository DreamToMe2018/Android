package tutorial.Kotlin

import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.apptutorialkotlin.R
import kotlinx.android.synthetic.main.toast_main.*
import kotlinx.android.synthetic.main.toast_owner_main.*

class ToastOwner: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.toast_main)

        btn_toast.setOnClickListener {
            // 首先建立一個Toast物件
            var Toast2 = Toast(this)
            // 設定顯示高度與對齊方式
            Toast2.setGravity(Gravity.CENTER,0,0)
            // 設定Toast顯示時間
            Toast2.duration=Toast.LENGTH_LONG
            // 建立一個layoutInflater
            var inflater2 = layoutInflater
            // 將做好的xml的名稱與ID指定給layoutInflater
            val toast_layout =inflater2.inflate(R.layout.toast_owner_main,toast_view)
            // 將做好的layoutInflater指定給Toas
            Toast2.view = toast_layout
            // 顯示
            Toast2.show()
        }
    }
}