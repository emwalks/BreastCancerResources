package com.emwalks.breastcancerresources.database

import android.content.Context
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.emwalks.breastcancerresources.database.dataAccessObjects.ResourceDao
import com.emwalks.breastcancerresources.database.roomDatabase.AppDatabase
import org.junit.After
import org.junit.Before
import org.junit.runner.RunWith
import java.io.IOException

@RunWith(AndroidJUnit4::class)
abstract class DatabaseTest {
    private lateinit var appDatabase: AppDatabase
    protected lateinit var resourceDao: ResourceDao

    @Before
    fun initDb() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        appDatabase = Room.inMemoryDatabaseBuilder(
            context,
            AppDatabase::class.java)
            .allowMainThreadQueries()
            .build()
        resourceDao = appDatabase.resourceDao()
    }

    @After
    @Throws(IOException::class)
    fun closeDb() {
        appDatabase.close()
    }
}