package com.xia.stu

/**
 *   创建班级
 */
class ClassGrade {

    /**
     * 入学年份
     */
    int year
     /**
    *  班级名称
      */
    String classname

    /**
    *   概述
     */
    String description
    /**
     * 班级是属于学院的
     */
    static belongsTo = [college: College]
    static constraints = {
    }
}
