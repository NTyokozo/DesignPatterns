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
public class InterpreterContext {
 
    public String getBinaryFormat(int i){
        return Integer.toBinaryString(i);
    }
     
    public String getHexadecimalFormat(int i){
        return Integer.toHexString(i);
    }
}
