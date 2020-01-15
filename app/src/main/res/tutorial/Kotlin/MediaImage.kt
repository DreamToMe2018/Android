package tutorial.Kotlin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.apptutorialkotlin.R
import kotlinx.android.synthetic.main.mediaimage.*

class MediaImage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mediaimage)

        // ACTION_GET_CONTENT 是ANDROID 內建的檔案選擇器
        // Android的Intent可以用在Application或是Activity之間的溝通，
        // 只要使用Intent的ACTION_GET_CONTENT，系統就會幫使用者找到裝置內合適的App來取得指定MIME類型的內容
        // 當選取完物件後 必須利用intent 傳遞選擇物件 其應用行為顯示會在 onActivityResult() 回呼中接收該結果
        floatingActionButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_GET_CONTENT)
            intent.type = "image/*"
            val dest = Intent.createChooser(intent,"Select")
            startActivityForResult(dest,0)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        val uri = data?.data
        imageView.setImageURI(uri)
    }
}