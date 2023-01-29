package com.miHoYo.Genshin.mododoel

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.appsflyer.AFInAppEventParameterName
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.facebook.applinks.AppLinkData
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.miHoYo.Genshin.mamamama.CountryCodeJSgtgtgt
import com.miHoYo.Genshin.mamamama.CountryRepogtgtgt
import com.miHoYo.Genshin.mamamama.DevRepogtgtgt5
import com.miHoYo.Genshin.mamamama.GeoDevgtgtgttg
import com.miHoYo.Genshin.otther.Utilgtgtgt.aaaaapsssKeegt5gt5
import io.branch.referral.util.BRANCH_STANDARD_EVENT
import io.branch.referral.util.BranchEvent
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class ViModgtgtgt(
    private val fnkntgttggtj: CountryRepogtgtgt,
    private val devRepogt5tg5gtgt5: DevRepogtgtgt5,
    private val gtthyyyh: SharedPreferences,
    val gtjiogtjgtj: Application
) : ViewModel() {



    private val gttghyjuujuj = MutableLiveData<CountryCodeJSgtgtgt>()
    val countryCode: LiveData<CountryCodeJSgtgtgt>
        get() = gttghyjuujuj

    private val gtgtyhyyyhdes = MutableLiveData<GeoDevgtgtgttg>()
    val geo: LiveData<GeoDevgtgtgttg>
        get() = gtgtyhyyyhdes

    init {
        viewModelScope.launch(Dispatchers.IO) {
            hykhyoykhkyphkyph()
        }
        viewModelScope.launch(Dispatchers.Main) {
            getDatagttggtgt()
        }
    }

    private val gtgttggt = MutableLiveData<String>()
    val appsDatatggttggt: LiveData<String>
        get() = gtgttggt

    private val _mainIdgtgtgt = MutableLiveData<String?>()
    val mainId: LiveData<String?>
        get() = _mainIdgtgtgt


    suspend fun getDatagttggtgt() {
        gttghyjuujuj.postValue(fnkntgttggtj.getDat().body())
        getDevDatagttggtgt()
    }

    suspend fun getDevDatagttggtgt() {
        gtgtyhyyyhdes.postValue(devRepogt5tg5gtgt5.getDataDev().body())
    }

    fun conversgthyyh(cont: Context) {
        AppsFlyerLib.getInstance()
            .init(aaaaapsssKeegt5gt5, gtjojgtjtgjgtj, gtjiogtjgtj)
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

            when (data?.get(AFInAppEventParameterName.AF_CHANNEL).toString()) {
                "ACI_Search" -> {
                    BranchEvent(BRANCH_STANDARD_EVENT.ACHIEVE_LEVEL).setDescription("ACI_Search")
                        .logEvent(gtjiogtjgtj.applicationContext)

                }
                "ACI_Youtube" -> {
                    BranchEvent(BRANCH_STANDARD_EVENT.SHARE).setDescription("ACI_Youtube")
                        .logEvent(gtjiogtjgtj.applicationContext)


                }
                "ACI_Display" -> {
                    BranchEvent(BRANCH_STANDARD_EVENT.RATE).setDescription("ACI_Display")
                        .logEvent(gtjiogtjgtj.applicationContext)

                }

                else -> {

                    BranchEvent(BRANCH_STANDARD_EVENT.VIEW_AD).setDescription("NoChannel")
                        .logEvent(gtjiogtjgtj.applicationContext)
                    Log.d("Branch Check", "I'm here, branch bitch! No source though")
                }

            }

        }

        override fun onConversionDataFail(error: String?) {
        }

        override fun onAppOpenAttribution(data: MutableMap<String, String>?) {
        }

        override fun onAttributionFailure(error: String?) {
        }
    }


    fun hykhyoykhkyphkyph() {
        val hykphyypkohy = AdvertisingIdClient(gtjiogtjgtj)
        hykphyypkohy.start()
        val idUserAdvertising959 = hykphyypkohy.info.id.toString()
        _mainIdgtgtgt.postValue(idUserAdvertising959)
    }

}