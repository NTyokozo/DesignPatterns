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
public class DollarConverter {
    Mediator mediator;
    
    public static final  float  DOLLAR_UNIT = 1.0f;
    public static final  float  EURO_UNIT = 0.7f;
    public static final  float  KRONA_UNIT = 0.8f;
    
    
    public DollarConverter(Mediator mediator)
    {
        this.mediator= mediator;
        mediator.registerDollarConverter(this);
    }
    
    private  float convertEuroToDollar(float euros)
    {
        float dollar = euros*(DOLLAR_UNIT /EURO_UNIT);
        System.out.println("Converting"+euros + " euros to " + dollar + "dollars");
        return dollar;
    }
    
     private  float convertKranorToDollar(float kronor)
    {
        float dollar = kronor *(DOLLAR_UNIT / KRONA_UNIT);
        System.out.println("Converting"+ kronor + " kronor to " + dollar + "dollars");
        return dollar;
    }
     public float convertCurrencyToDollars(float amount , String unitOfConrrency)
     {
         if("krona".equalsIgnoreCase(unitOfConrrency))
         {
             return convertEuroToDollar(amount);
         }
         else
         {
             return convertEuroToDollar(amount);
         }
     }
}
