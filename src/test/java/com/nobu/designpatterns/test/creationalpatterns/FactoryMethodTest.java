/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobu.designpatterns.test.creationalpatterns;

import com.nobu.patterns.creationaldesignpatterns.factorymethodpattern.Taste;
import com.nobu.patterns.creationaldesignpatterns.factorymethodpattern.TasteFactory;
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
public class FactoryMethodTest {
    
    public FactoryMethodTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void taste() {
    
         TasteFactory tasteFactory = new TasteFactory();
        Taste t1 = tasteFactory.getTaste("solids");
        System.out.println("t1 is a " + t1.tasting());
        
        Taste t2 = tasteFactory.getTaste("liquids");
        System.out.println("t1 is a " + t2.tasting());
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
