package com.example.firstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog


class MainActivity : AppCompatActivity() {
    var TAG="Android Message:"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val btn = findViewById<Button>(R.id.randomBtn).setOnClickListener {
////            Log.d(TAG, msg: "out message goes here")
//            Toast.makeText(context: this, text: "Text output on the screen", Toast.LENGHT_SHORT) }

        var textEdit = findViewById<TextView>(R.id.randomText)
        val button = findViewById<Button>(R.id.randomBtn).setOnClickListener {
            textEdit.text = listBase()
            Log.d(TAG, "this is the log for debug")
            Toast.makeText(this, "this comes up when the btn is pressed", Toast.LENGTH_SHORT).show()
        }

    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main,menu)
        return true
    }

    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
//        menu?.getItem(1)?.isVisible = false
        return super.onPrepareOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {

            R.id.menu_item_add -> {
                var taskEditText = EditText(this)
                val builder = AlertDialog.Builder(this)
                builder.setView(taskEditText)
                builder.setTitle("Add Name")
                builder.setMessage("Type name to add")

                builder.setPositiveButton("Create") { _, _ ->
                    val name = taskEditText.text.toString().trim().capitalize()
                    if (joinedList.contains(name)) {
                        Toast.makeText(applicationContext, "Already in the list", Toast.LENGTH_SHORT).show()
                    } else {
                        joinedList.add(name)
                        Toast.makeText(applicationContext, "Added to list", Toast.LENGTH_SHORT).show()
                        Log.d("adding name", "$joinedList")
                    }

                }
                builder.setNegativeButton("Cancel", null)
                builder.show()
                true

            }
            R.id.menu_item_remove -> {
                var taskEditText = EditText(this)
                val builder = AlertDialog.Builder(this)
                builder.setView(taskEditText)
                builder.setTitle("Remove Name")
                builder.setMessage("Type name to remove")
                builder.setPositiveButton("Create") { _, _ ->
                    val name = taskEditText.text.toString().trim()
                    if (joinedList.contains(name)) {
                        joinedList.remove(name)
                        Toast.makeText(applicationContext, "Success", Toast.LENGTH_SHORT).show()
                        Log.d("list", "$joinedList")
                    } else {
                        Toast.makeText(applicationContext, "Failed to delete", Toast.LENGTH_SHORT).show()
                    }

                }
                builder.setNegativeButton("Cancel", null)
                builder.show()
                true
            }
            else -> return super.onOptionsItemSelected(item)
        }

    }
}
