package com.example.viewrecycle


class Hero (
    var name: String="",
    var from:String="",
    var photo:String = "") {
    operator fun component1(): String {
        return name;
    }
    operator fun component2(): String {
        return  from;
    }
    operator fun component3(): String {
        return photo;
    }
}