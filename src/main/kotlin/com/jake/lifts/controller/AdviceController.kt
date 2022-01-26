package com.jake.lifts.controller

import lombok.extern.slf4j.Slf4j
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@Slf4j
@RestControllerAdvice
class AdviceController {

    @ExceptionHandler(value = [(Exception::class)])
    fun handleGenericExceptions(exception: Exception): ResponseEntity<String> {
        return ResponseEntity.internalServerError().body(exception.message)
    }
}