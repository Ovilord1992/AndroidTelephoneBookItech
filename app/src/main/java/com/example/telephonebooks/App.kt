package com.example.telephonebooks

import android.app.Application
import com.example.telephonebooks.model.UserService

class App: Application() {
    val UserService = UserService()
}