/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobu.patterns.behaviouraldesignpatterns.mediator;

/**
 *
 * @author nobu
 */
public class AmericanSeller 
{
  Mediator mediator;
  float priceInDollar;

    public AmericanSeller(Mediator mediator, float priceInDollar) {
        this.mediator = mediator;
        this.priceInDollar = priceInDollar;
        this.mediator.registerAmericanSeller(this);
    }
  public boolean isBidAccpeted(float  bidInDollars)
  {
      if(bidInDollars >= priceInDollar)
      {
          System.out.println("Seller accepts the bid of "+ bidInDollars +"Dollars \n");
          return true;
      } else
      {
         System.out.println("Seller rejects the bid of "+ bidInDollars +"Dollars \n");
          return false; 
      }
  }
  
}
