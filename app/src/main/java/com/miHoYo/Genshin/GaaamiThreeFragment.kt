package com.miHoYo.Genshin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.miHoYo.Genshin.databinding.FragmentGaaamiThreeBinding
import kotlin.random.Random


class GaaamiThreeFragment : Fragment() {
    var sum = 0
    private fun eeeeeeee() {
        Snackbar.make(
            binding.root,
            "Error, error, error",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    private var fragmentG3Binding: FragmentGaaamiThreeBinding? = null
    private val binding
        get() = fragmentG3Binding ?: throw RuntimeException("FragmentGame3Binding = null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentG3Binding = FragmentGaaamiThreeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {
            val resssult = Random.nextInt(from = 500, until = 999)
            binding.tvRulesScore.text = resssult.toString()

            binding.btnRestart.setOnClickListener {
                toigjtigtjgtjgtjjgtjigt()
            }


        } catch (e: Exception) {
            eeeeeeee()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    private fun toigjtigtjgtjgtjjgtjigt() {
        findNavController().navigate(R.id.action_gaaamiThreeFragment_to_gaaaammyOneFragment)
    }

    override fun onDestroy() {
        fragmentG3Binding = null
        super.onDestroy()
    }
}