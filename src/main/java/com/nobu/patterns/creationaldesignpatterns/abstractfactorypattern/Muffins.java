/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobu.patterns.creationaldesignpatterns.abstractfactorypattern;

import com.nobu.patterns.creationaldesignpatterns.factorymethodpattern.Taste;

/**
 *
 * @author nobu
 */
public class Muffins extends Taste  {

    @Override
    public String tasting() {
        
       return "Blueberry"  ;  }
    
}
