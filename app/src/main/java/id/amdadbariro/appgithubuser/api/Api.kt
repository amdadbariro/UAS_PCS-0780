package id.amdadbariro.appgithubuser.api

import id.amdadbariro.appgithubuser.data.model.DetailUserResponse
import id.amdadbariro.appgithubuser.data.model.User
import id.amdadbariro.appgithubuser.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token a4d738392d46cdaf301af41dd4c5ed9eda26cc6c")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token a4d738392d46cdaf301af41dd4c5ed9eda26cc6c")
    fun getUserDetail(
        @Path("username") username : String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token a4d738392d46cdaf301af41dd4c5ed9eda26cc6c")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token a4d738392d46cdaf301af41dd4c5ed9eda26cc6c")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}