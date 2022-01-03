package com.empwage;

import java.util.Random;

public class Employee {

    public static final int IS_FULL_TIME=1;
    public static final int IS_PART_TIME=2;

    private final String company;
    private final int empRatePerHour;
    private final int numOfWorkingDays;
    private final int maxHoursPerMonth;
    private int totalEmpWage;

    public Employee(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth)
    {
        this.company=company;
        this.empRatePerHour=empRatePerHour;
        this.numOfWorkingDays=numOfWorkingDays;
        this.maxHoursPerMonth=maxHoursPerMonth;

    }
    public void computeEmpWage() {
        int empHours = 0,totalEmpHrs = 0, totalWorkingDays = 0;

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
    }

    @Override
    public String toString(){
        return "Total Emp Wage for company: " +company+ " is: " + totalEmpWage;
    }
    public static void main(String[] args) {
        Employee dMart = new Employee("DMart",20,2,10);
        Employee reliance = new Employee("Reliance",10,4,20);
        dMart.computeEmpWage();
        System.out.println(dMart);
        reliance.computeEmpWage();
        System.out.println(reliance);
    }
}