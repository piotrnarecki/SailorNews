package pl.piotrnarecki.sailornews.db

import pl.piotrnarecki.sailornews.models.Source
import androidx.room.TypeConverter

class Converters {

    @TypeConverter
    fun fromSource(source: Source):String{
        return source.name
    }


    @TypeConverter
    fun toSource(name:String): Source {
        return Source(name,name)
    }
}