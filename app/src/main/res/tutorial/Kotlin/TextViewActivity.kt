package tutorial.Kotlin

import android.graphics.Color
import com.example.apptutorialkotlin.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import kotlinx.android.synthetic.main.textview_main.*

class TextViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.textview_main)

        //設定顯示的文字
        textView2.setText("HKT")
        //設定文字的顏色
        textView2.setTextColor(Color.parseColor("#0000ff"))
        //設定文字的大小
        textView2.setTextSize(TypedValue.COMPLEX_UNIT_PX, dpToPx(40F))
    }

    private fun dpToPx(dp: Float): Float {
        return dp * this.resources.displayMetrics.density
    }
}
