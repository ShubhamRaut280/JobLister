package com.shubham.joblister.Retrofit

import com.shubham.joblister.Models.JobResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface JobApi {
    @GET("/jobs/{country}/search")
    fun searchJobs(@Path("country") country: String,
                   @Query("app_id") appid : String,
                   @Query("app_key") appkey : String,
                   @Query("page") page : Int,
                   @Query("results_per_page") resultPerPage : Int,
                   @Query("what") searchKeywords : String

                   ): Call<JobResponse>

}