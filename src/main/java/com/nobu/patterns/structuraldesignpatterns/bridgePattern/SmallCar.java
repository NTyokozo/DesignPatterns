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
public class SmallCar extends Vehicle{
    
    public SmallCar(Engine engine)
    {
        this.weightInKilos = 400;
        this.engine = engine;
    }

    @Override
    public void drive() {
        System.out.println("the big bus is driviing");    
        int horsepower = engine.go();
        reportOnSpeed(horsepower);
    }

}
