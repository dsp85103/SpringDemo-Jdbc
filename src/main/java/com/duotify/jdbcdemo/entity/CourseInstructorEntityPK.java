package com.duotify.jdbcdemo.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class CourseInstructorEntityPK implements Serializable {
    private int courseId;
    private int instructorId;

    @Column(name = "CourseID", nullable = false)
    @Id
    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    @Column(name = "InstructorID", nullable = false)
    @Id
    public int getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CourseInstructorEntityPK that = (CourseInstructorEntityPK) o;

        if (courseId != that.courseId) return false;
        if (instructorId != that.instructorId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = courseId;
        result = 31 * result + instructorId;
        return result;
    }
}
