package app.money.exchange.connection

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object Retroservices {

    var usd = "https://api.exchangerate-api.com/v4/latest/"
    var usds = "https://api.exchangerate-api.com/v4/"

    fun retrofits(url: String): api? {

        val client = OkHttpClient.Builder()
            .connectTimeout(15, TimeUnit.SECONDS)
            .readTimeout(15, TimeUnit.SECONDS).build()

        val retrofit = Retrofit.Builder()
            .baseUrl(url).client(client)
            .addConverterFactory(GsonConverterFactory.create()) //Here we are using the GsonConverterFactory to directly convert json data to object
            .build()
        return retrofit.create(api::class.java)
    }
}