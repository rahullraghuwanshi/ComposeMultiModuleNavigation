package com.example.myapplication.main.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.dependencyprovider.DependencyProvider
import com.example.feature_api.register

@Composable
fun AppNavGraph(
    modifier: Modifier = Modifier,
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = DependencyProvider.onboardingFeature().route
    ) {
        register(
            DependencyProvider.homeFeature(),
            navController = navController,
            modifier = modifier
        )

        register(
            DependencyProvider.settingsFeature(),
            navController = navController,
            modifier = modifier
        )

        register(
            DependencyProvider.onboardingFeature(),
            navController = navController,
            modifier = modifier
        )
    }
}