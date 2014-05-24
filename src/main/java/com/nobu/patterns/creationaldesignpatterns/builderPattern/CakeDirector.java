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
public class CakeDirector {
    
    private CakesBuilder cakesbuilder = null;

    public CakeDirector( CakesBuilder cakesbuilder)
    {
        this.cakesbuilder = cakesbuilder;
    }
    
    public  void constructCake()
    {
        cakesbuilder.buildName();
        cakesbuilder.buildFlavour();
       
    }
    public Cakes getCakes()
    {
        return  cakesbuilder.getCake();
    }
    
}
