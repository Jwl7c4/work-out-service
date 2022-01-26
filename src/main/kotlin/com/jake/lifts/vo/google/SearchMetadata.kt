package com.jake.lifts.vo.google

import com.fasterxml.jackson.annotation.JsonProperty

class SearchMetadata {
    @get:JsonProperty("id")
    var id: String? = null

    @get:JsonProperty("status")
    var status: String? = null

    @get:JsonProperty("json_endpoint")
    var json_endpoint: String? = null

    @get:JsonProperty("created_at")
    var created_at: String? = null

    @get:JsonProperty("processed_at")
    var processed_at: String? = null

    @get:JsonProperty("google_url")
    var google_url: String? = null

    @get:JsonProperty("raw_html_file")
    var raw_html_file: String? = null

    @get:JsonProperty("total_time_taken")
    var total_time_taken = 0.0
}