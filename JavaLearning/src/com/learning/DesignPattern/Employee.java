package com.learning.DesignPattern;

public class Employee {
    String firstName = null;
    String lastName = null;
    Integer EmployeeNo = null;
    Integer salary = null;

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", EmployeeNo=" + EmployeeNo +
                ", salary=" + salary +
                '}';
    }

    public Employee(EmployeeBuilder empBuilder){
        this.firstName = empBuilder.firstName;
        this.lastName = empBuilder.lastName;
        this.salary = empBuilder.salary;
        this.EmployeeNo = empBuilder.EmployeeNo;
    }

    public static class EmployeeBuilder{
        String firstName = null;
        String lastName = null;
        Integer EmployeeNo = null;
        Integer salary = null;

        public EmployeeBuilder name(String firstName, String lastName){
            this.firstName = firstName;
            this.lastName= lastName;
            return this;
        }

        public EmployeeBuilder employeeno(Integer empno){
            this.EmployeeNo = empno;
            return this;
        }

        public EmployeeBuilder salary(Integer sal){
            this.salary = sal;
            return this;
        }

        public Employee build(){
            return new Employee(this);
        }

    }
}
