/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.areacalculator;

/**
 *
 * @author Lenovo
 */
public class Polygonal extends Shape{
    double height,wide;
    public Polygonal(double height,double wide) {
        this.height=height;
        this.wide=wide;
    }
    @Override
    double getArea(){
        return ((height*wide*wide)/4)*(Math.tan(180/height));

    }
}
