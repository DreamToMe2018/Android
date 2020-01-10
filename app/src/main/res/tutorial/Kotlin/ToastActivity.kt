package tutorial.Kotlin

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.apptutorialkotlin.R
import kotlinx.android.synthetic.main.toast_main.*

class ToastActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.toast_main)

        btn_toast.setOnClickListener {
            Toast.makeText(this,"你是在哈囉",Toast.LENGTH_LONG).show()
        }
    }
}