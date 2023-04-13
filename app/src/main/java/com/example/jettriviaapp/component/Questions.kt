package com.example.jettriviaapp.component

import android.util.Log
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.runtime.Composable
import com.example.jettriviaapp.screens.QuestionsViewModel

@Composable
fun Questions(viewModel: QuestionsViewModel) {

    val questions = viewModel.data.value.data?.toMutableList()

    if (viewModel.data.value.loading == true) {
        CircularProgressIndicator()

    } else {

    }

    Log.d("Questions","Questions: ${questions?.size}")

}