package com.miHoYo.Genshin.apapapa

import android.app.Application
import android.content.Context
import com.miHoYo.Genshin.jgtijgittg.bghhyhyhyju
import com.miHoYo.Genshin.jgtijgittg.viewModelModulegttgtggt
import com.miHoYo.Genshin.otther.Utilgtgtgt.ONESIGNAL_APP_ID59588
import com.miHoYo.Genshin.otther.Utilgtgtgt.instIdgtgt6gt5
import com.miHoYo.Genshin.otther.Utilgtgtgt.mtKey559
import com.miHoYo.Genshin.otther.Utilgtgtgt.myIdgt5tg55
import com.my.tracker.MyTracker
import com.onesignal.OneSignal
import io.branch.referral.Branch
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext
import org.koin.core.logger.Level
import java.util.*

class GogogogClas:Application() {

    override fun onCreate() {
        super.onCreate()
        OneSignal.initWithContext(this)
        OneSignal.setAppId(ONESIGNAL_APP_ID59588)
        Branch.enableTestMode()
        Branch.getAutoInstance(this)

        val gtgtjgttgjgtj = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        val gtjgthgitu = getSharedPreferences("PREFS_NAME", 0)

        val hjhyyjhoi = MyTracker.getTrackerParams()
        val gtjjgtgtj = MyTracker.getTrackerConfig()
        val instIDgttggt = MyTracker.getInstanceId(this)
        gtjjgtgtj.isTrackingLaunchEnabled = true
        val IDINgtgtgt = UUID.randomUUID().toString()

        if (gtjgthgitu.getBoolean("my_first_time", true)) {
            hjhyyjhoi.setCustomUserId(IDINgtgtgt)
            gtgtjgttgjgtj.edit().putString(myIdgt5tg55, IDINgtgtgt).apply()
            gtgtjgttgjgtj.edit().putString(instIdgtgt6gt5, instIDgttggt).apply()
            gtjgthgitu.edit().putBoolean("my_first_time", false).apply()
        } else {
            val shIDINgttggt = gtgtjgttgjgtj.getString(myIdgt5tg55, IDINgtgtgt)
            hjhyyjhoi.setCustomUserId(shIDINgttggt)
        }
        MyTracker.initTracker(mtKey559, this)

        GlobalContext.startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@GogogogClas)
            modules(
                listOf(
                    viewModelModulegttgtggt, bghhyhyhyju
                )
            )
        }
    }
}