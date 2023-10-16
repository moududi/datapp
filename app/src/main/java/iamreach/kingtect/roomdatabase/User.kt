package iamreach.kingtect.roomdatabase

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
    @PrimaryKey(autoGenerate = true)
    val uid:Int=0,
    @ColumnInfo(name = "NAME")
    var name: String,
    @ColumnInfo(name = "AGE")
    var age: String,
    @ColumnInfo(name = "EMAIL")
    var email: String,
    @ColumnInfo(name = "MOBILE")
    var mobiLe: String
)