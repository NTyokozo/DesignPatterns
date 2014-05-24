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
public class SlimTea extends Tea{

    @Override
    public void getIngredients() {
            System.out.println("Skim Milk , water , Harbex Teabag"); 
    }

    @Override
    public void boilWater() {
        System.out.println("Boil water twice");   
    }

    @Override
    public void cleanUp() {
        System.out.println("Put everthing where ot belongs");   
    }
    
}
