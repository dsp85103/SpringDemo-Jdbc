package com.duotify.jdbcdemo.entity;

import javax.persistence.*;

@Entity
@Table(name = "Course", schema = "dbo", catalog = "ContosoUniversity")
public class CourseEntity {
    private int courseId;
    private String title;
    private int credits;

    @Id
    @Column(name = "CourseID", nullable = false)
    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    @Basic
    @Column(name = "Title", nullable = true, length = 50)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "Credits", nullable = false)
    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CourseEntity that = (CourseEntity) o;

        if (courseId != that.courseId) return false;
        if (credits != that.credits) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = courseId;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + credits;
        return result;
    }
}
