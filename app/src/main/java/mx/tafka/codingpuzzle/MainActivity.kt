package mx.tafka.codingpuzzle

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView



class MainActivity : AppCompatActivity() {

    private var shipIcon: ImageView? = null
    private var levelBackground: ImageView? = null

    private val stepX = 207
    private val stepY = 216

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction().replace(R.id.controls_container, StartFragment.newInstance()).commit()
        }

        // Get UI elements
        shipIcon = findViewById(R.id.ic_ship)
        levelBackground = findViewById(R.id.puzzle_background)

        // Get ship icon measures
        shipIcon?.measure(0, 0)
        val shipWidth: Float = (this.shipIcon?.measuredWidth!!).toFloat()
        val shipHeight: Float = (this.shipIcon?.measuredHeight!!).toFloat()

        shipIcon?.x = (stepX * 2).toFloat() - (shipWidth / 2)
        shipIcon?.y = (stepY * 2).toFloat() - (shipHeight / 2)

    }


}
