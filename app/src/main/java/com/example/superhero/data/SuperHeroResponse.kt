package com.example.superhero.data

import com.google.gson.annotations.SerializedName

data class SuperheroResponse (
    @SerializedName ("response") val response: String,
    @SerializedName ("results-for") val resultsFor: String,
    @SerializedName ("results") val results: List<Superhero>
) { }

data class Superhero (
    @SerializedName ("id") val id: String,
    @SerializedName ("name") val name: String,
) { }