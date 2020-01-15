package tutorial.Kotlin

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.apptutorialkotlin.R
import kotlinx.android.synthetic.main.sqlite.*

class SQLite :  AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sqlite)
        val handler = ManagedSQLLiteOpenHelper(this@SQLite)

        btn.setOnClickListener {
            val txt : String = et.text.toString()
            handler.insertName(txt)
            Toast.makeText(this@SQLite,"輸入成功", Toast.LENGTH_SHORT).show()
        }
    }
}