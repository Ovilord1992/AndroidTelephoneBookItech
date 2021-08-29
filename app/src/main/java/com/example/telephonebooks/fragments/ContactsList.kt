package com.example.telephonebooks.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.telephonebooks.DOModel.DataModel
import com.example.telephonebooks.R
import com.example.telephonebooks.RecyclerViewAdapter
import com.example.telephonebooks.databinding.FragmentContactsListBinding
import com.example.telephonebooks.model.UserItem

class ContactsList : Fragment(), RecyclerViewAdapter.ClickListener {
    private lateinit var adapter: RecyclerViewAdapter
    val listData: ArrayList<UserItem> = ArrayList()

    private val dataModel: DataModel by activityViewModels()
    lateinit var binding: FragmentContactsListBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = FragmentContactsListBinding.inflate(inflater, container, false)
        buildDisplayData()
        initRecyclerView(binding.root)

        return binding.root
    }

    private fun initRecyclerView(view: View) {
        val recyclerView = view.findViewById<RecyclerView>(R.id.rcView)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        adapter = RecyclerViewAdapter(listData, this)
        recyclerView.adapter = adapter
    }

    private fun buildDisplayData() {
        listData.add(UserItem("id", "VasiliLipinski", "+234984935"))
        listData.add(UserItem("id", "VasiliLipinski", "+234984935"))
        listData.add(UserItem("id", "VasiliLipinski", "+234984935"))
        listData.add(UserItem("id", "VasiliLipinski", "+234984935"))
        listData.add(UserItem("id", "VasiliLipinski", "+234984935"))
        listData.add(UserItem("id", "VasiliLipinski", "+234984935"))
        listData.add(UserItem("id", "VasiliLipinski", "+234984935"))
        listData.add(UserItem("id", "VasiliLipinski", "+234984935"))
        listData.add(UserItem("id", "VasiliLipinski", "+234984935"))
        listData.add(UserItem("id", "VasiliLipinski", "+234984935"))

    }

    companion object {
        @JvmStatic
        fun newInstance() = ContactsList()
    }

    override fun onItemClick(userItem: UserItem) {
        TODO("Not yet implemented")
    }

}