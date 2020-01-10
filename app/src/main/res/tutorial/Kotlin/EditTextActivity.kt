package tutorial.Kotlin

import android.os.Bundle
import android.view.inputmethod.EditorInfo
import androidx.appcompat.app.AppCompatActivity
import com.example.apptutorialkotlin.R
import kotlinx.android.synthetic.main.edittext_main.*

class EditTextActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.edittext_main)

        // 升起數字鍵盤
        et1.inputType = EditorInfo.TYPE_CLASS_NUMBER
        // 獲取輸入框內容
        et1.text
        // 獲取輸入框內容，轉成字串
        et1.text.toString()
        // 獲取輸入框內容，轉成整數
        et1.text.toString().toInt()
        // 判斷是不是為空
        et1.text.isNullOrEmpty()

        // 字串不能跟整數做運算
        buttonInt.setOnClickListener{
            if(et1.text.isNullOrEmpty() || et2.text.isNullOrEmpty())
                textView.text = "有欄位未填寫"
            else{
                // 2個整數相加再轉成文字秀出來
                textView.text = (et1.text.toString().toInt() + et2.text.toString().toInt()).toString()
            }
        }

        buttonTxt.setOnClickListener{
            if(et1.text.isNullOrEmpty() || et2.text.isNullOrEmpty())
                textView.text = "有欄位未填寫"
            else{
                // 2個文字相加秀出來
                textView.text = et1.text.toString() + et2.text.toString()
            }
        }
    }
}