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
        val bundle = intent.extras
        var id=-1

        if (bundle!=null){
            val title = intent.getStringExtra("titulo")
            val desc = intent.getStringExtra("sinopsis")
            val imageRes = intent.getIntExtra("header", 0)
            val ns = intent.getStringExtra("numberSeats")



            var  image:ImageView = findViewById(R.id.detail_image)
            image.setImageResource(imageRes)
            var titleView:TextView  = findViewById(R.id.detail_title)
            titleView.setText(title);
            var descView:TextView = findViewById(R.id.detail_desc)
            descView.setText(desc);
            var nsView:TextView = findViewById(R.id.seatsLeft)

            id= bundle.getInt("pos")


            if(ns.equals("0")){

            }else{
                nsView.setText(ns)
                intent.putExtra("movie",id)
                intent.putExtra("name",title)

            }

        }



    }
}