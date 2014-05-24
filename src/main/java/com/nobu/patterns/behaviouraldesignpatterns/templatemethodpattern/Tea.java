/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobu.patterns.behaviouraldesignpatterns.templatemethodpattern;

/**
 *
 * @author nobu
 */
public abstract class Tea {
    public final void doTea()
    {
        getIngredients();
        boilWater ();
        drink();
        cleanUp();
    }
    public abstract void getIngredients();
    
    public abstract void boilWater();
    
    public void drink()
    {
        System.out.println("Very Sweet");
    }
     public abstract void cleanUp();
}
