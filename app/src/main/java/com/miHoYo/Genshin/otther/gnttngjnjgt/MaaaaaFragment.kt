package com.miHoYo.Genshin.otther.gnttngjnjgt

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.miHoYo.Genshin.R
import com.miHoYo.Genshin.mododoel.JOIjfrfruhrffrhrfhufr
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class MaaaaaFragment : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        hyjujkiikik.fbDeeegttggtgt(mContext)

        findNavController().navigate(R.id.action_maaaaaFragment_to_cooontntnttnFragment)

    }

    private lateinit var mContext: Context

    val hyjujkiikik by activityViewModel<JOIjfrfruhrffrhrfhufr>(named("MainModel"))

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_maaaaa, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext=context
    }


}