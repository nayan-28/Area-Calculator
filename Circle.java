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
    double redius,height;

    public Circle(double redius,double height) {
        this.height=height;
        this.redius=redius;
    }
    @Override
    double getArea(){
        return Math.PI*redius*redius;
    }
}
