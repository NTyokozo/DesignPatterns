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
public class VenusHandler extends PlanetHandler {

    @Override
    public void handleRequest(PlanetEnum request) {
        
        if(request == PlanetEnum.VENUS)
        {
            System.out.println("VenusHandler handles" + request);
            System.out.println("Venus is poisonious.\n");
        } else
        
        {
             System.out.println("VenusHandler doesn't handles" + request);
             if(successor!=null)
             {
                  successor.handleRequest(request);
             }
        }
        
    }
    
}