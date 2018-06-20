package cs295capstone.tennistracker

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.match_main_page.*

class MatchMainPageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.match_main_page)

        button_start_point.setOnClickListener {
            val intent = Intent(this, ServeOutcomeActivity::class.java)
            startActivity(intent)
        }
    }
}
