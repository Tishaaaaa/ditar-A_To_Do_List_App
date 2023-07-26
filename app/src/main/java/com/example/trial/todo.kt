package com.example.trial
import android.os.Bundle
import android.util.SparseBooleanArray
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_todo.*
import java.util.*


class todo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_todo)
        val actionBar = supportActionBar
        if (actionBar != null) {
            actionBar.title = "todo"
            actionBar.setDisplayHomeAsUpEnabled(true)
            // Initializing the array lists and the adapter
            val itemlist: MutableList<String> = ArrayList()
            var adapter = ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_multiple_choice
                , itemlist)
            // Adding the items to the list when the add button is pressed
            val btnadd = findViewById<Button>(R.id.add)
            btnadd.setOnClickListener {

                itemlist.add(editText.text.toString())
                listView.adapter =  adapter
                adapter.notifyDataSetChanged()
                // This is because every time when you add the item the input space or the edit text space will be cleared
                editText.text.clear()
            }
            // Clearing all the items in the list when the clear button is pressed
            val btnclear = findViewById<Button>(R.id.clear)
            btnclear.setOnClickListener {

                itemlist.clear()
                adapter.notifyDataSetChanged()
            }
            // Adding the toast message to the list when an item on the list is pressed
            listView.setOnItemClickListener { adapterView, view, i, l ->
                Toast.makeText(this, "You Selected the item --> "+itemlist.get(i), Toast.LENGTH_SHORT).show()
            }
            // Selecting and Deleting the items from the list when the delete button is pressed
            val btndelete = findViewById<Button>(R.id.delete)
            btndelete.setOnClickListener {
                val position: SparseBooleanArray = listView.checkedItemPositions
                val count = listView.count
                var item = count - 1
                while (item >= 0) {
                    if (position.get(item))
                    {
                        adapter.remove(itemlist.get(item))
                    }
                    item--
                }
                position.clear()
                adapter.notifyDataSetChanged()
            }
        }
    }

}

