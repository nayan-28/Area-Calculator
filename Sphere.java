/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.areacalculator;

/**
 *
 * @author Lenovo
 */
public class Sphere extends Circle{
    double height;
   public Sphere(double redius) {
        super(redius);
    }

    @Override
    double getArea() {
        return 4*super.getArea();
    }
}
