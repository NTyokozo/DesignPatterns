/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobu.designpatterns.test.structuralpattern;

import com.nobu.patterns.structuraldesignpatterns.adapterpattern.AmountReport;
import com.nobu.patterns.structuraldesignpatterns.adapterpattern.AmountTax;
import com.nobu.patterns.structuraldesignpatterns.adapterpattern.TaxClassReporter;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author nobu
 */
public class AdapterTest {
    
    public AdapterTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
   @Test
        public void testAdapter() {
        
            // class adapter
                 System.out.println("Class Adapter test");
        
        AmountTax amounttax = new TaxClassReporter();
        testamounttax(amounttax);
        
        System.out.println("Object Adapter test");
         amounttax = new AmountReport();
        testamounttax(amounttax);
    }
        
     public static void testamounttax(AmountTax amounttax ) {
        
         amounttax.setTax(0);
         System.out.println("Taxed Amount is :" + amounttax.getTax());
          System.out.println(" Amount after is :" + amounttax.getTotalAmount());
          
          amounttax.setTotalAmount(250.00);
           System.out.println("Taxed Amount is :" + amounttax.getTax());
          System.out.println(" Amount after is :" + amounttax.getTotalAmount());
         
     
        }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
