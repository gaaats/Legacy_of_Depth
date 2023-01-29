package com.miHoYo.Genshin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.miHoYo.Genshin.databinding.FragmentGaaamyTvoBinding
import kotlin.random.Random


class GaaamyTvoFragment : Fragment() {
    private var fragmentG2Binding: FragmentGaaamyTvoBinding? = null
    private val binding
        get() = fragmentG2Binding ?: throw RuntimeException("FragmentGame2Binding = null")


    private fun eeeeeeee() {
        Snackbar.make(
            binding.root,
            "Error, error, error",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentG2Binding = FragmentGaaamyTvoBinding.inflate(inflater, container, false)
        return binding.root
    }

    private val listBinds by lazy {
        listOf(
            binding.img1,
            binding.img2,
            binding.img3,
            binding.img4,
            binding.img5,
            binding.img6,
            binding.img7,
            binding.img8,
            binding.img9,
        )
    }

    var sum = 0

    private fun checher(): Boolean {
        listBinds.forEach {
            if (it.visibility == View.VISIBLE) return false
        }
        return true
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            binding.tvScore.text = sum.toString()

            binding.img1.setOnClickListener {
                val resssult = Random.nextInt(from = 500, until = 999)
                it.visibility = View.INVISIBLE
                it.isEnabled = false

                sum += resssult
                binding.tvScore.text = sum.toString()
                if (checher()) findNavController().navigate(R.id.action_gaaamyTvoFragment_to_gaaamiThreeFragment)
            }
            binding.img2.setOnClickListener {
                val resssult = Random.nextInt(from = 500, until = 999)
                it.visibility = View.INVISIBLE
                it.isEnabled = false

                sum += resssult
                binding.tvScore.text = sum.toString()
                if (checher()) findNavController().navigate(R.id.action_gaaamyTvoFragment_to_gaaamiThreeFragment)
            }
            binding.img3.setOnClickListener {
                val resssult = Random.nextInt(from = 500, until = 999)
                it.visibility = View.INVISIBLE
                it.isEnabled = false

                sum += resssult
                binding.tvScore.text = sum.toString()
                if (checher()) findNavController().navigate(R.id.action_gaaamyTvoFragment_to_gaaamiThreeFragment)
            }
            binding.img4.setOnClickListener {
                val resssult = Random.nextInt(from = 500, until = 999)
                it.visibility = View.INVISIBLE
                it.isEnabled = false

                sum += resssult
                binding.tvScore.text = sum.toString()
                if (checher()) findNavController().navigate(R.id.action_gaaamyTvoFragment_to_gaaamiThreeFragment)
            }
            binding.img5.setOnClickListener {
                val resssult = Random.nextInt(from = 500, until = 999)
                it.visibility = View.INVISIBLE
                it.isEnabled = false

                sum += resssult
                binding.tvScore.text = sum.toString()
                if (checher()) findNavController().navigate(R.id.action_gaaamyTvoFragment_to_gaaamiThreeFragment)
            }
            binding.img6.setOnClickListener {
                val resssult = Random.nextInt(from = 500, until = 999)
                it.visibility = View.INVISIBLE
                it.isEnabled = false

                sum += resssult
                binding.tvScore.text = sum.toString()
                if (checher()) findNavController().navigate(R.id.action_gaaamyTvoFragment_to_gaaamiThreeFragment)
            }
            binding.img7.setOnClickListener {
                val resssult = Random.nextInt(from = 500, until = 999)
                it.visibility = View.INVISIBLE
                it.isEnabled = false

                sum += resssult
                binding.tvScore.text = sum.toString()
                if (checher()) findNavController().navigate(R.id.action_gaaamyTvoFragment_to_gaaamiThreeFragment)
            }
            binding.img8.setOnClickListener {
                val resssult = Random.nextInt(from = 500, until = 999)
                it.visibility = View.INVISIBLE
                it.isEnabled = false

                sum += resssult
                binding.tvScore.text = sum.toString()
                if (checher()) findNavController().navigate(R.id.action_gaaamyTvoFragment_to_gaaamiThreeFragment)
            }
            binding.img9.setOnClickListener {
                val resssult = Random.nextInt(from = 500, until = 999)
                it.visibility = View.INVISIBLE
                it.isEnabled = false

                sum += resssult
                binding.tvScore.text = sum.toString()
                if (checher()) findNavController().navigate(R.id.action_gaaamyTvoFragment_to_gaaamiThreeFragment)
            }
        } catch (e: Exception) {
            eeeeeeee()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroy() {
        fragmentG2Binding = null
        super.onDestroy()
    }
}