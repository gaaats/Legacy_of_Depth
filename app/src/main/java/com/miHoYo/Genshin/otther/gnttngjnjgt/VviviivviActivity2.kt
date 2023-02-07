package com.miHoYo.Genshin.otther.gnttngjnjgt

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.os.Handler
import android.os.Looper
import android.provider.MediaStore
import android.util.Log
import android.webkit.*
import android.widget.Toast
import com.miHoYo.Genshin.databinding.ActivityVviviivvi2Binding
import com.miHoYo.Genshin.fkrgtigt.JOIFrrfhhrffr
import com.miHoYo.Genshin.otther.Utilgtgtgt.bgnhnh
import com.miHoYo.Genshin.otther.Utilgtgtgt.bgnnhhhh
import com.miHoYo.Genshin.otther.Utilgtgtgt.hyjikiilolol
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.qualifier.named
import java.io.File
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*

class VviviivviActivity2 : AppCompatActivity() {
    private lateinit var bgthgthgthugt: ActivityVviviivvi2Binding
    lateinit var jfrjrfjfrrfrfhfrh: WebView
    private var ngthugtuhgthugt: ValueCallback<Array<Uri>>? = null
    private var vbfvbfbfrrfhrf: String? = null
    private val INPUT_FILE_REQUEST_CODE = 1

    private val gtjojtjjhyjhjyi by viewModel<JOIFrrfhhrffr>(
        named("BeamModel")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bgthgthgthugt = ActivityVviviivvi2Binding.inflate(layoutInflater)
        jfrjrfjfrrfrfhfrh = WebView(this)
        setContentView(jfrjrfjfrrfrfhfrh)
        CookieManager.getInstance().setAcceptCookie(true)
        CookieManager.getInstance().setAcceptThirdPartyCookies(jfrjrfjfrrfrfhfrh, true)
        gtjojtjjhyjhjyi.webSetgtgtg(jfrjrfjfrrfrfhfrh)

        jfrjrfjfrrfrfhfrh.webViewClient = IJfrrfhrfhhrfhrf()
        jfrjrfjfrrfrfhfrh.webChromeClient = HUfhrrfgygfrgfr()
        jfrjrfjfrrfrfhfrh.loadUrl(hyhyhyjuujuj())
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {

        if (requestCode != INPUT_FILE_REQUEST_CODE || ngthugtuhgthugt == null) {
            super.onActivityResult(requestCode, resultCode, data)
            return
        }
        var hjjhyiyhjhyjjhy: Array<Uri>? = null

        if (resultCode == RESULT_OK) {
            if (data == null) {
                if (vbfvbfbfrrfhrf != null) {
                    hjjhyiyhjhyjjhy = arrayOf(Uri.parse(vbfvbfbfrrfhrf))
                }
            } else {
                val fruigedtfdeed = data.dataString
                if (fruigedtfdeed != null) {
                    hjjhyiyhjhyjjhy = arrayOf(Uri.parse(fruigedtfdeed))
                }
            }
        }
        ngthugtuhgthugt!!.onReceiveValue(hjjhyiyhjhyjjhy)
        ngthugtuhgthugt = null
        return
    }

    inner class IJfrrfhrfhhrfhrf : WebViewClient() {
        override fun shouldOverrideUrlLoading(view: WebView?, url: String): Boolean {
            try {
                if (URLUtil.isNetworkUrl(url)) {
                    return false
                }
                if (gtjojtjjhyjhjyi.fgrrfggrfrfugfr(url)) {

                    val gtijtjgjgtjtggt = Intent(Intent.ACTION_VIEW)
                    gtijtjgjgtjtggt.data = Uri.parse(url)
                    startActivity(gtijtjgjgtjtggt)
                } else {

                    Toast.makeText(
                        applicationContext,
                        "Application is not installed",
                        Toast.LENGTH_LONG
                    ).show()
                    startActivity(
                        Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                        )
                    )
                }
                return true
            } catch (e: Exception) {
                return false
            }
        }

        override fun onPageFinished(view: WebView?, url: String?) {
            super.onPageFinished(view, url)
            gtgjitjtiojgtgt(url)
        }


        override fun onReceivedError(
            view: WebView?,
            errorCode: Int,
            description: String?,
            failingUrl: String?
        ) {
            Toast.makeText(this@VviviivviActivity2, description, Toast.LENGTH_SHORT).show()
        }
    }


