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
public class TaxClassReporter extends TaxReport implements AmountTax{

    public TaxClassReporter() {
    }

    public double getTax() {
        return amount;
    }

    public void setTax(double amount) {
       this.amount = amount;
    }

    public double getTotalAmount() {
        return calcTax(amount);
    }

    public void setTotalAmount(double totalTax) {

        this.amount = calcTotAmount(totalTax);
    }
     private double calcTax(double  a)
     {
         return a * 0.14;
     }
     private double calcTotAmount(double  b)
     {
         return calcTax(b) + b ;
     }
    
}
