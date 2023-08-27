package ru.gb.android.lesson2.mvx.features.product.presentation.mvi

import android.content.Context
import android.widget.Toast
import io.reactivex.functions.Consumer
import ru.gb.android.lesson2.mvx.features.product.presentation.mvi.entities.News

class NewsListener(
    private val context: Context,
) : Consumer<News> {

    override fun accept(news: News) {
        when (news) {
            is News.ErrorExecutingRequest -> errorHappened(news.throwable)
        }
    }

    private fun errorHappened(throwable: Throwable) {
        Toast.makeText(
            context,
            throwable.localizedMessage,
            Toast.LENGTH_SHORT
        ).show()
    }
}
