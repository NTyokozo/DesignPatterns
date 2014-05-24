/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobu.patterns.structuraldesignpatterns.compositepattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nobu
 */
public class Composite implements  Component{
    List <Component> componets =new ArrayList<Component>();

    public void giveName() {
        for(Component component : componets){
            component.giveName();
        }
            
    }

    public void giveCourse() {
     for(Component component : componets){
            component.giveCourse();
        }
    }
    
    public  void add(Component component)
    {
        componets.add(component);
    }
    
    public  void remove(Component component)
    {
        componets.remove(component);
    }
    
    public List<Component> getComponents()
    {
        return componets;
    }
    public  Component getComponent(int index)
    {
        return componets.get(index);
    }}

