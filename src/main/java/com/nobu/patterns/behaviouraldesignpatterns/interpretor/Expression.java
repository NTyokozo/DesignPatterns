/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobu.patterns.behaviouraldesignpatterns.interpretor;

/**
 *
 * @author nobu
 */
public interface Expression {
 
    String interpret(InterpreterContext ic);
}