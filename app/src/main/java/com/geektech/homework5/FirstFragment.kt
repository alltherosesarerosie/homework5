package com.geektech.homework5

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.geektech.homework5.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding



   override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.btnSend.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("username", binding.etEmail.text.toString())
            bundle.putString("email",binding.etUsername.text.toString())
            val secondFragment = SecondFragment()
            secondFragment.arguments = bundle
            requireActivity().supportFragmentManager.beginTransaction().replace(R.id.container, SecondFragment()).commit()

        }
    }

}