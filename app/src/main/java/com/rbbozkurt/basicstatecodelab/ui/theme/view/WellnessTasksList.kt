package com.rbbozkurt.basicstatecodelab.ui.theme.view

import WellnessTaskItem
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.rbbozkurt.basicstatecodelab.ui.theme.data.WellnessTask

fun getWellnessTasks() = List(30) { i -> WellnessTask(i, "Task # $i") }


@Composable
fun WellnessTasksList(
    modifier: Modifier = Modifier,
    list: List<WellnessTask>,
    onCloseTask: (WellnessTask) -> Unit
) {
    LazyColumn(
        modifier = modifier
    ) {
        items(
            items = list,
            key = { task -> task.id }

        ) { task ->
            WellnessTaskItem(taskName = task.label, onCloseTask = { onCloseTask(task) })
        }
    }
}
