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
public class BigEngine implements Engine{
    
    int horsepower;
    
    public BigEngine()
    {
        horsepower = 220;
        
    }

    public int go() {
        System.out.println("the big engine is runing");
                return horsepower;
    }
}
