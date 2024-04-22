package com.shubham.joblister.Models

data class JobResponse(
    val __CLASS__: String,
    val count: Int,
    val mean: Int,
    val results: List<Result>
)