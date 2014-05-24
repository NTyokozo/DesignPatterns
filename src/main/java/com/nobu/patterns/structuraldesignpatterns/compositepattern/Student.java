/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobu.patterns.structuraldesignpatterns.compositepattern;

/**
 *
 * @author nobu
 */
public class Student implements Component
{
    String studNumber;

    public Student(String studNumber) {
        this.studNumber = studNumber;
    }

    public void giveName() {
        System.out.println(studNumber+"My name is Nobubele");
    }

    public void giveCourse() {
        System.out.println(studNumber+"Am doing IT"); 
    }
    
    
}
