/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobu.designpatterns.test.structuralpattern;

import com.nobu.patterns.structuraldesignpatterns.facadepattern.Facade;
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
public class facadeTest {
    
    public facadeTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
  
    @Test
    public void testFacade() {
        
        Facade facade = new Facade();

        int x = 3;
        System.out.println("Cube of " + x + ":" + facade.cubeX(3));
        System.out.println("Cube of " + x + " times 2:" + facade.cubeXTimes2(3));
        System.out.println(x + " to sixth power times 2:" + facade.xToSixthPowerTimes2(3));
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
