package com.duotify.jdbcdemo.entity;

import javax.persistence.*;

@Entity
@Table(name = "CourseInstructor", schema = "dbo", catalog = "ContosoUniversity")
@IdClass(CourseInstructorEntityPK.class)
public class CourseInstructorEntity {
    private int courseId;
    private int instructorId;

    @Id
    @Column(name = "CourseID", nullable = false)
    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    @Id
    @Column(name = "InstructorID", nullable = false)
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

        CourseInstructorEntity that = (CourseInstructorEntity) o;

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
