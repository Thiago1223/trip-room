package br.senai.sp.jandira.triproom.repository

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import br.senai.sp.jandira.triproom.R
import br.senai.sp.jandira.triproom.model.Category

class CategoryRepository {

    companion object {
        @Composable
        fun getCategories(): List<Category> {
            return listOf<Category>(
                Category(
                    id = 1,
                    name = "Montain",
                    icon = painterResource(id = R.drawable.mountains)
                ),
                Category(
                    id = 2,
                    name = "Snow",
                    icon = painterResource(id = R.drawable.ski)
                ),
                Category(
                    id = 3,
                    name = "Beach",
                    icon = painterResource(id = R.drawable.beach)
                ),
                Category(
                    id = 4,
                    name = "Business",
                    icon = painterResource(id = R.drawable.baseline_business_center_24)
                )
            )
        }
    }

}