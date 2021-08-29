package com.example.telephonebooks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.fragment.app.Fragment
import com.example.telephonebooks.DOModel.DataModel
import com.example.telephonebooks.databinding.ActivityMainBinding
import com.example.telephonebooks.fragments.AddNewContact
import com.example.telephonebooks.fragments.ContactsList

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val dataModel: DataModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        openFrag(ContactsList())

        //observer
        dataModel.contact.observe(this, {})
    }

    private fun openFrag(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.place_holder, fragment)
            .commit()
    }
}