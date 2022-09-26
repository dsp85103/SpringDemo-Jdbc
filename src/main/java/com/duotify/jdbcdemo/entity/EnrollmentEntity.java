package com.duotify.jdbcdemo.entity;

import javax.persistence.*;

@Entity
@Table(name = "Enrollment", schema = "dbo", catalog = "ContosoUniversity")
public class EnrollmentEntity {
    private int enrollmentId;
    private Integer grade;

    @Id
    @Column(name = "EnrollmentID", nullable = false)
    public int getEnrollmentId() {
        return enrollmentId;
    }

    public void setEnrollmentId(int enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    @Basic
    @Column(name = "Grade", nullable = true)
    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EnrollmentEntity that = (EnrollmentEntity) o;

        if (enrollmentId != that.enrollmentId) return false;
        if (grade != null ? !grade.equals(that.grade) : that.grade != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = enrollmentId;
        result = 31 * result + (grade != null ? grade.hashCode() : 0);
        return result;
    }
}
