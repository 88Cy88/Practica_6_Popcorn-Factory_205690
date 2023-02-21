package sauceda.carlos.popcornfactory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast

class SeatSelection : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seat_selection)
        val title: TextView = findViewById(R.id.tittleSeats)
        val bundle = intent.extras
        var posMovie = -1

        if (bundle!=null){
            title.setText(bundle.getString("name"))
            posMovie = bundle.getInt("id")
        }
        val confirm: Button = findViewById(R.id.confirm)
        confirm.setOnClickListener {
            //TODO añador logica para reservar el lugar seleccionado por el usuario



        Toast.makeText(this,"Enjoy the movie", Toast.LENGTH_LONG).show()
        }
        val row1:RadioGroup = findViewById(R.id.row1)
        val row2:RadioGroup = findViewById(R.id.row2)
        val row3:RadioGroup = findViewById(R.id.row3)
        val row4:RadioGroup = findViewById(R.id.row4)

        row1.setOnCheckedChangeListener { group, checkedId ->

            if(checkedId ->-1){
                
        }



        }

    }



}