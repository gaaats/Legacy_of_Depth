package com.miHoYo.Genshin.fkrgtigt

import android.app.Application
import android.content.pm.PackageManager
import android.webkit.WebSettings
import android.webkit.WebView
import androidx.lifecycle.ViewModel
import com.onesignal.OneSignal
import org.json.JSONException
import org.json.JSONObject

class BeamModel(application: Application): ViewModel() {
    val pmgtgttg = application.packageManager
    fun webSetgtgtg(webViewgttggt: WebView): WebSettings{
       val vfbgbhyhyyho = webViewgttggt.settings
        vfbgbhyhyyho.javaScriptEnabled = true
        vfbgbhyhyyho.useWideViewPort = true
        vfbgbhyhyyho.loadWithOverviewMode = true
        vfbgbhyhyyho.allowFileAccess = true
        vfbgbhyhyyho.domStorageEnabled = true
        vfbgbhyhyyho.userAgentString = vfbgbhyhyyho.userAgentString.replace("; wv", "")
        vfbgbhyhyyho.javaScriptCanOpenWindowsAutomatically = true
        vfbgbhyhyyho.setSupportMultipleWindows(false)
        vfbgbhyhyyho.displayZoomControls = false
        vfbgbhyhyyho.builtInZoomControls = true
        vfbgbhyhyyho.allowFileAccess = true
        vfbgbhyhyyho.allowContentAccess = true
        vfbgbhyhyyho.setSupportZoom(true)
        vfbgbhyhyyho.pluginState = WebSettings.PluginState.ON
        vfbgbhyhyyho.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        vfbgbhyhyyho.cacheMode = WebSettings.LOAD_DEFAULT
        vfbgbhyhyyho.allowContentAccess = true
        vfbgbhyhyyho.mediaPlaybackRequiresUserGesture = false
        return vfbgbhyhyyho
    }
    fun frrfrfrfgtgt(dvvffvv: String) {
        OneSignal.setExternalUserId(
            dvvffvv,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(results: JSONObject) {
                    try {
                        if (results.has("push") && results.getJSONObject("push").has("success")) {
                            val tgtgtgthhy = results.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $tgtgtgthhy"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("email") && results.getJSONObject("email").has("success")) {
                            val hhyhyyhjjuuj =
                                results.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $hhyhyyhjjuuj"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("sms") && results.getJSONObject("sms").has("success")) {
                            val gttggthtghgt = results.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $gttggthtghgt"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }



    fun fgrrfggrfrfugfr(uri: String): Boolean {
        try {
            pmgtgttg.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)
            return true
        } catch (_: PackageManager.NameNotFoundException) {

        }
        return false
    }
}