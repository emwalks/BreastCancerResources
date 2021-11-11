package com.example.breastcancerresources.database.entities

import android.graphics.Bitmap
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import java.net.URL

@Entity
data class Resource(
    @PrimaryKey(autoGenerate = true)
    val uid: Int,
    @ColumnInfo(name = "title") val title: String?,
    @ColumnInfo(name = "desctiption") val desctiption: String?,
    @ColumnInfo(name = "picture") val picture: String?,
    @ColumnInfo(name = "link") val link: String?,
    @ColumnInfo(name = "tags") val tags: List<String>
)

