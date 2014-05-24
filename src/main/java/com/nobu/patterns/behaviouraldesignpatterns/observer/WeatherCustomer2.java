/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobu.patterns.behaviouraldesignpatterns.observer;

/**
 *
 * @author nobu
 */
public class WeatherCustomer2 implements WeatherObserver

{

    public void doUpdate(int temperature) {
        System.out.println("Weather Customer 2 just found out the temperature is:"+temperature);
    }
    
}
