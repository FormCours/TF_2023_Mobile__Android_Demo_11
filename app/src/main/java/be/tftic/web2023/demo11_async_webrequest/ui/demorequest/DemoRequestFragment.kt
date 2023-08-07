package be.tftic.web2023.demo11_async_webrequest.ui.demorequest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import be.tftic.web2023.demo11_async_webrequest.R
import be.tftic.web2023.demo11_async_webrequest.databinding.FragmentDemoRequestBinding

class DemoRequestFragment : Fragment() {

    private lateinit var binding : FragmentDemoRequestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentDemoRequestBinding.inflate(inflater, container, false)

        return binding.root
    }
}