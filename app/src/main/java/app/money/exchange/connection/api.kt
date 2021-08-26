package app.money.exchange.connection

import app.money.exchange.model.Rates
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface api {

    @GET("latest/{country}")
    suspend fun getCurrency(@Path("country") country : String): Rates

    @GET("USD")
    suspend fun getAll(): Rates
}