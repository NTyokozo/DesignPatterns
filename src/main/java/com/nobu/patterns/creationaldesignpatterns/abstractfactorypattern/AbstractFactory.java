/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobu.patterns.creationaldesignpatterns.abstractfactorypattern;

import com.nobu.patterns.creationaldesignpatterns.factorymethodpattern.TasteFactory;

/**
 *
 * @author nobu
 */
public class AbstractFactory {
    
    public FoodFactory getFoodFactory(String type)
    {
     
        if("food".equalsIgnoreCase(type))
        {
            return new MealsFactory();
        }else
        {
            return new CakesFactory();
        }
    }
    
}
