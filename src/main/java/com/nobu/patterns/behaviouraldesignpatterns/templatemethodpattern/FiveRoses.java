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
public class FiveRoses extends Tea{

    @Override
    public void getIngredients() {
            System.out.println("Five Roses, water , Powder Milk"); 
    }

    @Override
    public void boilWater() {
        System.out.println("Boil water once");   
    }

    @Override
    public void cleanUp() {
        System.out.println("Put everthing where ot belongs");   
    }
    
}
