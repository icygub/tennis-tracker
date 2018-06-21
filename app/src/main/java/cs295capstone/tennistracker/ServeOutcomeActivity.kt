package cs295capstone.tennistracker

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.serve_outcome.*

class ServeOutcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.serve_outcome)

        button_ace.setOnClickListener {
            val intent = Intent(this, MatchMainPageActivity::class.java)
            startActivity(intent)
        }

        button_continue.setOnClickListener {
            val intent = Intent(this, PointOutcomeActivity::class.java)
            startActivity(intent)
        }
    }
}