    inner class HUfhrrfgygfrgfr : WebChromeClient() {

        override fun onShowFileChooser(
            view: WebView?,
            filePath: ValueCallback<Array<Uri>>?,
            fileChooserParams: FileChooserParams?
        ): Boolean {
            ngthugtuhgthugt?.onReceiveValue(null)
            ngthugtuhgthugt = filePath
            var vbffrggrfygfrgyrf: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            if (vbffrggrfygfrgyrf!!.resolveActivity(packageManager) != null) {
                var gtjgtijgtji: File? = null
                try {
                    gtjgtijgtji = vngthgtigtih()
                    vbffrggrfygfrgyrf.putExtra("PhotoPath", vbfvbfbfrrfhrf)
                } catch (ex: IOException) {
                    Log.e("ErrorOccurred", "Unable to create Image File", ex)
                }

                if (gtjgtijgtji != null) {
                    vbfvbfbfrrfhrf = "file:" + gtjgtijgtji.absolutePath
                    vbffrggrfygfrgyrf.putExtra(
                        MediaStore.EXTRA_OUTPUT,
                        Uri.fromFile(gtjgtijgtji)
                    )
                } else {
                    vbffrggrfygfrgyrf = null
                }
            }
            val vfbdefdefed = Intent(Intent.ACTION_GET_CONTENT)
            vfbdefdefed.addCategory(Intent.CATEGORY_OPENABLE)
            vfbdefdefed.type = "image/*"
            val vbvfgfrgfr: Array<Intent?> =
                vbffrggrfygfrgyrf?.let { arrayOf(it) } ?: arrayOfNulls(0)
            val gtkotghyjhy = Intent(Intent.ACTION_CHOOSER)
            gtkotghyjhy.putExtra(Intent.EXTRA_INTENT, vfbdefdefed)
            gtkotghyjhy.putExtra(Intent.EXTRA_TITLE, "Image Chooser")
            gtkotghyjhy.putExtra(Intent.EXTRA_INITIAL_INTENTS, vbvfgfrgfr)
            startActivityForResult(gtkotghyjhy, INPUT_FILE_REQUEST_CODE)
            return true
        }

        fun vngthgtigtih(): File? {
            val gngthugth = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
            val jiojhyjhyjhiy = "JPEG_" + gngthugth + "_"
            val gtntgigtbgtgtbgt = Environment.getExternalStoragePublicDirectory(
                Environment.DIRECTORY_PICTURES
            )
            return File.createTempFile(
                jiojhyjhyjhiy,
                ".jpg",
                gtntgigtbgtgtbgt
            )
        }
    }

    private fun hyhyhyjuujuj(): String {

        val hy2hy26hy26hy = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)

        val vbrgggthgtgt = getSharedPreferences(
            "SHARED_PREF",
            Context.MODE_PRIVATE
        )

        val vbvtdfdffd = vbrgggthgtgt.getString(bgnnhhhh, null)
        Log.d("lolo", vbvtdfdffd.toString())
        val gttgogtjgti = vbrgggthgtgt.getString(hyjikiilolol, null)
        val gtjitgjiogtji = vbrgggthgtgt.getString(bgnhnh, null)


        when (vbrgggthgtgt.getString("WebInt", null)) {
            "campaign" -> {
                gtjojtjjhyjhjyi.frrfrfrfgtgt(gtjitgjiogtji.toString())
            }
            "deepLink" -> {
                gtjojtjjhyjhjyi.frrfrfrfgtgt(gtjitgjiogtji.toString())
            }
            "deepLinkNOApps" -> {
                gtjojtjjhyjhjyi.frrfrfrfgtgt(gttgogtjgti.toString())
            }
            "geo" -> {
                gtjojtjjhyjhjyi.frrfrfrfgtgt(gttgogtjgti.toString())
            }
        }
        return hy2hy26hy26hy.getString("SAVED_URL", vbvtdfdffd).toString()
    }

    var urlfififif = ""
    fun gtgjitjtiojgtgt(lurlurlurlurlur: String?) {
        if (!lurlurlurlurlur!!.contains("t.me")) {

            if (urlfififif == "") {
                urlfififif = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    lurlurlurlurlur
                ).toString()

                val spspspspsppspspsp = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)
                val ededededededed = spspspspsppspspsp.edit()
                ededededededed.putString("SAVED_URL", lurlurlurlurlur)
                ededededededed.apply()
            }
        }
    }

    private var bgkkkbg = false
    override fun onBackPressed() {

        if (jfrjrfjfrrfrfhfrh.canGoBack()) {
            if (bgkkkbg) {
                jfrjrfjfrrfrfhfrh.stopLoading()
                jfrjrfjfrrfrfhfrh.loadUrl(urlfififif)
            }
            this.bgkkkbg = true
            jfrjrfjfrrfrfhfrh.goBack()
            Handler(Looper.getMainLooper()).postDelayed({
                bgkkkbg = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }
}

