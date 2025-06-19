package vcmsa.ci.musicapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    lateinit var detailButton: Button
    lateinit var textView: TextView
    lateinit var homeButton: Button
    lateinit var averageButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        textView = findViewById (R.id.detailScrn)
        detailButton = findViewById (R.id.detailBtn)
        homeButton =findViewById(R.id.homeBtn)
        averageButton = findViewById(R.id.AvBtn)


        homeButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }






























    }
}