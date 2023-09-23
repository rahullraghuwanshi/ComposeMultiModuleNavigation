package com.example.onboarding_api

import com.example.feature_api.FeatureApi

interface OnboardingFeatureApi: FeatureApi {

    val route: String
}