package com.miHoYo.Genshin

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.miHoYo.Genshin.mododoel.ViModgtgtgt
import com.miHoYo.Genshin.otther.Utilgtgtgt
import com.miHoYo.Genshin.otther.Utilgtgtgt.codeCode565
import com.miHoYo.Genshin.otther.Utilgtgtgt.urlMain655665
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class SeeeccMaaaaFragment : Fragment() {
    val viewMainModel by activityViewModel<ViModgtgtgt>(named("MainModel"))
    lateinit var countryDev: String
    lateinit var wv: String
    lateinit var apps: String
    private lateinit var mContext: Context

    val shareP: SharedPreferences by inject(named("SharedPreferences"))

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_seeecc_maaaa, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewMainModel.mainId.observe(viewLifecycleOwner) {
            if (it != null) {
                val main = it.toString()
                shareP.edit().putString("mainId", main).apply()
            }
        }

        viewMainModel.geo.observe(viewLifecycleOwner) {
            if (it != null) {

                countryDev = it.geo
                apps = it.appsChecker
                wv = it.view

                shareP.edit().putString(codeCode565, countryDev).apply()
                shareP.edit().putString(Utilgtgtgt.appsgtgtgt, apps).apply()
                shareP.edit().putString(urlMain655665, wv).apply()

                findNavController().navigate(R.id.action_seeeccMaaaaFragment_to_prririrriFragment)
            }
        }
    }
}