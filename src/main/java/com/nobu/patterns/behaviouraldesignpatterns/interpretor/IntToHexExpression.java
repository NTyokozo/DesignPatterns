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
 
public class IntToHexExpression implements Expression {
 
    private int i;
     
    public IntToHexExpression(int c){
        this.i=c;
    }
     
    @Override
    public String interpret(InterpreterContext ic) {
        return ic.getHexadecimalFormat(i);
    }
 
}
