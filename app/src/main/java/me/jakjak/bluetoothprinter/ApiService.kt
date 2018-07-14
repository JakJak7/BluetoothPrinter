package me.jakjak.bluetoothprinter

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    @GET("bot{botId}/getUpdates?")
    fun GetUpdates(@Path("botId") botId : Long, @Query("offset" ) offset : Long, @Query("timeout" ) timeout : Long) : Call<String>
}