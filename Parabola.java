/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.areacalculator;

/**
 *
 * @author Lenovo
 */
public class Parabola extends Square {

    public Parabola(double height, double wide) {
        super(height, wide);
    }

    @Override
    double getArea() {
        return (8*height*height)/3;
    }
}
