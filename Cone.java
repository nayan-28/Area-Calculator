/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.areacalculator;

/**
 *
 * @author Lenovo
 */
public class Cone extends Shape{

   double height,wide;
    public Cone(double height,double wide) {
        this.height=height;
        this.wide=wide;
    }
    @Override
    double getArea(){
        return Math.PI*height*(height+wide);

    }
    
}
