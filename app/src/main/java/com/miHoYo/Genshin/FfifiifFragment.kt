package com.miHoYo.Genshin

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
import com.miHoYo.Genshin.otther.Utilgtgtgt.ad_id589887
import com.miHoYo.Genshin.otther.Utilgtgtgt.appsgtgtgt
import com.miHoYo.Genshin.otther.Utilgtgtgt.aps_id
import com.miHoYo.Genshin.otther.Utilgtgtgt.codeCode565
import com.miHoYo.Genshin.otther.Utilgtgtgt.gt5gtgtCo
import com.miHoYo.Genshin.otther.Utilgtgtgt.instIdgtgt6gt5
import com.miHoYo.Genshin.otther.Utilgtgtgt.hy5hy5hyl
import com.miHoYo.Genshin.otther.Utilgtgtgt.linkaa65565
import com.miHoYo.Genshin.otther.Utilgtgtgt.myIdgt5tg55
import com.miHoYo.Genshin.otther.Utilgtgtgt.namm2265
import com.miHoYo.Genshin.otther.Utilgtgtgt.onegttgtggt
import com.miHoYo.Genshin.otther.Utilgtgtgt.pakkakakatg2t6ggt
import com.miHoYo.Genshin.otther.Utilgtgtgt.subFive26255
import com.miHoYo.Genshin.otther.Utilgtgtgt.subFour226
import com.miHoYo.Genshin.otther.Utilgtgtgt.subOne6555
import com.miHoYo.Genshin.otther.Utilgtgtgt.subSix262565
import com.miHoYo.Genshin.otther.Utilgtgtgt.trololohy5yh5hy
import com.miHoYo.Genshin.otther.Utilgtgtgt.urlMain655665
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
        val countgtgtgt = sharePgtgtgt.getString(gt5gtgtCo, null)
        val wv2262262 = sharePgtgtgt.getString(urlMain655665, null)
        val mainId222622 = sharePgtgtgt.getString("mainId", null)
        val pack2222626 = pakkakakatg2t6ggt
        val buildVers2262 = Build.VERSION.RELEASE
        val appCampgtgtgt = sharePgtgtgt.getString("appCamp", null)
        val deepStgtgtgtgt = sharePgtgtgt.getString("deepSt", null)
        val countryDevgttggtgt = sharePgtgtgt.getString(codeCode565, null)
        val apps22226 = sharePgtgtgt.getString(appsgtgtgt, null)

        val myTr2662226Id = sharePgtgtgt.getString(myIdgt5tg55, null)
        val myInstId262226: String? = sharePgtgtgt.getString(instIdgtgt6gt5, null)

        val hyjihyjo = Intent(activity, VviviivviActivity2::class.java)
        val gjiotgjgtj = Intent(activity, GaaammuActivity::class.java)

        val gtjgtiihgti = AppsFlyerLib.getInstance().getAppsFlyerUID(gtgtgtgt)
        AppsFlyerLib.getInstance().setCollectAndroidID(true)

        sharePgtgtgt.edit().putString(aps_id, gtjgtiihgti).apply()

        Log.d("lolo", "countryDevgttggtgt is ${countryDevgttggtgt}")
        Log.d("lolo", "apps22226 is ${apps22226}")
        Log.d("lolo", "countgtgtgt is ${countgtgtgt}")

        val linkAppsgttggt = "$wv2262262$subOne6555$appCampgtgtgt&$onegttgtggt$gtjgtiihgti&$ad_id589887$mainId222622&$subFour226$pack2222626&$subFive26255$buildVers2262&$subSix262565$namm2265"
        val linkMTgtgtgt = "$wv2262262$onegttgtggt$myTr2662226Id&$ad_id589887$myInstId262226&$subFour226$pack2222626&$subFive26255$buildVers2262&$subSix262565$namm2265"
        val linkFBgttgtg = "$wv2262262$subOne6555$deepStgtgtgtgt&$onegttgtggt$gtjgtiihgti&$ad_id589887$mainId222622&$subFour226$pack2222626&$subFive26255$buildVers2262&$subSix262565$trololohy5yh5hy"
        val linkFBNullAppsgtgtgt = "$wv2262262$subOne6555$deepStgtgtgtgt&$onegttgtggt$myTr2662226Id&$ad_id589887$myInstId262226&$subFour226$pack2222626&$subFive26255$buildVers2262&$subSix262565$trololohy5yh5hy"

        when(apps22226) {
            "1" ->
                if(appCampgtgtgt!!.contains(hy5hy5hyl)) {
                    sharePgtgtgt.edit().putString(linkaa65565, linkAppsgttggt).apply()
                    sharePgtgtgt.edit().putString("WebInt", "campaign").apply()
                    startActivity(hyjihyjo)
                    activity?.finish()
                } else if (deepStgtgtgtgt!=null||countryDevgttggtgt!!.contains(countgtgtgt.toString())) {
                    sharePgtgtgt.edit().putString(linkaa65565, linkFBgttgtg).apply()
                    sharePgtgtgt.edit().putString("WebInt", "deepLink").apply()
                    startActivity(hyjihyjo)
                    activity?.finish()
                } else {
                    startActivity(gjiotgjgtj)
                    activity?.finish()
                }
            "0" ->
                if(deepStgtgtgtgt!=null) {
                    sharePgtgtgt.edit().putString(linkaa65565, linkFBNullAppsgtgtgt).apply()
                    sharePgtgtgt.edit().putString("WebInt", "deepLinkNOApps").apply()
                    startActivity(hyjihyjo)
                    activity?.finish()
                } else if (countryDevgttggtgt!!.contains(countgtgtgt.toString())) {
                    sharePgtgtgt.edit().putString(linkaa65565, linkMTgtgtgt).apply()
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
