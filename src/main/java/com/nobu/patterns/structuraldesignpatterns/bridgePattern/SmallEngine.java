/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobu.patterns.structuraldesignpatterns.bridgePattern;

/**
 *
 * @author nobu
 */
public class SmallEngine implements Engine{
    
    int horsepower;
    
    public SmallEngine()
    {
        horsepower = 90;
        
    }

    public int go() {
        System.out.println("the small engine is runing");
                return horsepower;
    }
}