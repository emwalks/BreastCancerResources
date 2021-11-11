package com.emwalks.breastcancerresources.common.domain.model.pagination

import com.emwalks.breastcancerresources.common.domain.model.Resource

data class PaginatedResources(
    val resources: List<Resource>,
    val pagination: Pagination
)
