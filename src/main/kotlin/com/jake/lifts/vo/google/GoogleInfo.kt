package com.jake.lifts.vo.google

import com.google.gson.annotations.SerializedName

data class GoogleInfo(
    @SerializedName("thumbnail") var thumbnail: String,
    @SerializedName("source") var source: String,
    @SerializedName("title") var title: String,
    @SerializedName("link") var link: String,
    @SerializedName("original") var original: String
)
