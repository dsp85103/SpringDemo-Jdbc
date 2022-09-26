package com.duotify.jdbcdemo.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "vwDepartmentCourseCount", schema = "dbo", catalog = "ContosoUniversity")
public class VwDepartmentCourseCountEntity {
    private int departmentId;
    private String name;
    private Integer courseCount;

    @Basic
    @Column(name = "DepartmentID", nullable = false)
    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
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
    @Column(name = "CourseCount", nullable = true)
    public Integer getCourseCount() {
        return courseCount;
    }

    public void setCourseCount(Integer courseCount) {
        this.courseCount = courseCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VwDepartmentCourseCountEntity that = (VwDepartmentCourseCountEntity) o;

        if (departmentId != that.departmentId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (courseCount != null ? !courseCount.equals(that.courseCount) : that.courseCount != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = departmentId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (courseCount != null ? courseCount.hashCode() : 0);
        return result;
    }
}
