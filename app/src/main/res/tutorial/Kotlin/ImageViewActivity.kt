package tutorial.Kotlin

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.apptutorialkotlin.R
import kotlinx.android.synthetic.main.imageview_main.*

class ImageViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.imageview_main)

//        imageView.adjustViewBounds = true
//        imageView.cropToPadding = true
//        imageView.maxHeight = 500
//        imageView.maxWidth = 500
//        imageView.scaleType = ImageView.ScaleType.CENTER
    }
}