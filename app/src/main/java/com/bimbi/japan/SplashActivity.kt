package com.bimbi.japan

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Tombol "See Details" ketika diklik
        val buttonDetails: Button = findViewById(R.id.buttonDetails)
        buttonDetails.setOnClickListener {
            // Pindah ke MainActivity
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

        // Opsi untuk auto-pindah setelah beberapa detik (misalnya 3 detik)
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, 1000) // Delay 3 detik
    }
}