package com.xia.stu

class Lesson {

    String name

    String description

    static belongsTo = [college: College]

    static constraints = {
    }
}
