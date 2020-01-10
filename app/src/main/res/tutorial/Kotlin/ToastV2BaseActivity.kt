package tutorial.Kotlin

import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

open class ToastV2BaseActivity : AppCompatActivity() {
    fun showMessage(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }
}