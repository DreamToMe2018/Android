package tutorial.Kotlin

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.apptutorialkotlin.R
import kotlinx.android.synthetic.main.mediamusicmovie.*

class MediaMusicMovie : AppCompatActivity() {

    // 建好MediaPlayer物件
    // 音樂篇
    var player: MediaPlayer = MediaPlayer()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mediamusicmovie)

        // 設置好FloatingActionButtom事件
        floatingActionButton.setOnClickListener {
            var intent = Intent(Intent.ACTION_GET_CONTENT)
            // intent.type設為"audio/*" 搜尋所有音樂檔
            intent.type = "audio/*"
            val dest = Intent.createChooser(intent,"Select")
            startActivityForResult(dest,0)
        }

        btnplay.isEnabled = false
        btnplay.setOnClickListener {
            player.start()
        }
        btnpause.isEnabled =false
        btnpause.setOnClickListener {
            player.pause()
        }
        btnstop.isEnabled = false
        // 使用停止按鈕
        // 除了使用player.stop()停止之外 還需要一個
        // player.preareAsync() 這是歸零的效果
        btnpause.setOnClickListener {
            player.stop()
            player.prepareAsync()
        }

        // 影片
        floatingActionButton2.setOnClickListener {
            var intent = Intent(Intent.ACTION_GET_CONTENT)
            intent.type = "video/*"
            val dest = Intent.createChooser(intent,"Select")
            startActivityForResult(dest,0)
        }
    }

    // 用onActivityResult() 回呼中接收該結果
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        // 音樂篇
        val uri = data?.data
        player = MediaPlayer.create(this,uri)
        btnplay.isEnabled = true
        btnpause.isEnabled =true
        btnstop.isEnabled = true

        // 影片
        val urlMovie = data?.data
        videoView.setVideoURI(urlMovie)
        videoView.start()
    }
}