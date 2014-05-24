/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobu.patterns.creationaldesignpatterns.abstractfactorypattern;

import com.nobu.patterns.creationaldesignpatterns.factorymethodpattern.Cake;
import com.nobu.patterns.creationaldesignpatterns.factorymethodpattern.Taste;
import com.nobu.patterns.creationaldesignpatterns.factorymethodpattern.Vinegar;


/**
 *
 * @author nobu
 */
public class MealsFactory extends FoodFactory
{
     public Taste getTaste(String type)
    {
        if("cake".equalsIgnoreCase(type))
        {
            return new Cake();
        }
        else
        {
            return new Vinegar();
        }
        
    }
}
