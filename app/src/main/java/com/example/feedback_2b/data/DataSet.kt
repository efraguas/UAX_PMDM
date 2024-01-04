package com.example.feedback_2b.data

import com.example.feedback_2b.model.Pais

class DataSet {

    //metodo "estatico"
    companion object {
        fun getPaises(): ArrayList<Pais> {
            val listaPaises = ArrayList<Pais>()
            listaPaises.add(Pais("España", 44.0,"https://upload.wikimedia.org/wikipedia/commons/thumb/8/89/Bandera_de_Espa%C3%B1a.svg/203px-Bandera_de_Espa%C3%B1a.svg.png"))
            listaPaises.add(Pais("Noruega", 54.8,"https://upload.wikimedia.org/wikipedia/commons/thumb/d/d9/Flag_of_Norway.svg/203px-Flag_of_Norway.svg.png"))
            listaPaises.add(Pais("Islandia", 37.25,"https://upload.wikimedia.org/wikipedia/commons/thumb/c/ce/Flag_of_Iceland.svg/203px-Flag_of_Iceland.svg.png"))
            listaPaises.add(Pais("Alemania", 83.2,"https://upload.wikimedia.org/wikipedia/commons/thumb/b/ba/Flag_of_Germany.svg/203px-Flag_of_Germany.svg.png"))
            listaPaises.add(Pais("Austria", 8.9,"https://upload.wikimedia.org/wikipedia/commons/thumb/4/41/Flag_of_Austria.svg/203px-Flag_of_Austria.svg.png"))
            listaPaises.add(Pais("Australia", 25.7,"https://upload.wikimedia.org/wikipedia/commons/thumb/8/88/Flag_of_Australia_%28converted%29.svg/203px-Flag_of_Australia_%28converted%29.svg.png"))
            listaPaises.add(Pais("Francia", 67.1,"https://upload.wikimedia.org/wikipedia/commons/thumb/9/93/Flag_of_France_%281794%E2%80%931815%2C_1830%E2%80%931974%29.svg/203px-Flag_of_France_%281794%E2%80%931815%2C_1830%E2%80%931974%29.svg.png"))
            listaPaises.add(Pais("EE.UU", 331.9,"https://upload.wikimedia.org/wikipedia/commons/thumb/a/a4/Flag_of_the_United_States.svg/1920px-Flag_of_the_United_States.svg.png"))
            listaPaises.add(Pais("Argentina", 45.8,"https://upload.wikimedia.org/wikipedia/commons/thumb/1/1a/Flag_of_Argentina.svg/203px-Flag_of_Argentina.svg.png"))
            listaPaises.add(Pais("Sudafrica", 59.4,"https://upload.wikimedia.org/wikipedia/commons/thumb/a/af/Flag_of_South_Africa.svg/203px-Flag_of_South_Africa.svg.png"))

            return listaPaises
        }
    }
}