package com.digipod.app3_uiinteraction

import android.graphics.Color
import android.os.Bundle
import android.provider.SyncStateContract.Helpers.update
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var btnRed: Button
    private lateinit var btnYellow: Button
    private lateinit var btnGreen: Button
    private lateinit var update: Button
    private lateinit var textHeader: TextView
    private lateinit var textOut: TextView
    private lateinit var editName: EditText
    private lateinit var wrapper: FrameLayout
    private lateinit var sbFontSize:SeekBar


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnRed= findViewById(R.id.btnRed)
        btnGreen= findViewById(R.id.btnGreen)
        btnYellow= findViewById(R.id.btnYellow)
        update= findViewById(R.id.btnUpdate)
        textHeader= findViewById(R.id.textHeader)
        textOut= findViewById(R.id.textOut)
        editName= findViewById(R.id.editName)
        wrapper= findViewById(R.id.wrapper)
        sbFontSize=findViewById(R.id.sbFontSize)
        textHeader.setTextColor(Color.MAGENTA)
        textHeader.text= "Click on button to change color"
        btnRed.setOnClickListener {
            wrapper.setBackgroundColor(Color.RED)

        }
        btnGreen.setOnClickListener {
            wrapper.setBackgroundColor(Color.GREEN)
        }
        btnYellow.setOnClickListener {
            wrapper.setBackgroundColor(Color.YELLOW)
        }
        update.setOnClickListener {
            textOut.text= editName.text.toString()
            editName.text.clear()
        }
        btnRed.setOnLongClickListener {
            wrapper.setBackgroundColor(Color.WHITE)
            true
        }
        sbFontSize.setOnSeekBarChangeListener(object :SeekBar.OnSeekBarChangeListener
        {
            override fun onProgressChanged(sb: SeekBar?, progress: Int, fromUser: Boolean) {
                textOut.textSize=progress.toFloat()
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }

        })

    }
}