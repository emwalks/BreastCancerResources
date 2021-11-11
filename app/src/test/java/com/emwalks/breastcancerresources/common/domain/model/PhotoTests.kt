package com.emwalks.breastcancerresources.common.domain.model

import org.junit.Assert.assertEquals
import org.junit.Test

class PhotoTests {

    private val mediumPhoto = "mediumPhoto"
    private val fullPhoto = "fullPhoto"
    private val invalidPhoto = "" // what’s tested in Photo.isValidPhoto()
    private lateinit var photo: Media.Photo
    private lateinit var smallestPhoto: String

    @Test
    fun testGivenAPhotoMediaObject_WithAMediumAndFullPhoto_WhenGetSmallestAvailablePhotoIsCalled_ThenMediumPhotoIsReturned() {
        // Given
        photo = Media.Photo(mediumPhoto, fullPhoto)

        // When
        WhenGetSmallestAvailablePhotoIsCalled()

        // Then
        val expectedValue = mediumPhoto
        assertEquals(smallestPhoto, expectedValue)
    }

    @Test
    fun testGivenAPhotoMediaObject_WithNoMediumPhoto_WhenGetSmallestAvailablePhotoIsCalled_ThenNoMediumPhotoIsReturned() {
        // Given
        photo = Media.Photo(invalidPhoto, fullPhoto)

        // When
        WhenGetSmallestAvailablePhotoIsCalled()

        // Then
        val expectedValue = fullPhoto
        assertEquals(smallestPhoto, expectedValue)
    }

    @Test
    fun testGivenAPhotoMediaObject_WithNoPhotos_WhenGetSmallestAvailablePhotoIsCalled_ThenNoPhotoIsReturned(){

        // Given
        photo = Media.Photo(invalidPhoto, invalidPhoto)


        // When
        WhenGetSmallestAvailablePhotoIsCalled()

        // Then
        val expectedValue = Media.Photo.EMPTY_PHOTO
        assertEquals(smallestPhoto, expectedValue)
    }

    private fun WhenGetSmallestAvailablePhotoIsCalled() {
        smallestPhoto = photo.getSmallestAvailablePhoto()
    }
}



