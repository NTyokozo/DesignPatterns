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
public class Mediator 
{
    Buyer swedishBuyer ;
    Buyer frenchBuyer ;
    AmericanSeller americanSeller ;
    DollarConverter dollarConverter ;
public Mediator () {

}
public void registerSweidishBuyer(SwedishBuyer swedishBuyer)
{
    this . swedishBuyer = swedishBuyer ;
}
public void registerFreshBuyer(FrenchBuyer frenchBuyer )
{
    this . frenchBuyer = frenchBuyer ;
}

public void registerAmericanSeller(AmericanSeller  americanSeller  )
{
        this . americanSeller = americanSeller ;
}

public void registerDollarConverter(DollarConverter  dollarConverter  )
{
            this . dollarConverter = dollarConverter ;
}
public boolean placeBid ( float bid ,String unitOfCurrency ) 
{

    float dollarAmount = dollarConverter.convertCurrencyToDollars(bid, unitOfCurrency); 
     return americanSeller.isBidAccpeted(bid);
  
}
}
