package com.muhsanjaved.databinding_practice.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ReportFragment.Companion.reportFragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.muhsanjaved.databinding_practice.R
import com.muhsanjaved.databinding_practice.adapters.PersonAdapter
import com.muhsanjaved.databinding_practice.databinding.ActivityDynamicBindingBinding
import com.muhsanjaved.databinding_practice.models.User

class DynamicBindingActivity : AppCompatActivity() {
     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//         setContentView(R.layout.activity_dynamic_binding)

         supportActionBar?.title = "dynamic Binding"
         val binding: ActivityDynamicBindingBinding = DataBindingUtil.setContentView(this, R.layout.activity_dynamic_binding)

         binding.rvLogs.layoutManager = LinearLayoutManager(this)
         binding.rvLogs.adapter  = PersonAdapter(User.userList)


    }
}