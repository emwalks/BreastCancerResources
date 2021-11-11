package com.emwalks.breastcancerresources.database

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.emwalks.breastcancerresources.database.entities.Resource
import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
open class ResourceDaoTest: DatabaseTest() {

//    @get:Rule
//    val instantTaskExecutorRule = InstantTaskExecutorRule()

    @Test
    @Throws(Exception::class)
    fun writeResourceAndReadInList() {
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
        MatcherAssert.assertThat(actualTitle, CoreMatchers.equalTo(expectedResource))
    }

}