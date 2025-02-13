package app.kotlin.medicina.fragmentPaciente

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class AdapterPaciente(
    private val listFragment: List<Fragment>,
    private val lifecycle: Lifecycle,
    private val fragmentManager: FragmentManager

) : FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount() = listFragment.size

    override fun createFragment(position: Int): Fragment {
        return listFragment[position]
    }
}