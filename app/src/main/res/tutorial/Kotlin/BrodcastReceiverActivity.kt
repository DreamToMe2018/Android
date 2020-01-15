package tutorial.Kotlin

import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.apptutorialkotlin.MyReceiver
import com.example.apptutorialkotlin.R

class BrodcastReceiverActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var filter = IntentFilter()
        // 偵測耳機孔是否插入或拔除
        filter.addAction(Intent.ACTION_HEADSET_PLUG)
        // 註冊MyReceiver 並將偵測事件丟入Receiver
        registerReceiver(MyReceiver(),filter)
    }
}