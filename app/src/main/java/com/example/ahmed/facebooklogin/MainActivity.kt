package com.example.ahmed.facebooklogin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), TextWatcher {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        logo_image_view.visibility = View.VISIBLE
        logo_image_view.animate()
                .translationY(-550f)
                .scaleX(0.7f)
                .scaleY(0.7f)
                .duration = 1000

        email_edit_text.addTextChangedListener(this)
        password_edit_text.addTextChangedListener(this)

    }

    override fun afterTextChanged(s: Editable?) {
    }

    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
    }

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
        btn_login.isEnabled = email_edit_text.text.isNotEmpty() && password_edit_text.text.isNotEmpty()

    }

}
