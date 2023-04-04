package com.muhsanjaved.databinding_practice.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.databinding.adapters.ViewBindingAdapter
import com.muhsanjaved.databinding_practice.R
import com.muhsanjaved.databinding_practice.databinding.ActivityMainEventBinding
import com.muhsanjaved.databinding_practice.fragments.MainFragment

class MainEventActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_event)
        // Types of Binding
        // 1. Automatic Binding
        // 2. renamed Binding
        // 3. Custom Binding
//        val binding :ActivityMainEventBinding =
//            DataBindingUtil.setContentView(this, R.layout.activity_main_event)

        // 1. Method References
        // 2. Listener Binding
//        ViewBindingAdapter
//        binding.listener = MyClickHandler()
//        binding.listener = this

        val fragment = MainFragment()
        supportFragmentManager.beginTransaction()
            .add(R.id.main_fragment_container, fragment, "main_fragment")
            .commit()

    }

//    fun runCode(v: View?) {
//        Toast.makeText(v?.context,"Hello Run Code", Toast.LENGTH_SHORT).show()
//    }

}

/*
class MyClickHandler : View.OnClickListener{
    override fun onClick(v: View?) {
        Toast.makeText(v?.context,"Hello", Toast.LENGTH_SHORT).show()
    }
}*/
