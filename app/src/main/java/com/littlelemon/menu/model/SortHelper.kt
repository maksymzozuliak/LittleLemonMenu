package com.littlelemon.menu.model

import com.littlelemon.menu.ProductItem

class SortHelper {

    fun sortProducts(type: SortType, productsList: List<ProductItem>): List<ProductItem> {
        return when (type) {
            SortType.Alphabetically -> productsList.sortAlphabetically()
            SortType.PriceAsc -> productsList.sortPriceAsc()
            SortType.PriceDesc -> productsList.sortPriceDesc()
        }
    }

    private fun List<ProductItem>.sortPriceAsc (): List<ProductItem> {
        return sortedBy { it.price }
    }

    private fun List<ProductItem>.sortPriceDesc (): List<ProductItem> {
        return sortedBy { it.price }.reversed()
    }

    private fun List<ProductItem>.sortAlphabetically(): List<ProductItem> {
        return sortedBy { it.title }
    }

}