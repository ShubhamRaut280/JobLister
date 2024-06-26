package com.shubham.joblister.Models

data class Result(
    val __CLASS__: String,
    val adref: String,
    val category: Category,
    val company: Company,
    val contract_time: String,
    val contract_type: String,
    val created: String,
    val description: String,
    val id: String,
    val latitude: Double,
    val location: Location,
    val longitude: Double,
    val redirect_url: String,
    val salary_is_predicted: String,
    val title: String
)