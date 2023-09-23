package com.example.home_api

import com.example.feature_api.FeatureApi

interface HomeFeatureApi : FeatureApi {
    val homeRoute: String
}