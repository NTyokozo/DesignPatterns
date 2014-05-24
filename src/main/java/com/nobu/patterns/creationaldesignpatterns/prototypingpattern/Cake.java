/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobu.patterns.creationaldesignpatterns.prototypingpattern;

/**
 *
 * @author nobu
 */
public class Cake implements  Prototype
{
    String tasting;

    public Cake(String tasting) {
        this.tasting = tasting;
    }
    
    public Prototype doClone() {
        return new Cake(tasting) ;
    }

    @Override
    public String toString() {
        return "Cake{" + "tasting=" + tasting + '}';
    }
    
}
