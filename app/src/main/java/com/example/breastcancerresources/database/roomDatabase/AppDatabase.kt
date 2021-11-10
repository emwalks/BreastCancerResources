package com.example.breastcancerresources.database.roomDatabase

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.BreastCancerResourcesApplication
import com.example.breastcancerresources.database.dataAccessObjects.ResourceDao
import com.example.breastcancerresources.database.entities.Resource

@Database(entities = [Resource::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun resourceDao(): ResourceDao
}

//notes on usage

// create an instance of the database

//val db = Room.databaseBuilder(
//    BreastCancerResourcesApplication.getAppContext(),
//    AppDatabase::class.java, "breastCancerResources-database"
//).build()




