package com.example.py7.crudkotlin

class Barang {

    var id: Int? = null
    var text: String? = null
    var sentiment: String? = null
    var probability: String? = null

    constructor(id: Int, text: String, sentiment: String, probability:String){
        this.id = id
        this.text = text
        this.sentiment = sentiment
        this.probability = probability
    }
}