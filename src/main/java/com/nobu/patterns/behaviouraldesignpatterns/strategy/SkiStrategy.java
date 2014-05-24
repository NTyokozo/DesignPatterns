/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobu.patterns.behaviouraldesignpatterns.strategy;

/**
 *
 * @author nobu
 */
public class SkiStrategy  implements  Strategy{

    public boolean checkTemperature(int temperatureInF) {
        
    
        if(temperatureInF >= 32 )
        {
            return true;
        }else
        {
          return false;   
        }
      }
}
