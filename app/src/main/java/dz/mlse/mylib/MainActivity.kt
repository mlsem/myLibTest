package dz.mlse.mylib

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import dz.mlse.mylibrary.CentralTendency
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView = findViewById<TextView>(R.id.textview)
        val numbers = ArrayList<Int>()
        val r = Random()

        for (i in 0..14) {
            numbers.add(r.nextInt(7) + 1)
        }

        val mean = CentralTendency.arithmeticMean(numbers).toDouble()
        val median = CentralTendency.median(numbers)
        val mode = CentralTendency.mode(numbers)

        numbers.sort()

        val res = String.format(
            "Numbers:\n\n%s\nMean: %.1f\nMedian: %.1f\nMode: %s\n",
            numbers, mean, median, mode
        )


        textView.text = res

    }

}
