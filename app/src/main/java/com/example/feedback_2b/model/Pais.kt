package com.example.feedback_2b.model

import java.io.Serializable

class Pais(var nombre: String, var poblacion: Double, var Imagen: String) : Serializable {

    override fun toString(): String {
        return nombre
    }
}