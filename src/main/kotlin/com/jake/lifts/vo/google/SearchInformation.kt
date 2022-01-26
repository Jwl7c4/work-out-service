package com.jake.lifts.vo.google

import com.fasterxml.jackson.annotation.JsonProperty

class SearchInformation {
    @get:JsonProperty("image_results_state")
    var image_results_state: String? = null

    @get:JsonProperty("query_displayed")
    var query_displayed: String? = null
}