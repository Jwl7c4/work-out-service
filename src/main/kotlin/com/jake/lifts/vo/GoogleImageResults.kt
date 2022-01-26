package com.jake.lifts.vo

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

class SearchInformation {
    @get:JsonProperty("image_results_state")
    var image_results_state: String? = null

    @get:JsonProperty("query_displayed")
    var query_displayed: String? = null
}

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

class GoogleImageResults {
    @get:JsonProperty("search_metadata")
    var search_metadata: SearchMetadata? = null

    @get:JsonProperty("search_parameters")
    var search_parameters: SearchParameters? = null

    @get:JsonProperty("search_information")
    var search_information: SearchInformation? = null

    @get:JsonProperty("suggested_searches")
    var suggested_searches: ArrayList<SuggestedSearch>? = null

    @get:JsonProperty("images_results")
    var images_results: ArrayList<ImagesResult>? = null
}