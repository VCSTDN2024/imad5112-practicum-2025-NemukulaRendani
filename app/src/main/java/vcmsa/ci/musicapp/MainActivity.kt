package vcmsa.ci.musicapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var textView: TextView
    lateinit var playlistButton: Button
    lateinit var exitButton: Button
    lateinit var nextButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
        playlistButton =findViewById(R.id.playlistBtn)
        exitButton = findViewById(R.id.exitBtn)
        nextButton = findViewById(R.id.nxtBtn)


        nextButton.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }


        exitButton.setOnClickListener {
            finish()
        }














































    }
}