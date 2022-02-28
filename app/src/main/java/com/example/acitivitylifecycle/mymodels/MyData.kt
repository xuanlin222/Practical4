package com.example.acitivitylifecycle.mymodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyData : ViewModel(){
    var name = MutableLiveData<String>()
    var age = MutableLiveData<Int>()


}