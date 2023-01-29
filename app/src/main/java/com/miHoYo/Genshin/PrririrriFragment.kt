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
import com.miHoYo.Genshin.otther.Utilgtgtgt.appsgtgtgt
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class PrririrriFragment : Fragment() {

    val viewMainModel by activityViewModel<ViModgtgtgt>(named("MainModel"))
    val shareP: SharedPreferences by inject(named("SharedPreferences"))
    lateinit var appCamp: String
    private lateinit var mContext: Context

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_prririrri, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val hyhyhyyh5hy = shareP.getString(appsgtgtgt, null)
        val appsCamphyhyhy2hy2 = shareP.getString("appCamp", null)

        if (hyhyhyyh5hy=="1" &&appsCamphyhyhy2hy2 == null) {
            viewMainModel.conversgthyyh(mContext)
            viewMainModel.appsDatatggttggt.observe(viewLifecycleOwner) {
                if (it != null) {
                    appCamp = it.toString()
                    shareP.edit().putString("appCamp", appCamp).apply()
                    gjtitgjtgjjgtjgti()
                }
            }
        } else {
            gjtitgjtgjjgtjgti()
        }
    }

    private fun gjtitgjtgjjgtjgti() {
        findNavController().navigate(R.id.action_prririrriFragment_to_ffifiifFragment)
    }

}