package com.example.PutuAdrioPramanaPutra.model

import com.google.gson.annotations.SerializedName
import retrofit2.http.GET

data class Province(
    @SerializedName ("Kode_Provi")
    val code: Int,
    @SerializedName ("Provinsi")
    val province: String,
    @SerializedName ("Kasus_Posi")
    val positive: Int,
    @SerializedName ("Kasus_Semb")
    val recover: Int,
    @SerializedName ("Kasus_Meni")
    val death: Int



)