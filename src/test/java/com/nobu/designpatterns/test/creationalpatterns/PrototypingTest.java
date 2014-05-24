/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobu.designpatterns.test.creationalpatterns;

import com.nobu.patterns.creationaldesignpatterns.prototypingpattern.Cake;
import com.nobu.patterns.creationaldesignpatterns.prototypingpattern.Desert;
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
public class PrototypingTest {
    
    public PrototypingTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void desert() {

            Desert desert = new Desert("Ice Cream");
        System.out.println("Desert 1 is " + desert);
        Desert desert1 = (Desert)desert.doClone();
        System.out.println("Desert 1 is "+ desert1);
        
        
        Cake cake = new Cake ("Sweet");
        System.out.println("Cake taste is :" +cake );
        Cake cake1 = (Cake) cake.doClone();
        System.out.println("Cake taste is :"+cake1);
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
