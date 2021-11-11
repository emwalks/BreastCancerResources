package com.emwalks.breastcancerresources.database.dataAccessObjects

import androidx.room.*
import com.emwalks.breastcancerresources.database.entities.Resource
import kotlinx.coroutines.flow.Flow

interface BaseDao<T> {
    @Insert
    fun insert(vararg obj: T)
}

@Dao
interface ResourceDao {
    //Create
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertResources(vararg resources: Resource)

    @Insert
    fun insertAll(vararg resources: Resource)

    //Read
    @Query("SELECT * FROM resources")
    fun getAllResources(): List<Resource>

    @Query("SELECT * FROM resources WHERE uid IN (:resourceIds)")
    fun loadAllByIds(resourceIds: IntArray): List<Resource>

    @Query("SELECT * FROM resources WHERE uid = :uid")
    fun loadUserById(uid: Int): Flow<Resource>

    @Query("SELECT * from resources WHERE tags IN (:tags)")
    fun loadResourcesByTags(tags: List<String>): Flow<List<Resource>>
    
    @Query("SELECT * FROM resources WHERE title LIKE :title LIMIT 1")
    fun findByTitle(title: String): Resource

    @Query("SELECT * FROM resources WHERE tags LIKE :search ")
    fun findResourceWithTags(search: String): List<Resource>

    //Update
    @Update
    fun updateResources(vararg resources: Resource)

    //Delete
    @Delete
    fun deleteResources(vararg resources: Resource)
}

