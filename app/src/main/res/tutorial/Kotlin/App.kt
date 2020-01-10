package tutorial.Kotlin

import android.app.Application
import android.widget.Toast

class App : Application() {
    companion object {
        private var instance: Application? = null
        fun instance() = instance!!
    }

    override fun onCreate() {
        super.onCreate()
        instance = this

        Toast.makeText(App.instance(), "ooo", Toast.LENGTH_SHORT).show()
    }
}