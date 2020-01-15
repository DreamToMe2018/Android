package com.example.apptutorialkotlin

import android.app.Service
import android.content.Intent
import android.os.IBinder

class Service : Service() {
    // 第一種 startService()
    // 裡面必須先建立重寫兩種方法
    // onCreate() 在建立時只會啟動一次
    // onStartCommand() 背景執行的程式
    override fun onCreate() {
        super.onCreate()
    }

    // service可以夾帶資料從mainActivity 帶到Service中 應用Intent夾帶資料進入
    // 在onStartCommand()中 回傳值主要有三種定義
    // START_NOT_STICKY:Service結束時就結束服務
    // START_STICKY: Service結束時 系統重啟並再次調用onStartCommand(), instant被清空
    // START_REDELIVER_INTENT:Service結束時 系統重啟並再次調用onStartCommand(), instant不清空
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
    }
}
