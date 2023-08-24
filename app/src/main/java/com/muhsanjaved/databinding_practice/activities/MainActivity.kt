package com.muhsanjaved.databinding_practice.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.muhsanjaved.databinding_practice.R
import com.muhsanjaved.databinding_practice.databinding.ActivityMainBinding
import com.muhsanjaved.databinding_practice.fragments.MainFragment
import com.muhsanjaved.databinding_practice.viewModels.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        ActivityMainBinding binding = ActivityMainBinding.inflate(LayoutInflater.from(this));
//        setContentView(binding.getRoot());
        //binding.setUser(viewModel.getUser());
        //binding.includedLayout.tvSecond.setText("Thus is second textView");

//        val binding: ActivityMainBinding =
//            DataBindingUtil.setContentView(this, R.layout.activity_main)
//
////        viewModel = ViewModelProviders.of(this).get<MainViewModel>(MainViewModel::class.java)
//        viewModel = ViewModelProviders.of(this@MainActivity)[MainViewModel::class.java]

//        binding.setMainViewModel(viewModel)
//        binding.tvFirst.text = viewModel.user.name
//        binding.tvFirst.append("Muhsan")


        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .add(R.id.main_fragment_container, MainFragment(), "main_fragment")
            .commit()
    }
}