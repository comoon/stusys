package com.xia.stu

/**
 * 创建一个专业类
 */
class Major {

    /**
     * 专业的名字
     */
    String name

    /**
     * 专业的概述
     */
    String description

    /**
     * 这些专业是属于学院的
     */
    static belongsTo = [college: College]

    static constraints = {
    }
}
