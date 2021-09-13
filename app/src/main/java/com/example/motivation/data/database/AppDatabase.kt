package com.example.motivation.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.motivation.data.database.dao.ProfileDao
import com.example.motivation.data.database.dao.TaskDao
import com.example.motivation.data.database.entity.ProfileDbStructure
import com.example.motivation.data.database.entity.TaskDbStructure

@Database(entities = [ProfileDbStructure::class, TaskDbStructure::class], version = 1)
abstract class AppDatabase:RoomDatabase() {
    abstract val profileDao: ProfileDao
    abstract val taskDao: TaskDao
}