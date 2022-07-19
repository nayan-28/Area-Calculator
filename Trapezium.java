/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.areacalculator;

/**
 *
 * @author Lenovo
 */
public class Trapezium extends Shape{
    double base, height, wide;
    public Trapezium(double base,double wide,double height) {
       this.height = height;
       this.wide = wide;
       this.base=base;
    }

    @Override
    double getArea() {
        return (base+wide)*(height/2);
    }
}
