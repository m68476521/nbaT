package com.m68476521.nbat.repository

import javax.inject.Inject

open class ApiRepository @Inject constructor(private val apiService: ApiService) {
    // TODO remove this hardCoded
    open suspend fun getSessions() = apiService.getSeasons()
}