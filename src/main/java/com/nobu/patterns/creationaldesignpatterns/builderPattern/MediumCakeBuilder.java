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
public class MediumCakeBuilder implements CakesBuilder{

    
    private  Cakes cake;

    public MediumCakeBuilder() {
        cake = new Cakes();
    }

    public void buildName() {
        cake.setName("Hazel") ;
    }

    public void buildFlavour() {
        cake.setFlavour("Custard");
    }

    public Cakes getCake() {
        return cake;
    }
    
}
