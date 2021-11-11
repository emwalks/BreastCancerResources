package com.emwalks.breastcancerresources.database.roomDatabase

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import com.emwalks.breastcancerresources.database.dataAccessObjects.ResourceDao
import com.emwalks.breastcancerresources.database.entities.Converters
import com.emwalks.breastcancerresources.database.entities.Resource

@Database(entities = [Resource::class], version = 1)
@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun resourceDao(): ResourceDao
}

//notes on usage

// create an instance of the database

//val db = Room.databaseBuilder(
//    BreastCancerResourcesApplication.getAppContext(),
//    AppDatabase::class.java, "breastCancerResources-database"
//).build()




