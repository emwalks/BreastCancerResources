package com.example.breastcancerresources.common.domain.model

import java.net.URL

data class Resource(
    val uid: Int,
    val title: String,
    val description: String,
    //not the media data class has Photo and Video types whose base class are strings
    val picture: Media,
    val link: URL,
    val tags: List<String>
    )

