package com.example.qapptest.UIelement

import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.ExperimentalComposeUiApi

@ExperimentalMaterialApi
@ExperimentalComposeUiApi
@Composable
fun HouseScreens() {
    var shouldShowOnboarding by rememberSaveable { mutableStateOf(true) }
    if(shouldShowOnboarding ){
        //LoginSetting(onContinueClicked = { shouldShowOnboarding = false })
    }
    else
       MainControlCenter()


}