package com.jake.lifts.controller

import com.jake.lifts.client.GoogleImagesApi
import com.jake.lifts.vo.WorkOuts
import lombok.extern.slf4j.Slf4j
import org.springframework.beans.factory.annotation.Value
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import java.util.*

@Slf4j
@RestController
class LiftController(@Value("\${value.from.file}") val apiKey: String, val googleImagesApi: GoogleImagesApi) {

    @GetMapping("/workOuts")
    @ResponseStatus(HttpStatus.OK)
    fun getLifts(): List<WorkOuts> {

        val list = googleImagesApi.callImages(
            "Bench Press",
            "isch",
            "0",
            apiKey
        )


        val listExecuted = list.execute().body()

        val workOuts = ArrayList<WorkOuts>()
        workOuts.add(WorkOuts("Bench Press", "Chest", "Triceps", listExecuted?.images_results))

        return workOuts;
    }
}