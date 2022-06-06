package com.shopping.imtiaz.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.shopping.imtiaz.R

class buyitem : AppCompatActivity() {
    lateinit var name: String
    lateinit var price2: String
    lateinit var quantity1: String
    lateinit var item:TextView
    lateinit var quantity:TextView
    lateinit var total:TextView
    lateinit var price1:TextView

    @ExperimentalStdlibApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buyitem)
        name = intent.getStringExtra("name")
        price2 = intent.getStringExtra("price")
        quantity1 = intent.getStringExtra("quantity")
        var item_q: Int = quantity1.toInt()
        var buynowBtn = findViewById<Button>(R.id.buynowBtn)
        var fullnameEdTxt = findViewById<EditText>(R.id.fullnameEdTxt)
        var numEdTxt = findViewById<EditText>(R.id.numEdTxt)
        var monthEdTxt = findViewById<EditText>(R.id.monthEdTxt)
        var yearEdTxt = findViewById<EditText>(R.id.YearEdTxt)
        //
        val pr: List<String> = price2.split("£", " ")

        Log.d(Companion.TAG, "price: " + pr[1].toString().toFloat())
        var item_price: Float = pr[1].toFloat()
        var result: Float = item_price * item_q
        inalize()
        item.text = name
        price1.text = price2
        total.text = result.toString()
        quantity.text = quantity1

        buynowBtn.setOnClickListener {
        if (fullnameEdTxt.text.toString().isNullOrEmpty()) {
            Toast.makeText(this, "Kindly enter fullname", Toast.LENGTH_SHORT).show()
        }
        if (numEdTxt.text.toString().isNullOrEmpty()) {
            Toast.makeText(this, "Kindly enter number", Toast.LENGTH_SHORT).show()
        }
        if (monthEdTxt.text.toString().isNullOrEmpty()) {
            Toast.makeText(this, "Kindly enter expiry month", Toast.LENGTH_SHORT).show()
        }
        if (yearEdTxt.text.toString().isNullOrEmpty()) {
            Toast.makeText(this, "Kindly enter expiry year", Toast.LENGTH_SHORT).show()
        }
        else {
            Toast.makeText(this, "Order placed successfully", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
            }
        }
    }

    private fun inalize() {
        item=findViewById(R.id.item_name_result)
        quantity=findViewById(R.id.item_quantity_result)
        total=findViewById(R.id.total_order)
        price1=findViewById(R.id.item_price)

    }

    companion object {
        private const val TAG = "buyitem"
    }
}