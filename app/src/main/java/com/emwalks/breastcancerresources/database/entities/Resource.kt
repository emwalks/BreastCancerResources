package com.emwalks.breastcancerresources.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverter

@Entity
data class Resource(
    @PrimaryKey(autoGenerate = true)
    val uid: Int,
    @ColumnInfo(name = "title") val title: String?,
    @ColumnInfo(name = "desctiption") val desctiption: String?,
    @ColumnInfo(name = "picture") val picture: String?,
    @ColumnInfo(name = "link") val link: String?,
    @ColumnInfo(name = "tags") var tags: MutableList<String?>?
)

private const val SEPARATOR = ","

class Converters {

   companion object {
       @TypeConverter
       @JvmStatic
       fun tagsToString(tags: MutableList<String?>?): String? =
           tags?.map { it }?.joinToString(separator = SEPARATOR)


       @TypeConverter
       @JvmStatic
       fun stringToTags(tags: String?): MutableList<String?>? =
           tags?.split(SEPARATOR)?.map { String.toString() }?.toMutableList()

   }



}




