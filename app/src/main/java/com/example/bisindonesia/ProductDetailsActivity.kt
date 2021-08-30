package com.example.bisindonesia

import android.R.attr.bitmap
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.FileProvider
import kotlinx.android.synthetic.main.activity_product_details.view.*
import java.io.File
import java.io.FileOutputStream
import java.io.IOException


class ProductDetailsActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_BODY = "bus_body"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_PRICE = "extra_price"
        const val EXTRA_BUILDER_NAME = "builder_name"
        const val EXTRA_BUILDER_CITY = "builder_city"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_details)

        supportActionBar?.hide()

        val tvBusBody: TextView = findViewById(R.id.tv_item_name)
        val tvDetail: TextView = findViewById(R.id.tv_item_detail)
        val imgPhoto: ImageView = findViewById(R.id.img_item_photo)
        val tvBuilderName: TextView = findViewById(R.id.tv_item_builder)
        val tvBuilderCity:TextView = findViewById(R.id.tv_item_city)
        val tvPrice: TextView = findViewById(R.id.tv_item_price)


        val body = intent.getStringExtra(EXTRA_BODY)
        val detail = intent.getStringExtra(EXTRA_DETAIL)
        val photo = intent.getIntExtra(EXTRA_PHOTO, 0)
        val builder = intent.getStringExtra(EXTRA_BUILDER_NAME)
        val city = intent.getStringExtra(EXTRA_BUILDER_CITY)
        val price = intent.getStringExtra(EXTRA_PRICE)

        tvBusBody.text = body
        tvDetail.text = detail
        imgPhoto.setImageResource(photo)
        tvBuilderName.text = builder
        tvBuilderCity.text = city
        tvPrice.text = price

        val btShare: Button = findViewById(R.id.bt_share)
        btShare.setOnClickListener {
            val sendIntent: Intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, "Saya ingin membagikan informasi $body dari karoseri $builder")
                type = "text/plain"
            }

            val shareIntent = Intent.createChooser(sendIntent, null)
            startActivity(shareIntent)
        }

        val btBeli: Button = findViewById(R.id.bt_beli)
        btBeli.setOnClickListener {
            val sendIntent: Intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, "Saya ingin membeli $body dari karoseri $builder")
                type = "text/plain"
            }

            val shareIntent = Intent.createChooser(sendIntent, null)
            startActivity(shareIntent)
        }
    }
}