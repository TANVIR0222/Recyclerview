package com.example.recyclerviwe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerviwe.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        
        var userAdapter=UserAdapter(DataSource.userList)
        
        binding.UseRcv.adapter = userAdapter
        
        
       
    }
    
}