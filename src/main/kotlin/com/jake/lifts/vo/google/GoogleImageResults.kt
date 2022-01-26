package com.jake.lifts.vo.google

import com.fasterxml.jackson.annotation.JsonProperty

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