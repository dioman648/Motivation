package com.example.motivation.data.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ProfileDbStructure(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val balance: Double
)