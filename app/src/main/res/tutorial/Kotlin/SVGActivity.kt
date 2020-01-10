package tutorial.Kotlin

import android.graphics.Color
import android.os.Bundle
import android.util.TypedValue
import androidx.appcompat.app.AppCompatActivity
import com.example.apptutorialkotlin.R
import kotlinx.android.synthetic.main.textview_main.*

class SVGActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.textview_main)

        // 螢幕解析度
        val density = resources.displayMetrics.density

        // 0.75 LDPI
        // 1.0 MDPI
        // 1.5 HDPI
        // 2.0 XHDPI
        // 3.0 XXHDPI
        // 4.0 XXXHDPI
    }
}