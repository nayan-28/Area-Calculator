/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.areacalculator;

/**
 *
 * @author Lenovo
 */
public class Ellipse extends Rectangle {

    public Ellipse(double height, double wide) {
        super(height, wide);
    }

    @Override
    double getArea() {
        return Math.PI*height*wide;
    }
}
