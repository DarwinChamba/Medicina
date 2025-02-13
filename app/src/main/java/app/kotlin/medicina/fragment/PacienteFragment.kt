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
import app.kotlin.medicina.databinding.FragmentPacienteBinding
import app.kotlin.medicina.fragmentPaciente.AdapterPaciente
import app.kotlin.medicina.fragmentPaciente.AgendarCitaFragment
import app.kotlin.medicina.fragmentPaciente.VerCitaFragment
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator


class PacienteFragment : Fragment() {
    private lateinit var binding: FragmentPacienteBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPacienteBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        createAdapterFragment()
    }

    private fun createAdapterFragment() {
        val listFragment = listOf(
            AgendarCitaFragment(),
            VerCitaFragment()
        )

        // Configura el ViewPager2
        binding.viewPager2.isUserInputEnabled = false
        binding.viewPager2.offscreenPageLimit = 3
        val adapterFragment = AdapterPaciente(listFragment, lifecycle, childFragmentManager)
        binding.viewPager2.adapter = adapterFragment

        // Configura el TabLayoutMediator
        TabLayoutMediator(binding.tabLayout, binding.viewPager2) { tab, position ->
            // Infla el layout personalizado
            val tabView = LayoutInflater.from(requireContext()).inflate(R.layout.custom_tab, null)
            val tabIcon = tabView.findViewById<ImageView>(R.id.tab_icon)
            val tabText = tabView.findViewById<TextView>(R.id.tab_text)

            when (position) {
                0 -> {
                    tabIcon.setImageResource(R.drawable.ic_health) // Ícono de la primera pestaña
                    tabText.text = "Agendar" // Texto de la primera pestaña
                }
                1 -> {
                    tabIcon.setImageResource(R.drawable.ic_health) // Ícono de la segunda pestaña
                    tabText.text = "Ver citas" // Texto de la segunda pestaña
                }
            }

            // Establece el layout personalizado en la pestaña
            tab.customView = tabView
        }.attach()
    }

}