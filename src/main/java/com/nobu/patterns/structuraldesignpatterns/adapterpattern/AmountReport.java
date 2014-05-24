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
public class AmountReport implements  AmountTax{

    TaxReport taxreport;

    public AmountReport( ) {
       taxreport = new TaxReport();
    }
    
    
    public double getTax() {
      return  taxreport.getAmount();
    }

    public void setTax(double tax) {
            taxreport.setAmount(tax);
    }

    public double getTotalAmount() {
        return calcTax(taxreport.getAmount());     }

    public void setTotalAmount(double totalAmount) {
        taxreport.setAmount(calcTotAmount(totalAmount));
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
