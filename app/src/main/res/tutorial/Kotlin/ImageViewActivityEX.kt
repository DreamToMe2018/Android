package tutorial.Kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.apptutorialkotlin.R
import kotlinx.android.synthetic.main.imageview_example_main.*
import kotlin.random.Random

class ImageViewActivityEX : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.imageview_example_main)

        val imgs = arrayListOf(
            R.drawable.dice_one, R.drawable.dice_two, R.drawable.dice_three
            , R.drawable.dice_four, R.drawable.dice_five, R.drawable.dice_six
        )

        btn.setOnClickListener {
            // 使用隨機函數
            val random = Random
            // 隨機產生0~5的亂數
            val x = random.nextInt(6)
            // 根據亂數，載入對應圖片
            imageView2.setImageResource(imgs[x])
        }
    }
}