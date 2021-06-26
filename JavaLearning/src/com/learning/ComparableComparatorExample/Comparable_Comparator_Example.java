package com.learning.ComparableComparatorExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparable_Comparator_Example {
    public static void main(String[] args) {
        List<Employees> emp = new ArrayList<Employees>();
        emp.add(new Employees("Pankaj", 2000));
        emp.add(new Employees("Archana", 20000));
        emp.add(new Employees("Purvaansh", 20));

        /**
         * Comparator implementation
         *
         */
        Comparator<Employees> compare = new Comparator<Employees>() {
            @Override
            public int compare(Employees emp1, Employees emp2) {
                if (emp1.getEmpName().compareToIgnoreCase(emp2.getEmpName()) > 0)
                    return 1;
                else return -1;
            }
        };

        /**
         * if argument 'compare' is not passed Collections class will use the comparable implementation
         * else it will use the comparator implementation
         */
        Collections.sort(emp, compare);

        for (Employees e : emp) {
            System.out.println(e);
        }
    }
}
