package com.emwalks.breastcancerresources.common.domain.model

import java.net.URL

// Resource is an example of an entity as it has an id

data class Resource(
    val uid: Int,
    val title: String,
    val description: String,
    //The media value object data class has Photo and Video types whose base class are strings
    val picture: Media,
    val link: URL,
    val tags: List<String>
    )


//do I need to validate uid?


