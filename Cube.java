/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.areacalculator;

/**
 *
 * @author Lenovo
 */
public class Cube extends Shape{
    double base;
    public Cube(double base) {
       this.base=base;
    }

    @Override
    double getArea() {
        return 6*base*base;
    }
}
