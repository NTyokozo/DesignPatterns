/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobu.designpatterns.test.creationalpatterns;

import com.nobu.patterns.creationaldesignpatterns.builderPattern.CakeDirector;
import com.nobu.patterns.creationaldesignpatterns.builderPattern.Cakes;
import com.nobu.patterns.creationaldesignpatterns.builderPattern.CakesBuilder;
import com.nobu.patterns.creationaldesignpatterns.builderPattern.ClassCakeBuilder;
import com.nobu.patterns.creationaldesignpatterns.builderPattern.MediumCakeBuilder;
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
public class BuilderPatternTest {
    
    public BuilderPatternTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void cakes() {
         
        CakesBuilder cakesBuilder = new  ClassCakeBuilder();
        CakeDirector cakeDirector = new  CakeDirector(cakesBuilder);
        cakeDirector.constructCake();;
        Cakes cakes = cakeDirector.getCakes();
        System.out.println("the cake is " + cakes);
        
         cakesBuilder = new  MediumCakeBuilder();
         cakeDirector = new  CakeDirector(cakesBuilder);
         cakeDirector.constructCake();;
         cakes = cakeDirector.getCakes();
         System.out.println("the cake is " + cakes);
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
