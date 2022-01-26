package com.jake.lifts.client

import com.jake.lifts.vo.GoogleImageResults
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface GoogleImagesApi {

    @GET("search")
    @Headers("Content-Type: application/json")
    fun callImages(
        @Query("q") queryString: String,
        @Query("tbm") notSure: String,
        @Query("ijn") pageNumber: String,
        @Query("api_key") apiKey: String
    ): Call<GoogleImageResults>
}