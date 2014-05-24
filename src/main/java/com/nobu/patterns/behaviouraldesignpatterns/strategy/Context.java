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
public class Context
{
    int tempertureInF;
    Strategy strategy;

    public Context(int tempertureInF, Strategy strategy) {
        this.tempertureInF = tempertureInF;
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int getTempertureInF() {
        return tempertureInF;
    }
    public  boolean  getResults()
    {
         return strategy.checkTemperature(tempertureInF);
    }

    
}
