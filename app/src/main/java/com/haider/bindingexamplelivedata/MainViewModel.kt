package com.haider.bindingexamplelivedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    val quoteLiveData = MutableLiveData<String>("What you give is what you get")



    fun updateQupote() {
        quoteLiveData.value = "You'll see it when you believe it"
    }


}
