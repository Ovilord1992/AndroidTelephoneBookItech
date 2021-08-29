package com.example.telephonebooks.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.telephonebooks.R

class ViewContacts : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_view_contacts, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance() = ViewContacts()
    }
}