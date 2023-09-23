package com.example.myapplication.main.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.view.WindowCompat
import com.example.dependencyprovider.DependencyProvider
import com.example.home_impl.navigation.HomeFeatureImpl
import com.example.myapplication.ui.theme.MyApplicationTheme
import com.example.onboarding_impl.navigation.OnboardingFeatureImpl
import com.example.settings_impl.navigation.SettingsFeatureImpl

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        WindowCompat.setDecorFitsSystemWindows(window, true)

        DependencyProvider.provideImpl(
            homeFeatureApi = HomeFeatureImpl(),
            settingsFeatureApi = SettingsFeatureImpl(),
            onboardingFeatureApi = OnboardingFeatureImpl()
        )


        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    AppContent()
                }
            }
        }
    }
}

