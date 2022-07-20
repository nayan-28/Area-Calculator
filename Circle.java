/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.areacalculator;

/**
 *
 * @author Lenovo
 */
public class Circle extends Shape{
    double redius;

    public Circle(double redius) {
        this.redius=redius;
    }
    @Override
    double getArea(){
        return Math.PI*redius*redius;
    }
}
