/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.task.Task1;

/**
 *
 * @author Dimas
 */
public class Conversion {
    double temp;

    public Conversion(double temp) {
        this.temp = temp;
    }
    
    double convertReamur(){
        return (4 * temp)/5;
    }
    
    double convertFahrenheit(){
        return (9 * temp)/5 + 32;
    }
    
    double convertKelvin(){
        return temp + 273.15;
    }
    
    String conditionWater(){
        String condition = "Normal";
        if(temp<=0){
            condition = "Frozen";
        }else if(temp>=100){
            condition = "Boiling";
        }
        
        return condition;
    }
}
