package com.xia.stu

/**
 *  学院公共课程
 */
class Lesson {

    /**
     * 课程名字          \
     */
    String name

    /**
    *  课程概述
     */

    String description

    /**
    * 课程是学院的一部分
     */
    static belongsTo = [college: College]

    static constraints = {
    }
}
