package com.shubham.joblister.Retrofit

import com.shubham.joblister.Utils.Constants.Companion.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Retrofit {
    var retrofit: Retrofit? = null
    fun getInstance(): Retrofit{
        if(retrofit==null){
            retrofit = Retrofit.Builder().baseUrl(BASE_URL).
                    addConverterFactory(GsonConverterFactory.create()).build()
        }
        return retrofit!!;
    }
}