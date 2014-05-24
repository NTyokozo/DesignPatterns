/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobu.patterns.behaviouraldesignpatterns.mediator;

/**
 *
 * @author nobu
 */
public class FrenchBuyer extends  Buyer{

   Mediator mediator;
   
    public FrenchBuyer(Mediator mediator) {
        super(mediator,"Euro");
        this.mediator.registerFreshBuyer(this);
    }
    
    
}
