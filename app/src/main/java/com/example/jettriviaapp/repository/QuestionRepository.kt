package com.example.jettriviaapp.repository

import android.media.session.MediaSession.QueueItem
import com.example.jettriviaapp.data.DataOrException
import com.example.jettriviaapp.network.QuestionAPI
import javax.inject.Inject

class QuestionRepository @Inject constructor(private val api: QuestionAPI) {

    private val listOfQuestions = DataOrException<ArrayList<QueueItem>, Boolean, Exception>()


}