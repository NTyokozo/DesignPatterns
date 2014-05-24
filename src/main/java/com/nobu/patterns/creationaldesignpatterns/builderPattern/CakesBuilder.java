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
public interface CakesBuilder 
{
    public void buildName();
    public void buildFlavour();
    public Cakes getCake();
    
}
