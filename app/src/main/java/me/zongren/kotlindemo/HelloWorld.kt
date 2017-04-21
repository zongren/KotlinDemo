package me.zongren.kotlindemo

import android.app.Activity
import android.widget.Toast

/**
 * Created by zongren on 2017/4/21.
 * All right reserved by 正奇晟业（北京）科技有限公司
 */
class HelloWorld {
    companion object {
        fun speak(activity: Activity, word: String = "What do you want me to say?") {
            Toast.makeText(activity, word, Toast.LENGTH_SHORT).show()
        }
    }
}