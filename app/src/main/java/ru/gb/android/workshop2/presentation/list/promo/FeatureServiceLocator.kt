package ru.gb.android.workshop2.presentation.list.promo

import androidx.lifecycle.ViewModelProvider
import ru.gb.android.workshop2.ServiceLocator

object FeatureServiceLocator {

    fun provideViewModelFactory(): ViewModelProvider.Factory {
        return PromoViewModelFactory(
            promoStateMapper = provideProductStateMapper(),
            consumePromosUseCase = ServiceLocator.provideConsumePromosUseCase(),
        )
    }

    private fun provideProductStateMapper(): PromoStateMapper {
        return PromoStateMapper()
    }
}