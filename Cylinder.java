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

    public Cylinder(double redius,double height) {
        super(redius,height);
    }

    @Override
    double getArea() {
        return 2*Math.PI*redius*(redius+height);
    }  
}
