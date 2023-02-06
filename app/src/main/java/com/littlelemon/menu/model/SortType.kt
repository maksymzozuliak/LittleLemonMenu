package com.littlelemon.menu.model

sealed class SortType {
    object Alphabetically : SortType()
    object PriceAsc : SortType()
    object PriceDesc : SortType()
}
