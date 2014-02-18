package com.xia.stu

class Student {


    static belongsTo = [major: Major, college: College]

    String firstname

    String familyname

    String xuehao

    Sex sex

    ClassGrade classGrade

    static constraints = {
        xuehao unique: true
    }
}
