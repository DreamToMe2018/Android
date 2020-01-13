package tutorial.Kotlin

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.apptutorialkotlin.R
import kotlinx.android.synthetic.main.rock_paper_scissors.*

class RockPaperScissors : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.rock_paper_scissors)

        imgHand.setOnClickListener {
            imgTop.setImageResource(R.drawable.rock)
        }

        // 一定要回傳True
        imgHand.setOnLongClickListener {
           Toast.makeText(this,"你按太久了，看看禰豆子",Toast.LENGTH_LONG).show()
            true
        }

        imgRock.setOnClickListener {
            imgTop.setImageResource(R.drawable.scissors)
        }

        // 一定要回傳True
        imgRock.setOnLongClickListener {
            Toast.makeText(this,"你按太久了，看看禰豆子",Toast.LENGTH_LONG).show()
            true
        }

        imgScissors.setOnClickListener {
            imgTop.setImageResource(R.drawable.paper)
        }

        // 一定要回傳True
        imgScissors.setOnLongClickListener {
            Toast.makeText(this,"你按太久了，看看禰豆子",Toast.LENGTH_LONG).show()
            true
        }
    }
}