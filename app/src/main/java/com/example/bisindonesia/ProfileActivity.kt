package com.example.bisindonesia

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        supportActionBar?.hide()

        val btnDialPhone: Button = findViewById(R.id.bt_call)
        btnDialPhone.setOnClickListener(this)

        val btnPortofolio: Button = findViewById(R.id.bt_porto)
        btnPortofolio.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.bt_call -> {
                val phoneNumber = "085335078888"
                val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
                startActivity(dialPhoneIntent)
            }
            R.id.bt_porto -> {
                val webIntent: Intent = Uri.parse("https://github.com/kholishulil97").let { webpage ->
                    Intent(Intent.ACTION_VIEW, webpage)
                }
                startActivity(webIntent)
            }
        }
    }
}