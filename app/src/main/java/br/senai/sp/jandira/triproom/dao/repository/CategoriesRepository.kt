package br.senai.sp.jandira.triproom.dao.repository

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import br.senai.sp.jandira.triproom.R
import br.senai.sp.jandira.triproom.model.Categorie

class CategoriesRepository {

    companion object {
        @Composable
        fun getCategoriesList(): List<Categorie> {
            return listOf<Categorie>(
                Categorie(
                    id = 1,
                    image = painterResource(id = R.drawable.mountains),
                    name = "Montain"
                ),
                Categorie(
                    id = 2,
                    image = painterResource(id = R.drawable.ski),
                    name = "Snow"
                ),
                Categorie(
                    id = 3,
                    image = painterResource(id = R.drawable.beach),
                    name = "Beach"
                )
            )
        }
    }

}