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
public class Cakes
{
    private String name;
    private String flavour;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    @Override
    public String toString() {
        return "Cakes{" + "name=" + name + ", flavour=" + flavour + '}';
    }
    
    
    
}
