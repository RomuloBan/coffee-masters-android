package com.romuloban.coffeemasters

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material.icons.outlined.Star
import androidx.compose.ui.graphics.vector.ImageVector

data class NavPage(var name: String, var icon: ImageVector,
                   var route: String)

object Routes {
    val MenuPage = NavPage("Menu", Icons.Outlined.Menu, "menu")
    val OffersPage = NavPage("Offers", Icons.Outlined.Star, "offers")
    val OrderPage = NavPage("My Order", Icons.Outlined.ShoppingCart, "order")
    val InfoPage = NavPage("Info", Icons.Outlined.Info, "info")

    val pages = listOf(MenuPage, OffersPage, OrderPage, InfoPage)
}