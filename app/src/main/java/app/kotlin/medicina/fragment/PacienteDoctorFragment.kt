package app.kotlin.medicina.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.findNavController
import app.kotlin.medicina.R
import app.kotlin.medicina.databinding.FragmentPacienteDoctorBinding
import app.kotlin.medicina.fragmentPaciente.AgendarCitaFragment
import app.kotlin.medicina.fragmentPaciente.VerCitaFragment
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class PacienteDoctorFragment : Fragment() {
private lateinit var binding:FragmentPacienteDoctorBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentPacienteDoctorBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnPaciente.setOnClickListener {
            findNavController().navigate(R.id.action_pacienteDoctorFragment_to_pacienteFragment)

        }
        binding.btnDoctor.setOnClickListener {
            findNavController().navigate(R.id.action_pacienteDoctorFragment_to_doctorFragment)

        }

    }





}