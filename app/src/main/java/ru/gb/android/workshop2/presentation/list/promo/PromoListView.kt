package ru.gb.android.workshop2.presentation.list.promo

interface PromoListView {
    fun showProgress()
    fun hideProgress()
    fun showPromos(promoList: List<PromoState>)
    fun hidePromos()
    fun showError()
}
