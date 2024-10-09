package ru.gb.android.workshop2.presentation.list.promo

import android.content.Context

typealias ErrorProvider = (Context) -> String

data class ScreenState(
    val isLoading: Boolean = false,
    val promoState: List<PromoState> = listOf(PromoState()),
    val hasError: Boolean = false,
    val errorProvider: ErrorProvider = { "" },
)

data class PromoState(
    val id: String = "",
    val name: String = "",
    val description: String = "",
    val image: String = "",
)
