package com.learning.DesignPattern;

public class BuilderDesignPattern {

    public static void main(String[] args){
        Employee.EmployeeBuilder builder  = new Employee.EmployeeBuilder();
        Employee emp = builder.name("Pankaj","Kumar").employeeno(1).build();
        System.out.println(emp);
    }
}
