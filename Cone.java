/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.areacalculator;

/**
 *
 * @author Lenovo
 */
public class Cone extends Shape{

   double height,redius;
    public Cone(double height,double redius) {
        this.height=height;
        this.redius=redius;
    }
    @Override
    double getArea(){
        return Math.PI*height*(height+redius);

    }
    
}
