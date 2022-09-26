package com.duotify.jdbcdemo.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "vwCourseStudentCount", schema = "dbo", catalog = "ContosoUniversity")
public class VwCourseStudentCountEntity {
    private Integer departmentId;
    private String name;
    private int courseId;
    private String title;
    private Integer studentCount;

    @Basic
    @Column(name = "DepartmentID", nullable = true)
    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    @Basic
    @Column(name = "Name", nullable = true, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
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
    @Column(name = "StudentCount", nullable = true)
    public Integer getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(Integer studentCount) {
        this.studentCount = studentCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VwCourseStudentCountEntity that = (VwCourseStudentCountEntity) o;

        if (courseId != that.courseId) return false;
        if (departmentId != null ? !departmentId.equals(that.departmentId) : that.departmentId != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (studentCount != null ? !studentCount.equals(that.studentCount) : that.studentCount != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = departmentId != null ? departmentId.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + courseId;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (studentCount != null ? studentCount.hashCode() : 0);
        return result;
    }
}
