package com.jake.lifts.vo

import com.fasterxml.jackson.annotation.JsonProperty
import com.jake.lifts.vo.google.ImagesResult

data class WorkOuts(
    @JsonProperty("work_out_name") var workOutName: String,
    @JsonProperty("primary_muscle_group") var primaryMuscleGroup: String,
    @JsonProperty("secondary_muscle_group") var secondaryMuscleGroup: String,
    @JsonProperty("google_info") var googleInfo: ArrayList<ImagesResult>?
)
