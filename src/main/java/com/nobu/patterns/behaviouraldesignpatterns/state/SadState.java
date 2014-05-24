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
public class SadState implements  EmotionalState{

    public String sayHello() {
        return "Bye , Sniff , Sniff";
    }

    public String sayGoodbye() {
        return "hello , Sniff , sniff";
    }
}
