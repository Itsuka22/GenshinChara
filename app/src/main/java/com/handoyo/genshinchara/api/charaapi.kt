package com.handoyo.genshinchara.api

import retrofit2.http.GET

interface charaapi {

    @GET("detail")
    suspend fun getnamechar(): CharaData

}