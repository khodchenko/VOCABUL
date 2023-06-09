package com.example.languagegym.data.model

import androidx.room.Embedded
import androidx.room.Relation

data class CategoryWithWords (
    @Embedded
    val categoryModel: CategoryModel,
    @Relation(
        parentColumn = "categoryId",
        entityColumn = "id"
    )
    val wordModels: List<WordModel>
)