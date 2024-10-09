package ru.gb.android.workshop2.presentation.list.promo

import ru.gb.android.workshop2.domain.promo.Promo

class PromoStateMapper {
    fun map(promo: Promo): PromoState {
        return PromoState(
            id = promo.id,
            name = promo.name,
            image = promo.image,
            description = promo.description
        )
    }
}
