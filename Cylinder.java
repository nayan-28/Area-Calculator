/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.areacalculator;

/**
 *
 * @author Lenovo
 */
public class Cylinder extends Circle{
    double height;
    public Cylinder(double redius,double height) {
        super(redius);
        this.height=height;
    }

    @Override
    double getArea() {
        return 2*super.getArea()+2*Math.PI*redius*height;
    }  
}
