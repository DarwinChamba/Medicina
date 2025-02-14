package app.kotlin.medicina.dialog

import android.app.DatePickerDialog
import android.app.Dialog
import android.content.Context
import android.icu.util.Calendar
import android.os.Bundle
import android.widget.DatePicker
import androidx.fragment.app.DialogFragment

class FechaDialog : DialogFragment(), DatePickerDialog.OnDateSetListener {
    var listener: ((Long) -> Unit)? = null

    override fun onDateSet(p0: DatePicker?, p1: Int, p2: Int, p3: Int) {
        val calendar = Calendar.getInstance()
        calendar.set(Calendar.YEAR, p1)
        calendar.set(Calendar.MONTH, p2) // No ajustes el mes, ya está en formato 0-11
        calendar.set(Calendar.DAY_OF_MONTH, p3)
        listener?.invoke(calendar.timeInMillis)
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val c = Calendar.getInstance()
        val dia = c.get(Calendar.DAY_OF_MONTH)
        val mes = c.get(Calendar.MONTH) // Ya está en formato 0-11
        val year = c.get(Calendar.YEAR)

        val dialogPicker = DatePickerDialog(activity as Context, this, year, mes, dia)
        dialogPicker.datePicker.minDate = c.timeInMillis
        return dialogPicker
    }
}