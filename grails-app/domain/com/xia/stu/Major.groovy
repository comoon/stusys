package com.xia.stu

class Major {

    String name

    String description

    static belongsTo = [college: College]

    static constraints = {
    }
}
