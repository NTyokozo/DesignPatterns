/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobu.patterns.structuraldesignpatterns.adapterpattern;

/**
 *
 * @author nobu
 */
public interface AmountTax {
    
    public double getTax();
    public void setTax(double tax);
    public double getTotalAmount();
    public void setTotalAmount(double totalAmount);
    
}
