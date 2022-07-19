/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.areacalculator;

/**
 *
 * @author Lenovo
 */
public class Pyramid extends Shape {

    double height, wide;

    public Pyramid(double height, double wide) {
        this.height=height;
        this.wide=wide;
    }

    @Override
    double getArea() {
       double base=height/2;
       double e = Math.sqrt((base * base) + (wide * wide));
        return (height * height) + (2*height * e);
    }
}
