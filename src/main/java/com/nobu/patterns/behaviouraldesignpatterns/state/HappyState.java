/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobu.patterns.behaviouraldesignpatterns.state;

/**
 *
 * @author nobu
 */
public class HappyState implements  EmotionalState{

    public String sayHello() {
        return "Bye , Friend";
    }

    public String sayGoodbye() {
        return "hello , friend";
    }
    
}
