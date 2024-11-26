package com.example.mibocata

data class Bocata(
    val nombre: String,
    val precio: Int,
    val dia: String?,
    val fecha: String,
    val tipo: Boolean,
    val ingredientes: String,
    val alergenos: String
)
