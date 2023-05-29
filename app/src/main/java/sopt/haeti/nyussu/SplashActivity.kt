package sopt.haeti.nyussu

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import sopt.haeti.nyussu.databinding.ActivitySplashBinding
import sopt.haeti.nyussu.util.BindingActivity
import sopt.haeti.nyussu.util.extension.startActivity

@SuppressLint("CustomSplashScreen")
class SplashActivity : BindingActivity<ActivitySplashBinding>(R.layout.activity_splash) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        lifecycleScope.launch {
            delay(2000)
            startActivity<MainActivity>()
            overridePendingTransition(0, 0)
            finish()
        }
    }
}