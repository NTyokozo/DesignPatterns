/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobu.patterns.creationaldesignpatterns.singletonpattern;

/**
 *
 * @author nobu
 */
public class Singleton {
    
    private static Singleton animals = null;
  
    private Singleton()
    {
    }
    public static Singleton getInstance()
    {
        if (animals == null)
        {
            animals = new Singleton();
        }
        return animals;
    }
    public void displaySingleton()
    {
        System.out.print("My First Example of singleton");
    }
    
   
}
