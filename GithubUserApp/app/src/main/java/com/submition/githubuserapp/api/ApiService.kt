package com.submition.githubuserapp.api

import com.Dicoding.appgithubuser.model.ResponseDetailUser
import com.Dicoding.appgithubuser.model.ResponseSearch
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    @GET("search/users")
    @Headers("Authorization: token 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")
    fun search(
        @Query("q") username: String,
        @Query("page") page: Int,
        @Query("per_page") perPage: Int
    ): Call<ResponseSearch>

    @GET("users/{username}")
    @Headers("Authorization: token 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")
    fun detailUser(
        @Path("username") username: String
    ): Call<ResponseDetailUser>
    @GET("users/{username}/followers")
    @Headers("Authorization: token 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")
    fun followers(
        @Path("username") username: String,
        @Query("page") page: Int,
        @Query("per_page") perPage: Int
    ): Call<ArrayList<ResponseDetailUser>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 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")
    fun following(
        @Path("username") username: String,
        @Query("page") page: Int,
        @Query("per_page") perPage: Int
    ): Call<ArrayList<ResponseDetailUser>>
}