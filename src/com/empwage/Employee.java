package com.empwage;

import java.util.Random;

public class Employee {

    public static final int IS_FULL_TIME=1;
    public static final int IS_PART_TIME=2;
    public static final int EMP_RATE_PER_HOUR=20;
    public static final int Num_OF_WORKING_DAYS=2;
    public static final int MAX_HRS_IN_MONTH=10;

    public static void main(String[] args) {

        int empHours = 0,empWage = 0,totalEmpWage=0;
        int totalEmpHrs=0, totalWorkingDays=0;

        while(totalEmpHrs<=MAX_HRS_IN_MONTH && totalWorkingDays <Num_OF_WORKING_DAYS) {
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
            totalEmpHrs+=empHours;
            System.out.println("Day: " + totalWorkingDays +" Emp hours " +empHours);
        }
        totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
    System.out.println(" Total Emp Wage" + totalEmpWage);
    }
}