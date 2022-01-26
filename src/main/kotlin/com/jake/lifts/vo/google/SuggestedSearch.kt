package com.jake.lifts.vo.google

import com.fasterxml.jackson.annotation.JsonProperty

class SuggestedSearch {
    @get:JsonProperty("name")
    var name: String? = null

    @get:JsonProperty("link")
    var link: String? = null

    @get:JsonProperty("chips")
    var chips: String? = null

    @get:JsonProperty("serpapi_link")
    var serpapi_link: String? = null

    @get:JsonProperty("thumbnail")
    var thumbnail: String? = null
}