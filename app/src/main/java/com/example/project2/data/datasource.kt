package com.example.project2.data

import com.example.project2.R
import com.example.project2.model.appshop

class datasource {
    // list of items
    fun loadapp() : List<appshop>{
        return listOf(
            appshop(R.string.clothing, R.drawable.imageone),
            appshop(R.string.Bags, R.drawable.imagethree),
            appshop(R.string.Sneakers, R.drawable.imagetwo),
            appshop(R.string.acess, R.drawable.imagefour2),

            )
    }
}