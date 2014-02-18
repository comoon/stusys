package com.xia.stu

class College {

    String name

    String description

    static hasMany = [majors: Major]

    static constraints = {

    }
}
