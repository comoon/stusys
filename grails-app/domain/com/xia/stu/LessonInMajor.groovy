package com.xia.stu

class LessonInMajor {

    Major major

    Lesson lesson

    boolean required = true

    static constraints = {
        major unique: 'lesson'
    }
}
