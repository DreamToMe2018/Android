package tutorial.Kotlin

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.apptutorialkotlin.R
import kotlinx.android.synthetic.main.event_main.*

class Event : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.event_main)

        // onClickListener
        btn.setOnClickListener {
            tv.text = "CoCo"
        }

        // onLongClickListener
        // ;true不知道意思
        btn.setOnLongClickListener {
            tv.text = "別碰我";true
        }

        // onCheckChangeListener
        // _不知道意思
        RG.setOnCheckedChangeListener{_,checkedId ->
            when(checkedId){
                R.id.RB01 ->{
                    tv.text="RB01"
                }
                R.id.RB02 ->{
                    tv.text="RB02"
                }
                R.id.RB03->{
                    tv.text="RB03"
                }
            }
        }
    }
}