package com.romuloban.coffeemasters

class Product(var id: Int, var name: String, var price: Double,
              var image: String) {
    val imageUrl get() = "https://firtman.github.io/coffeemasters/api/images/${this.image}"
}

class Category(var name: String, products: MutableList<Product>)

class ItemInCart(var product: Product, quantity: Int)