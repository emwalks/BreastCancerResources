package com.emwalks.breastcancerresources.common.domain.model

import org.junit.Assert.assertEquals
import org.junit.Test

class PhotoTests {

    private val mediumPhoto = "mediumPhoto"
    private val fullPhoto = "fullPhoto"
    private val invalidPhoto = "" // what’s tested in Photo.isValidPhoto()

    @Test
    fun testGivenAPhotoMediaObjectWithAMediumAndFullPhoto_WhenGetSmallestAvailablePhotoIsCalled_TheMediumPhotoIsReturned() {
        // Given
        val photo = Media.Photo(mediumPhoto, fullPhoto)
        
        // When
        val smallestPhoto = photo.getSmallestAvailablePhoto()

        // Then
        val expectedValue = mediumPhoto
        assertEquals(smallestPhoto, expectedValue)
    }
}
