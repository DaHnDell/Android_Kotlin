package com.kcanmin.my_gallery

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.kcanmin.my_gallery.ui.theme.My_GalleryTheme
import java.net.URI

class MainActivity : AppCompatActivity() {

    private lateinit var addPhotoButton: Button
    private lateinit var startPhotoButton: Button
    private lateinit var imageViewList: List<ImageView>
    private val imageList : MutableList<Uri> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addPhotoButton = findViewById(R.id.addPhotoButton)
        startPhotoButton = findViewById(R.id.startPhotoButton)
        imageViewList = listOf(
            findViewById(R.id.imageView1),
            findViewById(R.id.imageView2),
            findViewById(R.id.imageView3)
        )

        addPhotoButton.setOnClickListener{
            navigatePhotos()
        }

        startPhotoButton.setOnClickListener{
            val intent = Intent(this, PhotoFrameActivity::class.java)
            imageList.forEachIndexed{index, uri -> intent.putExtra("photo$index", uri.toString())
            startActivity(intent)
            }
        }
    }
    private fun navigatePhotos(){
        val intent = Intent(Intent.ACTION_GET_CONTENT)
        intent.type = "image/*"
        startActivityForResult(intent, 500)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?){
        super.onActivityResult(requestCode, resultCode, data)
        if(resultCode != Activity.RESULT_OK){
            return
        }

        when(requestCode){
            500 -> {
                val selectedImageUri : Uri? = data?.data
                if(selectedImageUri != null){
                    if(imageList.size == 3){
                        Toast.makeText(this, "3 pic appended", Toast.LENGTH_LONG).show()
                        return
                    }
                    imageList.add(selectedImageUri)
                    imageViewList[imageList.size - 1 ].setImageURI(selectedImageUri)
                }
            }
        }
    }
}

