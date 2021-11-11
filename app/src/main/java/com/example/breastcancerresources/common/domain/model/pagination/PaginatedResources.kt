package com.example.breastcancerresources.common.domain.model.pagination

import com.example.breastcancerresources.common.domain.model.Resource

data class PaginatedResources(
    val resources: List<Resource>,
    val pagination: Pagination
)
