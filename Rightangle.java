/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.areacalculator;

/**
 *
 * @author Lenovo
 */
public class Rightangle extends Scalene{

    public Rightangle(double base,double height){
        super (base,height,(Math.sqrt((height*height)+(base*base))));
    }
    
}
