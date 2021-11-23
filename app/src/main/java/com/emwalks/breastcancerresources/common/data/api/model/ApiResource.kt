package com.emwalks.breastcancerresources.common.data.api.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ApiResource(
    @field:Json(name = "uid") val uid: Int,
    @field:Json(name = "title") val title: String?,
    @field:Json(name = "description") val description: String?,
    @field:Json(name = "picture") val picture: String?,
    @field:Json(name = "link") val link: String?,
    @field:Json(name = "tags") val tags: List<String?>?
)
