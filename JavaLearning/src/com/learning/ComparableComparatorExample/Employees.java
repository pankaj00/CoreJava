package com.learning.ComparableComparatorExample;

public class Employees implements Comparable<Employees> {

    private String EmpName = null;
    private Integer EmpId = null;

    public Employees(String empName, Integer empId) {
        EmpName = empName;
        EmpId = empId;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public Integer getEmpId() {
        return EmpId;
    }

    public void setEmpId(Integer empId) {
        EmpId = empId;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "EmpName='" + EmpName + '\'' +
                ", EmpId=" + EmpId +
                '}';
    }

    @Override
    public int compareTo(Employees emp2) {
        if (this.getEmpId() > emp2.getEmpId()) {
            return 1;
        } else return -1;
    }
}
