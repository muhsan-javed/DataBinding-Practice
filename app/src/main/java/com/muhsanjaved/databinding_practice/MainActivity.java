package com.muhsanjaved.databinding_practice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.LayoutInflater;

import com.muhsanjaved.databinding_practice.databinding.ActivityMainBinding;
import com.muhsanjaved.databinding_practice.viewModels.MainViewModel;

public class MainActivity extends AppCompatActivity {

    private MainViewModel viewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        ActivityMainBinding binding = ActivityMainBinding.inflate(LayoutInflater.from(this));4
//        setContentView(binding.getRoot());
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        viewModel = ViewModelProviders.of(this).get(MainViewModel.class);
//        binding.setUser(viewModel.getUser());
//        binding.includedLayout.tvSecond.setText("Thus is sceond textView");
        binding.setMainViewModel(viewModel);



    }
}