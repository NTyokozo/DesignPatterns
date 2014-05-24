/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobu.patterns.creationaldesignpatterns.builderPattern;

/**
 *
 * @author nobu
 */
public class ClassCakeBuilder implements CakesBuilder{

    
    private  Cakes cake;

    public ClassCakeBuilder() {
        cake = new Cakes();
    }

    public void buildName() {
        cake.setName("Black Forest") ;
    }

    public void buildFlavour() {
        cake.setFlavour("Red Valvet");
    }

    public Cakes getCake() {
        return cake;
    }
    
    
}
