package com.empwage;

import java.util.Random;

public class Employee {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage");
        int present=1;
        Random random = new Random();
        int empCheck = random.nextInt(2);
        if(empCheck==present){
            System.out.println("Employee is Present");
        }
        else {
            System.out.println("Employee is absent");
        }
    }

}
