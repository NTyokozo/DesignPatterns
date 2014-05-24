/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobu.patterns.behaviouraldesignpatterns.chainofresponsibility;

/**
 *
 * @author nobu
 */
public class EarthHandler extends PlanetHandler {

    @Override
    public void handleRequest(PlanetEnum request) {
        
        if(request == PlanetEnum.EARTH)
        {
            System.out.println("EarthHandler handles" + request);
            System.out.println("Earth is comfrortable.\n");
        } else
        
        {
             System.out.println("EarthHandler doesn't handles" + request);
             if(successor!=null)
             {
                  successor.handleRequest(request);
             }
        }
        
    }
    
}