package com.nobu.designpatterns.test.creationalpatterns;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.nobu.patterns.creationaldesignpatterns.abstractfactorypattern.AbstractFactory;
import com.nobu.patterns.creationaldesignpatterns.abstractfactorypattern.FoodFactory;
import com.nobu.patterns.creationaldesignpatterns.factorymethodpattern.Taste;
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
public class AbstractFactoryTest {
    
    public AbstractFactoryTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
  @Test
    public void testFood() {
        AbstractFactory abstractFactory = new AbstractFactory();
        
        FoodFactory foodf = abstractFactory.getFoodFactory("solids");
         Taste ta = foodf.getTaste("muffins");
         System.out.println("ta taste is "+ ta.tasting());
         Taste tb = foodf.getTaste("cupcakes");
         System.out.println("tb taste is "+ tb.tasting());
         
         
          FoodFactory foodd = abstractFactory.getFoodFactory("food");
         Taste tc = foodd.getTaste("cake");
         System.out.println("tc taste is "+ tc.tasting());
         Taste td = foodd.getTaste("vinegar");
         System.out.println("td taste is "+ td.tasting());
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
