package sauceda.carlos.popcornfactory

import android.media.Image
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import android.widget.TextView


class MovieDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)


        val intent = intent
        val title = intent.getStringExtra("titulo")
        val desc = intent.getStringExtra("sinopsis")
        val imageRes = intent.getIntExtra("header", 0)

        var  image:ImageView = findViewById(R.id.detail_image)
        image.setImageResource(imageRes)
        var titleView:TextView  = findViewById(R.id.detail_title)
        titleView.setText(title);
        var descView:TextView = findViewById(R.id.detail_desc)
        descView.setText(desc);




    }





}