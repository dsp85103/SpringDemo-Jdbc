package com.duotify.jdbcdemo.entity;

import javax.persistence.*;

@Entity
@Table(name = "OfficeAssignment", schema = "dbo", catalog = "ContosoUniversity")
public class OfficeAssignmentEntity {
    private int instructorId;
    private String location;

    @Id
    @Column(name = "InstructorID", nullable = false)
    public int getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }

    @Basic
    @Column(name = "Location", nullable = true, length = 50)
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OfficeAssignmentEntity that = (OfficeAssignmentEntity) o;

        if (instructorId != that.instructorId) return false;
        if (location != null ? !location.equals(that.location) : that.location != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = instructorId;
        result = 31 * result + (location != null ? location.hashCode() : 0);
        return result;
    }
}
