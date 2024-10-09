package ru.gb.android.workshop2.presentation.list.product

interface ProductListView {
    fun showProgress()
    fun hideProgress()
    fun hidePullToRefresh()
    fun showProducts(productList: List<ProductState>)
    fun hideProducts()
    fun showError()
}
