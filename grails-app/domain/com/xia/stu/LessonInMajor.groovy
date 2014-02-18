package com.xia.stu

/**
 *  专业内部课程
 */
class LessonInMajor {

    /**
     * 课程的类别
     */
    LessonGrade lessonGrade
    /**
     *引用专业这个类
     */

    Major major

    /**
     * 引用课程这个类
     */
    Lesson lesson

    /**
     * 专业内部课程是必修课
     */
    boolean required = true

    static constraints = {
        /**
         * 这些课程是唯一的名字的
         */
        major unique: 'lesson'
    }
}
