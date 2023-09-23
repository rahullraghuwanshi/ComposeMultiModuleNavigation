package com.example.settings_api

import com.example.feature_api.FeatureApi

interface SettingsFeatureApi : FeatureApi {

    val settingsRoute: String
}