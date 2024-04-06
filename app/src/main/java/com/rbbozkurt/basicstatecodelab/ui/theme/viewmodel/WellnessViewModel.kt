package com.rbbozkurt.basicstatecodelab.ui.theme.viewmodel

import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel
import com.rbbozkurt.basicstatecodelab.ui.theme.data.WellnessTask
import com.rbbozkurt.basicstatecodelab.ui.theme.view.getWellnessTasks

class WellnessViewModel : ViewModel() {
    private val _tasks = getWellnessTasks().toMutableStateList()
    val tasks: List<WellnessTask>
        get() = _tasks


    fun remove(item: WellnessTask) {
        _tasks.remove(item)
    }

    fun changeTaskChecked(item: WellnessTask, checked: Boolean) =
        _tasks.find { it.id == item.id }?.let { task ->
            task.checked = checked
        }


}