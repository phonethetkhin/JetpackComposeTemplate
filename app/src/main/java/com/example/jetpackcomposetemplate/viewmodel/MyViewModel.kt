package com.example.jetpackcomposetemplate.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import com.example.jetpackcomposetemplate.repository.MyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MyViewModel @Inject constructor(
    private val repository: MyRepository,
    private val application: Application,

    ) : ViewModel() {
    /* private val _uiStates = MutableStateFlow(AstronomyUIStates())
     val uiStates = _uiStates.asStateFlow()

     fun isUserInputEmpty() {
         _uiStates.update { it.copy(cityNameEmpty = true) }
     }

     fun toggleUserInputChanged(cityName: String) {

         _uiStates.update { it.copy(cityNameEmpty = false, cityName = cityName) }
     }

     fun setUserInputInstantly(date: String) {
         _uiStates.update { it.copy(dateEmpty = false, dateName = date) }
     }

     *//*  fun showDetailDialog(showDialog: Boolean, clickedItem: SearchResponseModel? = null) {
          _uiStates.update { it.copy(showAlertDialog = showDialog, clickedItem = clickedItem) }
      }*//*

    fun getMyFunction(
        query: String,
        date: String,
    ) {
        _uiStates.update { it.copy(errorMessage = "", astronomyResponse = null) }
        repository.getMyFunction(query, date).onEach { remoteResource ->
            when (remoteResource) {
                is RemoteResource.Loading ->
                    _uiStates.update {
                        it.copy(showLoadingDialog = true)
                    }

                is RemoteResource.Success -> {
                    if (remoteResource.data.body() == null) {
                        _uiStates.update {
                            it.copy(
                                showLoadingDialog = false,
                                errorMessage = "There is no relevant data!"

                            )
                        }
                    } else {
                        _uiStates.update {
                            it.copy(
                                showLoadingDialog = false,
                                astronomyResponse = remoteResource.data.body(),
                                errorMessage = ""
                            )
                        }
                    }
                }

                is RemoteResource.Failure -> {
                    _uiStates.update {
                        it.copy(
                            showLoadingDialog = false,
                            errorMessage = "Something went wrong, : ${remoteResource.errorMessage}"
                        )
                    }
                }
            }
        }.launchIn(viewModelScope)
    }*/
}
