package tutorial.Kotlin

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.apptutorialkotlin.R
import kotlinx.android.synthetic.main.fileoutputstream.*
import java.io.FileNotFoundException
import java.io.FileOutputStream
import java.io.IOException

class FileOutputStream : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fileoutputstream)

        savebtn.setOnClickListener {
            val data = et.text.toString()

            // 做try&catch
            try {
                // 利用FileOutputStream物件來做存取
                // openFileOutput來做開啟檔案
                // 取名“Test.txt" 這個檔案會存在這個ＡＰＫ內的資料夾內
                // Context.MODE_PRIVATE：為預設操作模式，代表該檔是私有資料，只能被應用本身，
                // 在該模式下，寫入的內容會覆蓋原檔的內容，如果想把新寫入的內容追加到原檔中。
                // 可以使用Context.MODE_APPEND：模式會檢查檔是否存在，存在就往檔追加內容，否則就創建新檔
                // Context.MODE_WORLD_READABLE和Context.MODE_WORLD_WRITEABLE用來控制其他應用是否有許可權讀寫該檔。
                // MODE_WORLD_READABLE：表示當前檔可以被其他應用讀取；MODE_WORLD_WRITEABLE：表示當前檔可以被其他應用寫入。
                val outStream : FileOutputStream = this.openFileOutput("test.txt", Context.MODE_PRIVATE)

                // 做好FileOutputStream物件 利用write方法將想輸入的資料加入
                // FileOutputStream物件.write只能加入int/byteArray數據
                // String.getBytes  改為String.toByteArray()
                // 如果要將String資料加入到檔案內只能改用String.toByteArray()來進行轉換
                // 之後要讀取時要用什麼方法取出 還在想
                outStream.write(data.toByteArray())
                outStream.close()
                Toast.makeText(this,"儲存成功", Toast.LENGTH_SHORT).show()
            }catch (e: FileNotFoundException){
                Toast.makeText(this,"找不到檔案", Toast.LENGTH_SHORT).show()
            }catch (e: IOException){
                Toast.makeText(this,"IO有問題", Toast.LENGTH_SHORT).show()
            }
        }
    }
}