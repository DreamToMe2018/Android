package tutorial.Kotlin

import android.os.Bundle
import android.widget.AdapterView
import android.widget.SimpleAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.apptutorialkotlin.R
import kotlinx.android.synthetic.main.gridview.*


class GridView : AppCompatActivity() {

    private val image = intArrayOf(
        R.drawable.google, R.drawable.facebook, R.drawable.github,
        R.drawable.instagram, R.drawable.yahoo, R.drawable.pchome
    )

    private val imageText = arrayOf(
        "google",
        "facebook",
        "github",
        "instagram",
        "yahoo",
        "pchome"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.gridview)

        val items = ArrayList<Map<String,Any>>()
        for (i in image.indices){
            val item = HashMap<String,Any>()
            item["image"] = image[i]
            item["text"] = imageText[i]
            items.add(item)
        }

        // arrayOf("image", "text")  intArrayOf(R.id.image, R.id.text) 對應到R.layout.grid_item的元件ID
        val adapter = SimpleAdapter(this,items,R.layout.grid_item,arrayOf("image", "text"),
            intArrayOf(R.id.image, R.id.text))

        // 設定為 3 columns，這樣就會顯示三個垂直列，接著設定按下某一個 item 以後的事件。
        grid.numColumns = 3
        grid.adapter = adapter
        grid.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            Toast.makeText(this@GridView, "你選擇了" + imageText[position], Toast.LENGTH_SHORT).show()
        }
    }
}
