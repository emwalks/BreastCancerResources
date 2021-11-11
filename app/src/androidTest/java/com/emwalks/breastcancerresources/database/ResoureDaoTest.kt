package com.emwalks.breastcancerresources.database

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.emwalks.breastcancerresources.database.entities.Resource
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
open class ResourceDaoTest: DatabaseTest() {

    @Test
    @Throws(Exception::class)
    fun createResourceAndReadInLiveDataTest() {
        val expectedResource = Resource(
            uid = 1,
            title = "a test resource title",
            description = null,
            picture = null,
            link = null,
            tags = null
        )

        resourceDao.insertResources(expectedResource)

        val actualTitle = resourceDao.findByTitle("a test resource title")
        assertEquals(expectedResource, actualTitle)
        assertEquals(resourceDao.getAllResources().size, 1)
    }

    @Test
    @Throws(Exception::class)
    fun updateResourceTest() {
        var expectedResource = Resource(
            uid = 1,
            title = "a test resource title",
            description = null,
            picture = null,
            link = null,
            tags = null
        )

        resourceDao.insertResources(expectedResource)
        expectedResource.title = "an updated title"
        resourceDao.updateResources(expectedResource)

        val actualTitle = resourceDao.findByTitle("an updated title")

        assertEquals(expectedResource, actualTitle)
        assertEquals(resourceDao.getAllResources().size, 1)
    }

    @Test
    @Throws(Exception::class)
    fun deleteResourceTest() {
        val expectedResource = Resource(
            uid = 1,
            title = "a test resource title",
            description = null,
            picture = null,
            link = null,
            tags = null
        )

        resourceDao.insertResources(expectedResource)
        resourceDao.deleteResources(expectedResource)

        val actualTitle = resourceDao.findByTitle("a test resource title")
        assertNotEquals(expectedResource, actualTitle)
        assertNull(actualTitle)
        assertEquals(resourceDao.getAllResources().size, 0)
    }


}