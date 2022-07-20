/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.areacalculator;

/**
 *
 * @author Lenovo
 */
public class Cube extends Square{
    public Cube(double base,double height) {
       super(base,height);
    }

    @Override
    double getArea() {
        return 6*super.getArea();
    }
}
