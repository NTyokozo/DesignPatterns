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
public class Desert implements Prototype {

    String name;

    public Desert(String name) {
        this.name = name;
    }
    
    
    public Prototype doClone() {
        return new Desert(name);
    }

    @Override
    public String toString() {
        return "Desert{" + "name=" + name + '}';
    }
    
}
