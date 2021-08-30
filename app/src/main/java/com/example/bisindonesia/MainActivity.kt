package com.example.bisindonesia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvBuses: RecyclerView
    private var list: ArrayList<Bus> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvBuses = findViewById(R.id.rv_buses)
        rvBuses.setHasFixedSize(true)

        list.addAll(BusData.listData)
        showRecycleList()
    }

    private fun showRecycleList() {
        rvBuses.layoutManager = LinearLayoutManager(this)
        val listBusAdapter = ListBusAdapter(list)
        rvBuses.adapter = listBusAdapter

        listBusAdapter.setOnItemClickCallback(object : ListBusAdapter.OnItemClickCallback{
            override fun onItemClicked(data: Bus) {
                showSelectedBus(data)
            }
        })
    }

    private fun showSelectedBus(bus: Bus) {
        val moveWithDataIntent = Intent(this@MainActivity, ProductDetailsActivity::class.java)
        moveWithDataIntent.putExtra(ProductDetailsActivity.EXTRA_BODY, bus.body)
        moveWithDataIntent.putExtra(ProductDetailsActivity.EXTRA_DETAIL, bus.detail)
        moveWithDataIntent.putExtra(ProductDetailsActivity.EXTRA_PHOTO, bus.photo)
        moveWithDataIntent.putExtra(ProductDetailsActivity.EXTRA_PRICE, bus.price)
        moveWithDataIntent.putExtra(ProductDetailsActivity.EXTRA_BUILDER_NAME, bus.builderName)
        moveWithDataIntent.putExtra(ProductDetailsActivity.EXTRA_BUILDER_CITY, bus.builderCity)
        startActivity(moveWithDataIntent)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }
    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_list -> {
                showRecycleList()
            }
            R.id.action_developer -> {
                val moveIntent = Intent(this@MainActivity, ProfileActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }
}