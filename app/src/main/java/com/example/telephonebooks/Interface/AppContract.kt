package com.example.telephonebooks.Interface

import androidx.fragment.app.Fragment
import com.example.telephonebooks.model.UserItem
import com.example.telephonebooks.model.UserService

fun Fragment.contract(): AppContract = requireActivity() as AppContract

interface AppContract {
    val userService: UserService

    fun launchUserDetailsScreen(userItem: UserItem)

}