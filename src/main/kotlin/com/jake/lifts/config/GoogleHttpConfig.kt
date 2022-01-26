package com.jake.lifts.config

import com.jake.lifts.client.GoogleImagesApi
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import retrofit2.Retrofit
import retrofit2.converter.jackson.JacksonConverterFactory


@Configuration
class GoogleHttpConfig {

    @Bean
    fun googleImagesApi(): GoogleImagesApi {

        val interceptor = HttpLoggingInterceptor()
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
        val client = OkHttpClient.Builder().addInterceptor(interceptor).build()

        return Retrofit.Builder()
            .baseUrl("https://serpapi.com/")
            .addConverterFactory(JacksonConverterFactory.create())
            .client(client)
            .build()
            .create(GoogleImagesApi::class.java)
    }
}