package ru.gb.android.workshop2.presentation.list.product

import android.content.Context

typealias ErrorProvider = (Context) -> String

data class ScreenState(
    val isLoading: Boolean = false,
    val productState: List<ProductState> = listOf(ProductState()),
    val hasError: Boolean = false,
    val errorProvider: ErrorProvider = { "" },
)

data class ProductState(
    val id: String = "",
    val name: String = "",
    val image: String = "",
    val price: String = "",
    val hasDiscount: Boolean = false,
    val discount: String = "",
)
