package com.example.jettriviaapp.repository

import android.media.session.MediaSession.QueueItem
import android.util.Log
import com.example.jettriviaapp.data.DataOrException
import com.example.jettriviaapp.network.QuestionAPI
import javax.inject.Inject

class QuestionRepository @Inject constructor(private val api: QuestionAPI) {

    private val dataOrException = DataOrException<ArrayList<QueueItem>, Boolean, Exception>()

    suspend fun getAllQuestions(): DataOrException<ArrayList<QueueItem>, Boolean, Exception> {
        try {
            dataOrException.loading = true
            dataOrException.data = api.getAllQuestions()
            if (dataOrException.data.toString().isNotEmpty())
                dataOrException.loading = false

        } catch (exception: Exception) {
            dataOrException.e = exception
            Log.d("Exception", "getAllQuestions :")
        }
        return dataOrException
    }


}