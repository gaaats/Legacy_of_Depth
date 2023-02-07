package com.miHoYo.Genshin.otther.gnttngjnjgt

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.miHoYo.Genshin.R
import com.miHoYo.Genshin.mododoel.JOIjfrfruhrffrhrfhufr
import com.miHoYo.Genshin.otther.Utilgtgtgt
import com.miHoYo.Genshin.otther.Utilgtgtgt.njjikik
import com.miHoYo.Genshin.otther.Utilgtgtgt.nhmjjjjjjk
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class SeeeccMaaaaFragment : Fragment() {


    val vbcvdfdf: SharedPreferences by inject(named("SharedPreferences"))

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_seeecc_maaaa, container, false)
    }

    val vtdfdeed by activityViewModel<JOIjfrfruhrffrhrfhufr>(named("MainModel"))
    lateinit var gtbhghgt: String
    lateinit var hykyhjujjuuj: String
    lateinit var nhmhhjuk: String
    private lateinit var vvbfrgfgrf: Context

    override fun onAttach(context: Context) {
        super.onAttach(context)
        vvbfrgfgrf = context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        vtdfdeed.mainId.observe(viewLifecycleOwner) {
            if (it != null) {
                val hjhyjhyhyjihy = it.toString()
                vbcvdfdf.edit().putString("mainId", hjhyjhyhyjihy).apply()
            }
        }

        vtdfdeed.fgfrgfrgfr.observe(viewLifecycleOwner) {
            if (it != null) {

                gtbhghgt = it.gtuitgihgthgt
                nhmhhjuk = it.hyjhyji
                hykyhjujjuuj = it.vfbhfvbh

                vbcvdfdf.edit().putString(njjikik, gtbhghgt).apply()
                vbcvdfdf.edit().putString(Utilgtgtgt.hyujujuj, nhmhhjuk).apply()
                vbcvdfdf.edit().putString(nhmjjjjjjk, hykyhjujjuuj).apply()

                findNavController().navigate(R.id.action_seeeccMaaaaFragment_to_prririrriFragment)
            }
        }
    }
}