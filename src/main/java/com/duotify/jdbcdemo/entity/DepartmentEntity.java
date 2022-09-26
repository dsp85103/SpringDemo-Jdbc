package com.duotify.jdbcdemo.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "Department", schema = "dbo", catalog = "ContosoUniversity")
public class DepartmentEntity {
    private int departmentId;
    private String name;
    private Object budget;
    private Timestamp startDate;
    private Object rowVersion;

    @Id
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
    @Column(name = "Budget", nullable = false)
    public Object getBudget() {
        return budget;
    }

    public void setBudget(Object budget) {
        this.budget = budget;
    }

    @Basic
    @Column(name = "StartDate", nullable = false)
    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    @Basic
    @Column(name = "RowVersion", nullable = false)
    public Object getRowVersion() {
        return rowVersion;
    }

    public void setRowVersion(Object rowVersion) {
        this.rowVersion = rowVersion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DepartmentEntity that = (DepartmentEntity) o;

        if (departmentId != that.departmentId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (budget != null ? !budget.equals(that.budget) : that.budget != null) return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;
        if (rowVersion != null ? !rowVersion.equals(that.rowVersion) : that.rowVersion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = departmentId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (budget != null ? budget.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (rowVersion != null ? rowVersion.hashCode() : 0);
        return result;
    }
}
