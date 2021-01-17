package com.github.api.ui.api

import com.github.api.ui.data.model.DetailUserResponse
import com.github.api.ui.data.model.User
import com.github.api.ui.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.*

interface Api {
    @GET("search/users")
    @Headers("Authorization: token 06e729f68f3ea2e0f82750255016ee0d2bade4fd")
    fun getSearchUsers(
            @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token 06e729f68f3ea2e0f82750255016ee0d2bade4fd")
    fun getUserDetail(
            @Path("username") username: String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 06e729f68f3ea2e0f82750255016ee0d2bade4fd")
    fun getFollowers(
            @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 06e729f68f3ea2e0f82750255016ee0d2bade4fd")
    fun getFollowing(
            @Path("username") username: String
    ): Call<ArrayList<User>>
}