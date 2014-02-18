package com.xia.stu

/**
 * 创建一个学院
 */
class College {

    /**
     *  学院的名字
     */
    String name

    /**
     * 学院的编号
     */
    String  collegeID

    /**
    *  学院的概述
     */
    String description

    /**
    *   学院包含的专业
     */
    static hasMany = [majors: Major]

    static constraints = {
        collegeID  unique: true
    }
}
