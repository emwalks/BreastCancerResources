package com.emwalks.breastcancerresources.database.dataAccessObjects

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.emwalks.breastcancerresources.database.entities.Resource

interface BaseDao<T> {
    @Insert
    fun insert(vararg obj: T)
}

@Dao
interface ResourceDao {
    @Query("SELECT * FROM resources")
    fun getAll(): List<Resource>

    @Query("SELECT * FROM resources WHERE uid IN (:resourceIds)")
    fun loadAllByIds(resourceIds: IntArray): List<Resource>

    @Query("SELECT * FROM resources WHERE title LIKE :title LIMIT 1")
    fun findByTitle(title: String): Resource

    @Insert
    fun insertAll(vararg resources: Resource)

    @Delete
    fun delete(user: Resource)
}

