package com.jake.lifts.vo.google

import com.fasterxml.jackson.annotation.JsonProperty

class ImagesResult {
    @get:JsonProperty("position")
    var position = 0

    @get:JsonProperty("thumbnail")
    var thumbnail: String? = null

    @get:JsonProperty("source")
    var source: String? = null

    @get:JsonProperty("title")
    var title: String? = null

    @get:JsonProperty("link")
    var link: String? = null

    @get:JsonProperty("original")
    var original: String? = null

    @get:JsonProperty("is_product")
    var is_product = false

    @get:JsonProperty("in_stock")
    var in_stock = false
}