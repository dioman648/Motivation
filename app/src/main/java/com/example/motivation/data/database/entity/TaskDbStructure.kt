package com.example.motivation.data.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class TaskDbStructure(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val createdAt: Long,
    val updatedAt: Long,
    val title: String,
    val description: String

)