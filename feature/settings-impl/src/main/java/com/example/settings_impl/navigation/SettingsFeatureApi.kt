package com.example.settings_impl.navigation

import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.settings_api.SettingsFeatureApi
import com.example.settings_impl.presentation.SettingsScreen

class SettingsFeatureImpl : SettingsFeatureApi {

    override val settingsRoute: String = "settings"

    override fun registerGraph(
        navGraphBuilder: NavGraphBuilder,
        navController: NavHostController,
        modifier: Modifier
    ) {
        navGraphBuilder.composable(settingsRoute) {
            SettingsScreen(modifier = modifier)
        }
    }
}