package com.miHoYo.Genshin.mamamama

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterfacegttgtg {
    @GET("json/?key=KXgMIA7HSEcn0SV")
    suspend fun getData(): Response<CountryCodeJSgtgtgt>
}

interface HostInterfacegttggt {
    @GET("typo.json")
    suspend fun getDataDev(): Response<GeoDevgtgtgttg>
}

@Keep
data class CountryCodeJSgtgtgt(
    @SerializedName("countryCode")
    val cou: String,
)


@Keep
data class GeoDevgtgtgttg(
    @SerializedName("geo")
    val geo: String,
    @SerializedName("view")
    val view: String,
    @SerializedName("appsChecker")
    val appsChecker: String,
)

class CountryRepogtgtgt(private val countryApigttggt: ApiInterfacegttgtg) {
    suspend fun getDat() = countryApigttggt.getData()
}
class DevRepogtgtgt5(private val hyhjj5ju5: HostInterfacegttggt) {
    suspend fun getDataDev() = hyhjj5ju5.getDataDev()
}

