package tutorial.Kotlin

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.apptutorialkotlin.R
import kotlinx.android.synthetic.main.image.*
import java.net.URL
import javax.net.ssl.HttpsURLConnection

class Image: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.image)

        btn.setOnClickListener {
            val mBitmap = getBitmapFromUrl("https://i.imgur.com/AMnLO3b.png")
            // 利用 mlmageView.setImageBitmap 來載ImageView上產生圖片
            imageView.setImageBitmap(mBitmap)
        }
    }

    fun getBitmapFromUrl(src:String): Bitmap? {
        try {
            var url = URL(src)
            val conn = url.openConnection() as HttpsURLConnection
            conn.connect()
            val input = conn.inputStream
            // BitmapFactory.decodeStream為何
            //當Android需要載入圖片的時候 如果圖片的容量太大(容量>16m) 很容易造成Out of Memory (OOM)的情況 所以沒辦法直接載入產生
            return BitmapFactory.decodeStream(input)
        }catch (e:java.io.IOException){
            e.printStackTrace()
        }

        return null
    }
}