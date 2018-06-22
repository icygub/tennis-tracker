package cs295capstone.tennistracker

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import kotlinx.android.synthetic.main.point_outcome.*
import android.widget.CompoundButton
import android.R.id.toggle



class PointOutcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.point_outcome)

        val shotSelectionSpinner = spinner_shot_selection as Spinner
        val selections = arrayOf("Ground Stroke", "Volley", "Half Volley", "Slice", "Drop Shot", "Overhead", "Lob", "Tweener")
        val selectionsArrayAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, selections)
        selectionsArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        shotSelectionSpinner.adapter = selectionsArrayAdapter

        toggleButton_point_wonlost.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(this, "clicked", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "unclicked", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
