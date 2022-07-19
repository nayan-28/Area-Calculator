/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.areacalculator;

/**
 *
 * @author Lenovo
 */
public class Scalene extends Shape{
    double base,height,wide;

    public Scalene(double base,double height,double wide) {
        this.base=base;
        this.height=height;
        this.wide=wide;
    }

    @Override
    double getArea() {
        double s=(base+height+wide)/2;
        return Math.sqrt(s*(s-base)*(s-height)*(s-wide));
    }
    
}
