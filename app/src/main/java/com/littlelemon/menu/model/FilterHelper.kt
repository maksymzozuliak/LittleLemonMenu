package com.littlelemon.menu.model

import com.littlelemon.menu.ProductItem

class FilterHelper {

    fun filterProducts(type: FilterType, productsList: List<ProductItem>): List<ProductItem> {
        return when (type) {
            FilterType.All -> productsList
            FilterType.Dessert -> productsList.filter { it.category == "Dessert" }
            FilterType.Drinks -> productsList.filter { it.category == "Drinks" }
            FilterType.Food -> productsList.filter { it.category == "Food" }
        }
    }

}