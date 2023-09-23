package com.example.dependencyprovider

import com.example.home_api.HomeFeatureApi
import com.example.onboarding_api.OnboardingFeatureApi
import com.example.settings_api.SettingsFeatureApi

object DependencyProvider {

    /* Don't use lateinit in real project :) */
    private lateinit var homeFeatureApi: HomeFeatureApi
    private lateinit var settingsFeatureApi: SettingsFeatureApi
    private lateinit var onboardingFeatureApi: OnboardingFeatureApi

    fun provideImpl(
        homeFeatureApi: HomeFeatureApi,
        settingsFeatureApi: SettingsFeatureApi,
        onboardingFeatureApi: OnboardingFeatureApi
    ) {
        this.homeFeatureApi = homeFeatureApi
        this.settingsFeatureApi = settingsFeatureApi
        this.onboardingFeatureApi = onboardingFeatureApi
    }

    fun homeFeature(): HomeFeatureApi = homeFeatureApi

    fun settingsFeature(): SettingsFeatureApi = settingsFeatureApi

    fun onboardingFeature(): OnboardingFeatureApi = onboardingFeatureApi
}