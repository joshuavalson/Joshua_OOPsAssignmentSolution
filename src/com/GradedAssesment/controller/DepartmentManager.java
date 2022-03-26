package com.GradedAssesment.controller;
import java.util.Scanner;
import com.GradedAssesment.sevices.driver;

public class DepartmentManager{

    public static void main(String[] args) {
        driver objDriver = new driver();
        Scanner scanner = new Scanner(System.in);
        boolean exitFlag = false;

        while(!exitFlag){
            System.out.println("Choose the department:");
            System.out.println("1. Admin");
            System.out.println("2. HR");
            System.out.println("3. Tech");
            System.out.println("4. Logout");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    {
                        System.out.println("Welcome to "+ objDriver.objAdmin.departmentName());
                        System.out.println(objDriver.objAdmin.getTodaysWork());
                        System.out.println(objDriver.objAdmin.getWorkDeadline());
                        System.out.println(objDriver.objAdmin.isTodayAHoliday());
                        System.out.println("\n");
                    }
                    break;
                case 2:
                    {
                        System.out.println("Welcome to "+ objDriver.objHr.departmentName());
                        System.out.println(objDriver.objHr.doActivity());
                        System.out.println(objDriver.objHr.getTodaysWork());
                        System.out.println(objDriver.objHr.getWorkDeadline());
                        System.out.println(objDriver.objHr.isTodayAHoliday());
                        System.out.println("\n");
                    }
                    break;
                case 3:
                    {
                        System.out.println("Welcome to "+ objDriver.objTech.departmentName());
                        System.out.println(objDriver.objTech.getTodaysWork());
                        System.out.println(objDriver.objTech.getWorkDeadline());
                        System.out.println(objDriver.objTech.getTechStackInformation());
                        System.out.println(objDriver.objTech.isTodayAHoliday());
                        System.out.println("\n");
                    }
                    break;  
                case 4:
                    exitFlag = true;
                    break;
                default:
                    System.out.println("Invalid Input, please try again");
                    break;
            }
        }
        scanner.close();   
    
    }
}