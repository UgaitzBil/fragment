package com.example.fragment.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.fragment.R
import com.example.fragment.databinding.ActivityMainBinding
import com.example.fragment.fragments.HomeFragment
import com.example.fragment.fragments.ProfileFragment
import com.example.fragment.fragments.SupportFragment

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction().add(R.id.framenContainer, HomeFragment()).commit()

        binding.botmenu.setOnItemSelectedListener {

            when (it.itemId) {


                R.id.action_create_product -> supportFragmentManager.beginTransaction()
                    .replace(R.id.framenContainer, SupportFragment()).commit()

                R.id.action_update_product -> supportFragmentManager.beginTransaction()
                    .replace(R.id.framenContainer, ProfileFragment()).commit()

                R.id.action_log_out -> finish()
                R.id.action_go_out -> finishAffinity()
            }
            true
        }
        }
    }
