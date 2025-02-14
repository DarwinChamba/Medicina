package app.kotlin.medicina.fragmentPaciente

import android.graphics.Color
import android.os.Bundle
import android.provider.CalendarContract.Calendars
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.getDrawable

import app.kotlin.medicina.R
import app.kotlin.medicina.databinding.FragmentAgendarCitaBinding
import app.kotlin.medicina.dialog.FechaDialog
import com.prolificinteractive.materialcalendarview.CalendarDay
import com.prolificinteractive.materialcalendarview.DayViewDecorator
import com.prolificinteractive.materialcalendarview.DayViewFacade
import com.prolificinteractive.materialcalendarview.MaterialCalendarView
import java.util.*


import java.util.Calendar


class AgendarCitaFragment : Fragment() {
    private lateinit var binding: FragmentAgendarCitaBinding
    var fecha: Long? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAgendarCitaBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.hora.setOnClickListener {
            //getHora()
        }

        binding.fecha.setOnClickListener {
            getFecha()
        }
        //binding.calendarView.date = fecha ?: System.currentTimeMillis()
       // seleccionarMultiplesFechas()
        pintar()
    }


    private fun getFecha() {
        /*
        val pickerDialog = FechaDialog()
        pickerDialog.show(childFragmentManager, "fechadialog")
        val calendar = Calendar.getInstance()
        pickerDialog.listener = {
            fecha = it
            binding.calendarView.date = fecha ?: System.currentTimeMillis()
            calendar.timeInMillis = it
            val dia = calendar.get(android.icu.util.Calendar.DAY_OF_MONTH)
            val mes = calendar.get(android.icu.util.Calendar.MONTH) + 1
            val anio = calendar.get(android.icu.util.Calendar.YEAR)
            binding.tvVerFecha.setText("$dia $mes $anio")

        }

         */
    }
    /*
    private fun seleccionarMultiplesFechas(){
        // Lista de fechas a marcar
        val fechasMarcadas = listOf(
            CalendarDay.from(2024, 1, 10),
            CalendarDay.from(2024, 1, 15),
            CalendarDay.from(2024, 1, 20)
        )

        // Aplica el decorador al calendario
        binding.calendarView1.addDecorator(EventDecorator(fechasMarcadas, Color.RED))
    }
    */

/*
    private fun getHora() {
        val hora = HoraDialog()
        hora.show(childFragmentManager, "hora")
        hora.listener = { hora, minute ->
            binding.tvVerHora.setText("$hora:$minute")

        }

*/

    private fun pintar(){
        // Fechas que quieres resaltar
        val fechasResaltar = listOf(15, 20, 28)

        // Crear el decorador
        binding.calendarView.addDecorator(object : DayViewDecorator {
            override fun shouldDecorate(day: CalendarDay): Boolean {
                return fechasResaltar.contains(day.day)
            }

            override fun decorate(view: DayViewFacade) {
                ContextCompat.getDrawable(requireContext(), R.drawable.fondo)?.let { drawable ->
                    view.setBackgroundDrawable(drawable)
                }
            }
        })
    }



}