package com.miHoYo.Genshin.jgtijgittg

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.miHoYo.Genshin.fkrgtigt.JOIFrrfhhrffr
import com.miHoYo.Genshin.mamamama.IOJfhfrrfh
import com.miHoYo.Genshin.mamamama.NJnfggtjitgj
import com.miHoYo.Genshin.mamamama.Ndgfgyfrgyrfg
import com.miHoYo.Genshin.mamamama.Ngtugthgttfrgfrgyrf
import com.miHoYo.Genshin.mododoel.JOIjfrfruhrffrhrfhufr
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


val viewModelModulegttgtggt = module {
    viewModel (named("MainModel")){
        JOIjfrfruhrffrhrfhufr((get(named("CountryRep"))), get(named("DevRep")), get(named("SharedPreferences")), get())
    }
    viewModel(named("BeamModel")) {
        JOIFrrfhhrffr(get())
    }
}

val bghhyhyhyju = module {

    single  <Ngtugthgttfrgfrgyrf> (named("HostInter")){
        get<Retrofit>(named("RetroDev"))
            .create(Ngtugthgttfrgfrgyrf::class.java)
    }

    single <IOJfhfrrfh> (named("ApiInter")) {
        get<Retrofit>(named("RetroCountry"))
            .create(IOJfhfrrfh::class.java)
    }
    single<Retrofit>(named("RetroCountry")) {
        Retrofit.Builder()
            .baseUrl("http://pro.ip-api.com/")
            .addConverterFactory(GsonConverterFactory.create(get()))
            .build()
    }
    single <Retrofit>(named("RetroDev")){
        Retrofit.Builder()
            .baseUrl("http://legacydepth.xyz/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    factory (named("CountryRep")) {
        NJnfggtjitgj(get(named("ApiInter")))
    }

    factory  (named("DevRep")){
        Ndgfgyfrgyrfg(get(named("HostInter")))
    }
    single{
        hyhyyhyhhy()
    }
    single (named("SharedPreferences")) {
        gthyyhhyhy(androidApplication())
    }
}

fun gthyyhhyhy(app: Application): SharedPreferences {
    return app.applicationContext.getSharedPreferences(
        "SHARED_PREF",
        Context.MODE_PRIVATE
    )
}

fun hyhyyhyhhy(): Gson {
    return GsonBuilder().create()
}
