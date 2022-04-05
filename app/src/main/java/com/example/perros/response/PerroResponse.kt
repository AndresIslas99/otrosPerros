package com.example.perros.response

import com.google.gson.annotations.SerializedName

data class PerroResponse(
    @SerializedName("status") var status: String,
    @SerializedName("message") var imagenes: List<String>)
