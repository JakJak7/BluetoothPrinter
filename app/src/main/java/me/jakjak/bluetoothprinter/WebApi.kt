package me.jakjak.bluetoothprinter

import retrofit2.http.GET
import retrofit2.http.Query

interface WebApi {

    @GET("json")
    fun GetUpdates(@Query("offset" ) offset : Long) : UpdateResponse

    class UpdateResponse {

    }
}