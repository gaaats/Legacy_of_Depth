package com.miHoYo.Genshin.mododoel

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.facebook.applinks.AppLinkData
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.miHoYo.Genshin.mamamama.UHhfrhfrhgrfygrfygfr
import com.miHoYo.Genshin.mamamama.NJnfggtjitgj
import com.miHoYo.Genshin.mamamama.Ndgfgyfrgyrfg
import com.miHoYo.Genshin.mamamama.Lokfrofrrfj
import com.miHoYo.Genshin.otther.Utilgtgtgt.njkiikik
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class JOIjfrfruhrffrhrfhufr(
    private val fnkntgttggtj: NJnfggtjitgj,
    private val vbgdeftdeted: Ndgfgyfrgyrfg,
    private val gtthyyyh: SharedPreferences,
    val gtjiogtjgtj: Application
) : ViewModel() {


    private val gttghyjuujuj = MutableLiveData<UHhfrhfrhgrfygrfygfr>()
    val vbfrfrfgyfrgfrgrfgyfr: LiveData<UHhfrhfrhgrfygrfygfr>
        get() = gttghyjuujuj

    private val gtgtyhyyyhdes = MutableLiveData<Lokfrofrrfj>()
    val fgfrgfrgfr: LiveData<Lokfrofrrfj>
        get() = gtgtyhyyyhdes

    init {
        viewModelScope.launch(Dispatchers.IO) {
            hykhyoykhkyphkyph()
        }
        viewModelScope.launch(Dispatchers.Main) {
            gjtigtiggthgt()
        }
    }

    private val gtgttggt = MutableLiveData<String>()
    val gntgtihgthuugt: LiveData<String>
        get() = gtgttggt

    private val gtihgthhgt = MutableLiveData<String?>()
    val mainId: LiveData<String?>
        get() = gtihgthhgt


    suspend fun gjtigtiggthgt() {
        gttghyjuujuj.postValue(fnkntgttggtj.gth().body())
        vnffrfrgyfrgfr()
    }

    suspend fun vnffrfrgyfrgfr() {
        gtgtyhyyyhdes.postValue(vbgdeftdeted.vnfvbbgt().body())
    }

    fun hykhyoykhkyphkyph() {
        val hykphyypkohy = AdvertisingIdClient(gtjiogtjgtj)
        hykphyypkohy.start()
        val hyjuuj5 = hykphyypkohy.info.id.toString()
        gtihgthhgt.postValue(hyjuuj5)
    }

    fun gntgtiugtuhgtihgu(cont: Context) {
        AppsFlyerLib.getInstance()
            .init(njkiikik, gtjojgtjtgjgtj, gtjiogtjgtj)
        AppsFlyerLib.getInstance().start(cont)
    }

    fun fbDeeegttggtgt(contgtgtgt: Context) {
        AppLinkData.fetchDeferredAppLinkData(
            contgtgtgt
        ) { data: AppLinkData? ->
            data?.let {
                val gtktgtgk = data.targetUri?.host.toString()
                gtthyyyh.edit().putString("deepSt", gtktgtgk).apply()
            }
        }
    }

    private val gtjojgtjtgjgtj = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(data: MutableMap<String, Any>?) {
            val vngthtghjgtgti = data?.get("campaign").toString()
            gtgttggt.postValue(vngthtghjgtgti)

        }

        override fun onConversionDataFail(error: String?) {
        }

        override fun onAppOpenAttribution(data: MutableMap<String, String>?) {
        }

        override fun onAttributionFailure(error: String?) {
        }
    }




}