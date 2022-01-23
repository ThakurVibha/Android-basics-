package com.example.crypton.kotlinbasics.sharedpreference

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.crypton.R
import kotlinx.android.synthetic.main.activity_shared_preference.*

class SharedPreferenceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_preference)
        var sharedPref: SharedPreferences = getSharedPreferences("pref1", Context.MODE_PRIVATE)
        var editor = sharedPref.edit()

        //writing data from editext to sharedpref object
        btnSave.setOnClickListener {
            var name = edtName.text.toString()
            var age = edtAge.text.toString().toInt()
            var check = checkBox.isChecked
            editor.apply {
                putString("name", name)
                putInt("age", age)
                putBoolean("isAdult", check)

            }.apply()

            btnSave.setOnClickListener {
                var mame=sharedPref.getString("name", null)
                Log.e("name", "onCreate: $mame")
//                var age=sharedPref.getInt("age", 0)
//                var isAdult=sharedPref.getBoolean("isAdult", false)
//                edtName.setText(name)
//                edtAge.setText(age)
//                checkBox.isChecked= isAdult
            }

        }
    }
}