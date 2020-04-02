package com.example.kotlindemoapp

object DatabaseService {

    val con: String = "DB"

    fun create(std: StudentData): StudentData{

        return StudentData(std.name,std.lastName,std.age)
    }
}