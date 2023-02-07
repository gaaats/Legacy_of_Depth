package com.miHoYo.Genshin.apapapa

import android.app.Application
import android.content.Context
import com.miHoYo.Genshin.jgtijgittg.bghhyhyhyju
import com.miHoYo.Genshin.jgtijgittg.viewModelModulegttgtggt
import com.miHoYo.Genshin.otther.Utilgtgtgt.vffrdedd
import com.miHoYo.Genshin.otther.Utilgtgtgt.nhjukkklool
import com.miHoYo.Genshin.otther.Utilgtgtgt.nhjukikik
import com.miHoYo.Genshin.otther.Utilgtgtgt.hyjikiilolol
import com.my.tracker.MyTracker
import com.onesignal.OneSignal
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext
import org.koin.core.logger.Level
import java.util.*

class GogogogClas:Application() {

    override fun onCreate() {
        super.onCreate()
        OneSignal.initWithContext(this)
        OneSignal.setAppId(vffrdedd)

        val gtgtjgttgjgtj = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        val gtjgthgitu = getSharedPreferences("PREFS_NAME", 0)

        val hjhyyjhoi = MyTracker.getTrackerParams()
        val gtjjgtgtj = MyTracker.getTrackerConfig()
        val instIDgttggt = MyTracker.getInstanceId(this)
        gtjjgtgtj.isTrackingLaunchEnabled = true
        val IDINgtgtgt = UUID.randomUUID().toString()

        if (gtjgthgitu.getBoolean("my_first_time", true)) {
            hjhyyjhoi.setCustomUserId(IDINgtgtgt)
            gtgtjgttgjgtj.edit().putString(hyjikiilolol, IDINgtgtgt).apply()
            gtgtjgttgjgtj.edit().putString(nhjukkklool, instIDgttggt).apply()
            gtjgthgitu.edit().putBoolean("my_first_time", false).apply()
        } else {
            val shIDINgttggt = gtgtjgttgjgtj.getString(hyjikiilolol, IDINgtgtgt)
            hjhyyjhoi.setCustomUserId(shIDINgttggt)
        }
        MyTracker.initTracker(nhjukikik, this)

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