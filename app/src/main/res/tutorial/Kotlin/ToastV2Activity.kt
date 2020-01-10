package tutorial.Kotlin

import android.os.Bundle
import com.example.apptutorialkotlin.R
import kotlinx.android.synthetic.main.toast_main.*

// 繼承自訂義父類別函數 ToastV2BaseActivity()
class ToastV2Activity : ToastV2BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.toast_main)

        // 使用父類別函數 showMessage("你是在睡覺嗎")
        btn_toast.setOnClickListener {
            showMessage("你是在睡覺嗎")
        }
    }
}