package cs295capstone.tennistracker

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import kotlinx.android.synthetic.main.new_match_setup.*

class NewMatchSetupActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.new_match_setup)

        val setsSpinner = spinner_sets as Spinner
        val setsPerMatch = arrayOf("1", "3", "5")
        var setsArrayAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, setsPerMatch)
        setsArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        setsSpinner.adapter = setsArrayAdapter

        val gamesSpinner = spinner_games as Spinner
        val gamesPerMatch = arrayOf("1", "2", "3", "4", "5", "6", "7", "8")
        var gamesArrayAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, gamesPerMatch)
        gamesArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        gamesSpinner.adapter = gamesArrayAdapter

        button_create_new_match.setOnClickListener{
            val intent = Intent(this, MatchMainPageActivity::class.java)
            startActivity(intent)
        }

        button_exit_setup.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
