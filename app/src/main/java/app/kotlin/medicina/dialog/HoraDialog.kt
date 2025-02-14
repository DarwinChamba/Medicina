package app.kotlin.medicina.dialog

import android.app.Dialog
import android.app.TimePickerDialog
import android.content.Context
import android.icu.util.Calendar
import android.os.Bundle
import android.widget.TimePicker
import androidx.fragment.app.DialogFragment

class HoraDialog : DialogFragment(), TimePickerDialog.OnTimeSetListener {
    var listener: ((Int, Int) -> Unit)? = null
    override fun onTimeSet(p0: TimePicker?, p1: Int, p2: Int) {

        listener?.invoke(p1, p2)
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val time = Calendar.getInstance()
        val hora = time.get(Calendar.HOUR_OF_DAY)
        val minute = time.get(Calendar.MINUTE)
        val timePicker = TimePickerDialog(activity as Context, this, hora, minute, false)
        return timePicker
    }

}