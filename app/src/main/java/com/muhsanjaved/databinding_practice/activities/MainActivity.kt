package com.muhsanjaved.databinding_practice.activities

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.muhsanjaved.databinding_practice.R
import com.muhsanjaved.databinding_practice.fragments.ProductListFragment
import com.muhsanjaved.databinding_practice.interfaces.IMainActivity
import com.muhsanjaved.databinding_practice.models.Product

class MainActivity : AppCompatActivity() , IMainActivity{

//    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
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

        //setContentView(R.layout.activity_main)

//        val binding: ActivityMainBinding =DataBindingUtil.setContentView(this, R.layout.activity_main)
//        val binding: ViewDataBinding =DataBindingUtil.setContentView(this, R.layout.activity_main)
//        supportFragmentManager.beginTransaction()
//            .add(R.id.main_fragment_container, MainFragment(), "main_fragment")
//            .commit()

//        binding.rvProducts.layoutManager = GridLayoutManager(this, 2)
//        binding.rvProducts.adapter = ProductsAdapter(this,DataProvider.productList.toList())
//        binding.dataList = DataProvider.productList.toList()

//        binding.setVariable(BR.dataList, DataProvider.productList.toList())

        val fragment = ProductListFragment()

        supportFragmentManager
            .beginTransaction()
            .addToBackStack("Product List Fragment")
            .add(R.id.fragment_container, fragment, "product_list_fragment")
            .commit()

    }

    override fun onProductClick(product: Product) {
        val fragment = ProductListFragment()

        var bundle =Bundle()
        bundle.putParcelable("product_key", product)

        fragment.arguments = bundle

        supportFragmentManager
            .beginTransaction()
            .addToBackStack("Product Detail Fragment")
            .replace(R.id.fragment_container, fragment, "product_detail_fragment")
            .commit()

//        Toast.makeText(this,"Hi From main activity", Toast.LENGTH_SHORT).show()
    }

    override fun onProductImageClick(product: Product) {
        Toast.makeText(this,"${product.name} is Clicked", Toast.LENGTH_SHORT).show()
    }
}