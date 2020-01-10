package tutorial.Kotlin

import android.graphics.Color
import com.example.apptutorialkotlin.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.button_main.*

class BtnActivity : AppCompatActivity(){
    private var isOffline:Boolean = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.button_main)

        btn.setOnClickListener {
            if (isOffline) {
                isOffline = false
                tv.setText(R.string.online)
                tv.setTextColor(Color.GREEN)
            } else {
                isOffline = true
                tv.setText(R.string.offline)
                tv.setTextColor(Color.BLUE)
            }
        }
    }
}