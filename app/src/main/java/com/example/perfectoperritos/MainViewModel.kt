package com.example.perfectoperritos

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.perfectoperritos.network.DogPhoto
import com.example.perfectoperritos.network.DogPhotoApi
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {
    private val _apiResponse = MutableLiveData<DogPhoto>()
    val apiResponse: LiveData<DogPhoto> = _apiResponse

    init {
        getRandomDog()

    }

    fun getRandomDog(){
        viewModelScope.launch {

            _apiResponse.value = DogPhotoApi.retrofitService.getRandomPhoto()
        }
    }


}





