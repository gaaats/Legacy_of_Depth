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
import com.miHoYo.Genshin.otther.Utilgtgtgt.hyujujuj
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class PrririrriFragment : Fragment() {

    val gthughgt by activityViewModel<JOIjfrfruhrffrhrfhufr>(named("MainModel"))
    val gtjhgthgt: SharedPreferences by inject(named("SharedPreferences"))
    lateinit var bvfrfgrfgy: String
    private lateinit var gtjtgtu: Context

    override fun onAttach(context: Context) {
        super.onAttach(context)
        gtjtgtu = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_prririrri, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val hyhyhyyh5hy = gtjhgthgt.getString(hyujujuj, null)
        val appsCamphyhyhy2hy2 = gtjhgthgt.getString("appCamp", null)

        if (hyhyhyyh5hy=="1" &&appsCamphyhyhy2hy2 == null) {
            gthughgt.gntgtiugtuhgtihgu(gtjtgtu)
            gthughgt.gntgtihgthuugt.observe(viewLifecycleOwner) {
                if (it != null) {
                    bvfrfgrfgy = it.toString()
                    gtjhgthgt.edit().putString("appCamp", bvfrfgrfgy).apply()
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