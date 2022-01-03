package com.empwage;

import java.util.Random;

public class Employee {

    public static final int IS_FULL_TIME=1;
    public static final int IS_PART_TIME=2;

    public static int computeEmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth) {
        int empHours = 0, empWage = 0, totalEmpWage = 0;
        int totalEmpHrs = 0, totalWorkingDays = 0;

        while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
            totalWorkingDays++;
            Random random = new Random();
            int empCheck = random.nextInt(3);
            switch (empCheck) {
                case IS_FULL_TIME:
                    empHours = 8;
                    break;
                case IS_PART_TIME:
                    empHours = 4;
                    break;
                default:
                    empHours = 0;
            }
            totalEmpHrs += empHours;
            System.out.println("Day: " + totalWorkingDays + " Emp hours " + empHours);
        }
        totalEmpWage = totalEmpHrs * empRatePerHour;
        System.out.println(" Total Emp Wage" + totalEmpWage);
        return totalEmpWage;
    }

    public static void main(String[] args) {
        computeEmpWage("DMart",20,2,10);
        computeEmpWage("Reliance",10,4,20);
    }
}