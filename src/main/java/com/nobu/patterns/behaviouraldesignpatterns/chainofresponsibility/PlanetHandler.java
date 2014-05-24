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
public abstract class PlanetHandler {

  PlanetHandler successor;

    public void setSuccessor(PlanetHandler successor) {
        this.successor = successor;
    }
     public abstract void handleRequest (PlanetEnum request);
    
    
}
