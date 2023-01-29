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
import com.miHoYo.Genshin.otther.Utilgtgtgt.gt5gtgtCo
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class CooontntnttnFragment : Fragment() {


    lateinit var hyyhhyhy: String

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_cooontntnttn, container, false)
    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        hy2hy = context
    }
    private lateinit var hy2hy: Context


    val shareP2hhy2hy: SharedPreferences by inject(named("SharedPreferences"))
    val viewMainModeltgtgtgt by activityViewModel<ViModgtgtgt>(named("MainModel"))
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewMainModeltgtgtgt.countryCode.observe(viewLifecycleOwner) {
            if (it!=null) {
                hyyhhyhy = it.cou
                shareP2hhy2hy.edit().putString(gt5gtgtCo, hyyhhyhy).apply()
                gtjjtgjgtjgtj()
            }
        }
    }

    private fun gtjjtgjgtjgtj() {
        findNavController().navigate(R.id.action_cooontntnttnFragment_to_seeeccMaaaaFragment)
    }
}