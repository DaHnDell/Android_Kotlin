package com.kcanmin.myapplication

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.kcanmin.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.text_layout)

//        val fruits = listOf("PineApple" , "apple", "Banana", "Guaba", "Mango", "Grape", "peach", "melon", "pear", "waterMelon","PineApple" , "apple", "Banana", "Guaba", "Mango", "Grape", "peach", "melon", "pear", "waterMelon");
//        val listViewList:ListView = findViewById(R.id.listView);
//        // data adapter
//        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, fruits);
//        listViewList.adapter = adapter;
//
//        listViewList.setOnItemClickListener { _, _, position, _ ->
//            val value = fruits[position];
//            Toast.makeText(this, value, Toast.LENGTH_SHORT).show();
//        }


        // event
//        val input:EditText = findViewById(R.id.editTextText)
//        val button:Button = findViewById(R.id.button)
//
//        button.setOnClickListener{
//            val textValue = input.text.toString();
//            if(textValue.isBlank()){
//                Toast.makeText(this, "값을 입력하십시요.", Toast.LENGTH_SHORT).show()
//            }
//            else{
//                Toast.makeText(this, "안녕하세요, $textValue", Toast.LENGTH_SHORT).show()
//            }
//        }


//        enableEdgeToEdge()
//        setContent {
//            MyApplicationTheme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    )
//                }
//            }
//        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Greeting("Android")
    }
}