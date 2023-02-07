package com.miHoYo.Genshin.otther.gnttngjnjgt

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.appsflyer.AppsFlyerLib
import com.miHoYo.Genshin.R
import com.miHoYo.Genshin.otther.Utilgtgtgt.hjukiikkiik
import com.miHoYo.Genshin.otther.Utilgtgtgt.hyujujuj
import com.miHoYo.Genshin.otther.Utilgtgtgt.bgnhnh
import com.miHoYo.Genshin.otther.Utilgtgtgt.njjikik
import com.miHoYo.Genshin.otther.Utilgtgtgt.gthyujujuj
import com.miHoYo.Genshin.otther.Utilgtgtgt.nhjukkklool
import com.miHoYo.Genshin.otther.Utilgtgtgt.cvfvf
import com.miHoYo.Genshin.otther.Utilgtgtgt.bgnnhhhh
import com.miHoYo.Genshin.otther.Utilgtgtgt.hyjikiilolol
import com.miHoYo.Genshin.otther.Utilgtgtgt.hjjkii
import com.miHoYo.Genshin.otther.Utilgtgtgt.bgnhhygtgf
import com.miHoYo.Genshin.otther.Utilgtgtgt.nhhyjuujkkk
import com.miHoYo.Genshin.otther.Utilgtgtgt.vvccxxx
import com.miHoYo.Genshin.otther.Utilgtgtgt.jukilool
import com.miHoYo.Genshin.otther.Utilgtgtgt.bgfrdddd
import com.miHoYo.Genshin.otther.Utilgtgtgt.vggtyuuu
import com.miHoYo.Genshin.otther.Utilgtgtgt.hjkkiooop
import com.miHoYo.Genshin.otther.Utilgtgtgt.nhmjjjjjjk
import com.miHoYo.Genshin.otther.gtgthugthugt.GaaammuActivity
import org.koin.android.ext.android.inject
import org.koin.core.qualifier.named


class FfifiifFragment : Fragment() {
    private lateinit var gtgtgtgt: Context
    val sharePgtgtgt: SharedPreferences by inject(named("SharedPreferences"))

    override fun onAttach(context: Context) {
        super.onAttach(context)
        gtgtgtgt = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_ffifiif, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val jukikolollo = sharePgtgtgt.getString(gthyujujuj, null)
        val gthyhyhy = sharePgtgtgt.getString(nhmjjjjjjk, null)
        val hyujjuujuj = sharePgtgtgt.getString("mainId", null)
        val gthyhyujjuj = nhhyjuujkkk
        val vffvfddd = Build.VERSION.RELEASE
        val bgnkhgtjugt = sharePgtgtgt.getString("appCamp", null)
        val bnggtuhgt = sharePgtgtgt.getString("deepSt", null)
        val gngtuhu = sharePgtgtgt.getString(njjikik, null)
        val vntghugt = sharePgtgtgt.getString(hyujujuj, null)

        val cdvdvedftde = sharePgtgtgt.getString(hyjikiilolol, null)
        val vbgfgryg: String? = sharePgtgtgt.getString(nhjukkklool, null)

        val hyjihyjo = Intent(activity, VviviivviActivity2::class.java)
        val gjiotgjgtj = Intent(activity, GaaammuActivity::class.java)

        val gtjgtiihgti = AppsFlyerLib.getInstance().getAppsFlyerUID(gtgtgtgt)
        AppsFlyerLib.getInstance().setCollectAndroidID(true)

        sharePgtgtgt.edit().putString(bgnhnh, gtjgtiihgti).apply()

        Log.d("lolo", "countryDevgttggtgt is ${gngtuhu}")
        Log.d("lolo", "apps22226 is ${vntghugt}")
        Log.d("lolo", "countgtgtgt is ${jukikolollo}")

        val vfbrfyggyrf = "$gthyhyhy$bgfrdddd$bgnkhgtjugt&$bgnhhygtgf$gtjgtiihgti&$hjukiikkiik$hyujjuujuj&$jukilool$gthyhyujjuj&$vvccxxx$vffvfddd&$vggtyuuu$hjjkii"
        val bgngtgtgt = "$gthyhyhy$bgnhhygtgf$cdvdvedftde&$hjukiikkiik$vbgfgryg&$jukilool$gthyhyujjuj&$vvccxxx$vffvfddd&$vggtyuuu$hjjkii"
        val hykhykhyko = "$gthyhyhy$bgfrdddd$bnggtuhgt&$bgnhhygtgf$gtjgtiihgti&$hjukiikkiik$hyujjuujuj&$jukilool$gthyhyujjuj&$vvccxxx$vffvfddd&$vggtyuuu$hjkkiooop"
        val bgngthhugt = "$gthyhyhy$bgfrdddd$bnggtuhgt&$bgnhhygtgf$cdvdvedftde&$hjukiikkiik$vbgfgryg&$jukilool$gthyhyujjuj&$vvccxxx$vffvfddd&$vggtyuuu$hjkkiooop"

        when(vntghugt) {
            "1" ->
                if(bgnkhgtjugt!!.contains(cvfvf)) {
                    sharePgtgtgt.edit().putString(bgnnhhhh, vfbrfyggyrf).apply()
                    sharePgtgtgt.edit().putString("WebInt", "campaign").apply()
                    startActivity(hyjihyjo)
                    activity?.finish()
                } else if (bnggtuhgt!=null||gngtuhu!!.contains(jukikolollo.toString())) {
                    sharePgtgtgt.edit().putString(bgnnhhhh, hykhykhyko).apply()
                    sharePgtgtgt.edit().putString("WebInt", "deepLink").apply()
                    startActivity(hyjihyjo)
                    activity?.finish()
                } else {
                    startActivity(gjiotgjgtj)
                    activity?.finish()
                }
            "0" ->
                if(bnggtuhgt!=null) {
                    sharePgtgtgt.edit().putString(bgnnhhhh, bgngthhugt).apply()
                    sharePgtgtgt.edit().putString("WebInt", "deepLinkNOApps").apply()
                    startActivity(hyjihyjo)
                    activity?.finish()
                } else if (gngtuhu!!.contains(jukikolollo.toString())) {
                    sharePgtgtgt.edit().putString(bgnnhhhh, bgngtgtgt).apply()
                    sharePgtgtgt.edit().putString("WebInt", "geo").apply()
                    startActivity(hyjihyjo)
                    activity?.finish()
                } else {
                    startActivity(gjiotgjgtj)
                    activity?.finish()
                }
        }
    }
}
