package com.Dicoding.appgithubuser.model

import com.google.gson.annotations.SerializedName

data class ResponseDetailUser(

    @field:SerializedName("login")
    val login: String,

    @field:SerializedName("id")
    val id: Int,

    @field:SerializedName("node_id")
    val node_id: String,

    @field:SerializedName("avatar_url")
    val avatar_url: String,

    @field:SerializedName("gravatar_id")
    val gravatar_id: String,

    @field:SerializedName("url")
    val url: String,

    @field:SerializedName("html_url")
    val html_url: String,

    @field:SerializedName("followers_url")
    val followers_url: String,

    @field:SerializedName("following_url")
    val following_url: String,

    @field:SerializedName("gists_url")
    val gists_url: String,

    @field:SerializedName("starred_url")
    val starred_url: String,

    @field:SerializedName("subscriptions_url")
    val subscriptions_url: String,

    @field:SerializedName("organizations_url")
    val organizations_url: String,

    @field:SerializedName("repos_url")
    val repos_url: String,

    @field:SerializedName("events_url")
    val events_url: String,

    @field:SerializedName("received_events_url")
    val received_events_url: String,

    @field:SerializedName("type")
    val type: String,

    @field:SerializedName("site_admin")
    val site_admin: Boolean,

    @field:SerializedName("name")
    val name: String,

    @field:SerializedName("company")
    val company: String,

    @field:SerializedName("blog")
    val blog: String,

    @field:SerializedName("location")
    val location: String,

    @field:SerializedName("email")
    val email: String,

    @field:SerializedName("hireable")
    val hireable: String,

    @field:SerializedName("bio")
    val bio: String,

    @field:SerializedName("twitter_username")
    val twitter_username: String,

    @field:SerializedName("public_repos")
    val public_repos: String,

    @field:SerializedName("public_gists")
    val public_gists: String,

    @field:SerializedName("followers")
    val followers: String,

    @field:SerializedName("following")
    val following: String,

    @field:SerializedName("created_at")
    val created_at: String,

    @field:SerializedName("updated_at")
    val updated_at: String
)
