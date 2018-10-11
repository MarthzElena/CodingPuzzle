package mx.tafka.codingpuzzle

import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.design.widget.FloatingActionButton
import android.support.v4.app.Fragment
import android.support.v7.widget.AppCompatButton
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*

class StartFragment : Fragment() {

    // Fragment Views
    private var startGameView: LinearLayout? = null
    private var gameCommandsView: ConstraintLayout? = null

    // UI Elements
    private var startGameButton: Button? = null
    private var runCommandsButton: FloatingActionButton? = null
    // Move buttons
    private var moveUp: Button? = null
    private var moveDown: Button? = null
    private var moveLeft: Button? = null
    private var moveRight: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        if (savedInstanceState != null) {
            // Modify/Set variables needed for fragment here
        }

        activity.run {
            // ???
        }

        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val contentView = inflater.inflate(R.layout.controls_fragment, container, false)

        return contentView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        // Initialize views
        startGameView = view.findViewById(R.id.start_view)
        gameCommandsView = view.findViewById(R.id.game_controls)
        // Set defaults
        hideView(view = gameCommandsView)
        showView(view = startGameView)

        startGameButton = view.findViewById(R.id.start_game_button)
        startGameButton?.setOnClickListener{
            hideView(view = startGameView)
            showView(view = gameCommandsView)
        }
        runCommandsButton = view.findViewById(R.id.run_commands)
        moveDown = view.findViewById(R.id.move_down)
        moveLeft = view.findViewById(R.id.move_left)
        moveRight = view.findViewById(R.id.move_right)
        moveUp = view.findViewById(R.id.move_up)

        super.onViewCreated(view, savedInstanceState)
    }

    private fun showView(view: View?) {
        view?.visibility = View.VISIBLE
    }

    private fun hideView(view: View?) {
        view?.visibility = View.GONE
    }

    companion object {

        fun newInstance(): StartFragment {
            return StartFragment().apply {
                arguments = Bundle().apply {
                    // Put arguments here
                }
            }
        }

    }

}