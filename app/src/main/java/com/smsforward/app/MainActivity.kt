package com.smsforward.app

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : Activity() {

    private var otpEnabled = false
    private var bankingEnabled = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val statusText = findViewById<TextView>(R.id.statusText)
        val otpButton = findViewById<Button>(R.id.otpButton)
        val bankingButton = findViewById<Button>(R.id.bankingButton)

        otpButton.setOnClickListener {
            otpEnabled = !otpEnabled
            otpButton.text = if (otpEnabled) {
                "OTP Filter: ON"
            } else {
                "OTP Filter: OFF"
            }
        }

        bankingButton.setOnClickListener {
            bankingEnabled = !bankingEnabled
            bankingButton.text = if (bankingEnabled) {
                "Banking Filter: ON"
            } else {
                "Banking Filter: OFF"
            }
        }

        statusText.text = "App is ready"
    }
}
