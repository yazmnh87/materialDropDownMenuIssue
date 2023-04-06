package com.example.materialdesignrepro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.materialdesignrepro.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val incomeTypes = resources.getStringArray(R.array.income_types)
        val incomeTypesAdapter = ArrayAdapter(this, R.layout.incometype_dropdown_item, incomeTypes)
        binding.totalAmtContainer.tvAutoIncomeType.setAdapter(incomeTypesAdapter)
    }
}