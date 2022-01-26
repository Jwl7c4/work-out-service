package com.jake.lifts.vo.google

import com.fasterxml.jackson.annotation.JsonProperty

class SearchParameters {
    @get:JsonProperty("engine")
    var engine: String? = null

    @get:JsonProperty("q")
    var q: String? = null

    @get:JsonProperty("google_domain")
    var google_domain: String? = null

    @get:JsonProperty("ijn")
    var ijn: String? = null

    @get:JsonProperty("device")
    var device: String? = null

    @get:JsonProperty("tbm")
    var tbm: String? = null
}