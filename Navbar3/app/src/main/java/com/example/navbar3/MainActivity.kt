package com.example.navbar3

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.content.res.AppCompatResources
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    lateinit var toolBar :  MaterialToolbar
    lateinit var toast_message : Button
    lateinit var snake_message : Button
    lateinit var alert_message : Button
    lateinit var myLayout : ConstraintLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        toolBar = findViewById(R.id.MaterialToolBar)
        toast_message = findViewById(R.id.toast)
        snake_message = findViewById(R.id.snake)
        alert_message = findViewById(R.id.dialog)
        myLayout = findViewById(R.id.myLayout)

        toolBar.overflowIcon =
            AppCompatResources.getDrawable(this, R.drawable.baseline_read_more_24)
        toolBar.setNavigationOnClickListener {
            Toast.makeText(applicationContext, "Tool Bar is clicked", Toast.LENGTH_SHORT).show()
        }
        toolBar.setOnMenuItemClickListener { item ->
            when (item.itemId) {
                R.id.share -> Toast.makeText(
                    applicationContext,
                    "Navigation is clicked",
                    Toast.LENGTH_SHORT
                ).show()

                R.id.drive -> Toast.makeText(
                    applicationContext,
                    "Drive is Clicked",
                    Toast.LENGTH_SHORT
                ).show()

                R.id.temperature -> Toast.makeText(
                    applicationContext,
                    "Temperature is Clicked",
                    Toast.LENGTH_SHORT
                ).show()

                R.id.setting -> Toast.makeText(
                    applicationContext,
                    "Setting is Clicked",
                    Toast.LENGTH_SHORT
                ).show()

                else -> Toast.makeText(applicationContext, "Setting is Clicked", Toast.LENGTH_SHORT)
                    .show()

            }
            return@setOnMenuItemClickListener true

        }

        toast_message.setOnClickListener {
            Toast.makeText(applicationContext, "This is Toast Message", Toast.LENGTH_SHORT).show()
        }

        snake_message.setOnClickListener {
            Snackbar.make(myLayout, "This is SnackBar Message", Snackbar.LENGTH_INDEFINITE)
                .setAction(
                    "Close", View.OnClickListener {

                    }).show()

        }

        alert_message.setOnClickListener {
            showAlertDialog()
        }
    }
        fun showAlertDialog(){
            val alertDialog = AlertDialog.Builder(this@MainActivity)
            alertDialog.setTitle("Warning")
                .setMessage("Are you Really trying change the text of button Element?")
                .setIcon(R.drawable.warning)
                .setCancelable(false)
                .setNegativeButton("No", DialogInterface.OnClickListener { dialogInterface, which ->
                    dialogInterface.cancel()
                })
                .setPositiveButton("Yes", DialogInterface.OnClickListener { dialogInterface, which ->
                    alert_message.text = "Alert Message"
                }).show()
        }

}