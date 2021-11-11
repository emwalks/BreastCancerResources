package com.emwalks.breastcancerresources.database.entities

import androidx.room.*

@Entity(tableName = "resources")
data class Resource(
    @PrimaryKey(autoGenerate = true) val uid: Int,
    @ColumnInfo(name = "title") var title: String?,
    @ColumnInfo(name = "description") var description: String?,
    @ColumnInfo(name = "picture") var picture: String?,
    @ColumnInfo(name = "link") var link: String?,
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




