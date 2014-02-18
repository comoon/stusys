package com.xia.stu

/**
 * 创建一个学生类
 */
class Student {

    /**
     * 学生是属于班级的
     */
    static belongsTo = [classGrade:ClassGrade ]

    /**
     * 学生的名字
     */
    String firstname

    /**
     * 学生的姓
     */
    String familyname

    /**
     * 学生的学号
     */
    String xuehao

    /**
     * 学生的性别
     */
    Sex sex

    /**
     * 学生的班级
     */
    ClassGrade classGrade

    static constraints = {
        /**
         * 每个学生的学号是唯一的
         */
        xuehao unique: true
    }
}
