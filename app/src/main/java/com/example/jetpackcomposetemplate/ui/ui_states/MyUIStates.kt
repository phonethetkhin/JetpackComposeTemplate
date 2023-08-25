package com.example.jetpackcomposetemplate.ui.ui_states


data class MyUIStates(
    val userInput: String = "",
    val isUserInputEmpty: Boolean = false,

    val showLoadingDialog: Boolean = false,
    val errorMessage: String = "",
    val showAlertDialog: Boolean = false,

//    val myAPIResponse: MyResponseModel? = null,
)