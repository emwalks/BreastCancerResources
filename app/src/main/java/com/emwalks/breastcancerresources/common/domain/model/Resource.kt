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

//data class Uid(val value: Int){
//    init {
//        validate(value)
//    }
//
//    private fun validate(uid: Int): Either<UidException, Boolean> {
//        return when {
//            uid.hasInvalidValue() -> Either.Left(UidException.InvalidUidException(uid))
//            else -> Either.Right(true)
//        }
//    }
//
//    sealed class Either<out A, out B> { // 2
//        class Left<A>(val value: A): Either<A, Nothing>()
//        class Right<B>(val value: B): Either<Nothing, B>()
//    }
//
//    sealed class UidException(message): Exception(message) { // 3
//        data class InvalidUidException(uid: Int): UidException("$uid")
//        data class InvalidUidFormatException(uid: Int): UidException("$uid")
//        data class InvalidUidLengthException(uid: Int): UidException("$uid")
//    }
//}
//
//private fun Int.hasInvalidValue(): Any {
//
//}


