package com.example.perfectoperritos.network

import com.squareup.moshi.Json

data class DogPhoto(
    @Json(name = "message") val message: String?,
    @Json(name = "status") val statusResponse: String?,
    )
