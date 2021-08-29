package com.example.telephonebooks.DOModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

open class DataModel: ViewModel() {
    val contact: MutableLiveData <String> by lazy {
        MutableLiveData<String>()
    }
}