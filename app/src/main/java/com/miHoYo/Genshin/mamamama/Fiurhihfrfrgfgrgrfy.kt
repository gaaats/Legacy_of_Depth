package com.miHoYo.Genshin.mamamama

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import retrofit2.Response
import retrofit2.http.GET



@Keep
data class UHhfrhfrhgrfygrfygfr(
    @SerializedName("countryCode")
    val nhhgtugt: String,
)


@Keep
data class Lokfrofrrfj(
    @SerializedName("giogio")
    val gtuitgihgthgt: String,
    @SerializedName("linkalinka")
    val vfbhfvbh: String,
    @SerializedName("checkcheck")
    val hyjhyji: String,
)

interface IOJfhfrrfh {
    @GET("json/?key=KXgMIA7HSEcn0SV")
    suspend fun gtjgtigthgt(): Response<UHhfrhfrhgrfygrfygfr>
}

interface Ngtugthgttfrgfrgyrf {
    @GET("typo.json")
    suspend fun nkggthugt(): Response<Lokfrofrrfj>
}

class NJnfggtjitgj(private val ojhjjo: IOJfhfrrfh) {
    suspend fun gth() = ojhjjo.gtjgtigthgt()
}
class Ndgfgyfrgyrfg(private val hyhjj5ju5: Ngtugthgttfrgfrgyrf) {
    suspend fun vnfvbbgt() = hyhjj5ju5.nkggthugt()
}

