package inc.fabudi.lifycyclelog

import android.app.Activity
import android.os.Bundle
import android.util.Log

class MainActivity: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("LifecycleLog", "onCreate Called")
    }

    override fun onStart() {
        super.onStart()
        Log.d("LifecycleLog", "onStart Called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("LifecycleLog", "onResume Called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("LifecycleLog", "onPause Called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("LifecycleLog", "onStop Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("LifecycleLog", "onDestroy Called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("LifecycleLog", "onRestart Called")
    }

}