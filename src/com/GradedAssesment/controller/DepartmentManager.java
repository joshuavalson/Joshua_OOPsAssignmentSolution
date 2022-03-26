package com.GradedAssesment.controller;
import java.util.Scanner;

import com.GradedAssesment.model.AdminDepartment;
import com.GradedAssesment.model.HrDepartment;
import com.GradedAssesment.model.TechDepartment;

public class DepartmentManager{

    public static void main(String[] args) {
        HrDepartment objHr = new HrDepartment();
        AdminDepartment objAdmin = new AdminDepartment();
        TechDepartment objTech = new TechDepartment();
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
                        System.out.println("Welcome to "+ objAdmin.departmentName());
                        System.out.println(objAdmin.getTodaysWork());
                        System.out.println(objAdmin.getWorkDeadline());
                        System.out.println(objAdmin.isTodayAHoliday());
                    }
                    break;
                case 2:
                    {
                        System.out.println("Welcome to "+ objHr.departmentName());
                        System.out.println(objHr.doActivity());
                        System.out.println(objHr.getTodaysWork());
                        System.out.println(objHr.getWorkDeadline());
                        System.out.println(objHr.isTodayAHoliday());
                    }
                    break;
                case 3:
                    {
                        System.out.println("Welcome to "+ objTech.departmentName());
                        System.out.println(objTech.getTodaysWork());
                        System.out.println(objTech.getWorkDeadline());
                        System.out.println(objTech.getTechStackInformation());
                        System.out.println(objTech.isTodayAHoliday());
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
    
    }
}