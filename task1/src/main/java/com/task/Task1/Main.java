/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.task.Task1;

import java.util.Scanner;

/**
 *
 * @author Dimas
 */
public class Main {
        
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double temp = 0;
        int loop = 1;
        
        System.out.println("+--------------------------------------+");
        System.out.println("| WATER TEMPERATURE CONVERSION PROGRAM ");
        System.out.println("+--------------------------------------+");
        System.out.println("Data Entry");
        System.out.println("----------");
        System.out.print("Temperature In Celsius : ");
        temp = input.nextDouble();
        
        while(loop!=3){
            Conversion convert = new Conversion(temp);
            
            System.out.println("\nOption");
            System.out.println("1. View Conversion Data");
            System.out.println("2. Edit Conversion Data");
            System.out.println("3. Exit");
            System.out.print("Choose   : ");
            loop = input.nextInt();
            
            switch(loop){
                case 1:
                    System.out.println("\nTemperature In Celcius  : " + temp + "°C");
                    System.out.println("In Fahrenheit           : " + convert.convertFahrenheit() + "°F");
                    System.out.println("In Reamur               : " + convert.convertReamur() + "°R");
                    System.out.println("In Kelvin               : " + convert.convertKelvin() + "K");
                    System.out.println("Water Condition " + convert.conditionWater() + ".");
                    break;
                
                case 2:
                    System.out.println("\nData Entry");
                    System.out.println("----------");
                    System.out.print("Temperature In Celsius : ");
                    temp = input.nextFloat();
                    break;
                
                case 3:
                    break;
                
                default:
                    System.out.println("\nOption does not exist. Please enter the options correctly!");
                    break;
            }
        }
        
    }
    
}
