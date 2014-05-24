/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobu.designpatterns.test.behaviouralpatterns;

import com.nobu.patterns.behaviouraldesignpatterns.templatemethodpattern.FiveRoses;
import com.nobu.patterns.behaviouraldesignpatterns.templatemethodpattern.SlimTea;
import com.nobu.patterns.behaviouraldesignpatterns.templatemethodpattern.Tea;
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
public class TemplateMethodTest {
    
    public TemplateMethodTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
   @Test
    public void testTemplate() {
        Tea meal1 = new SlimTea();
        meal1.doTea();

        System.out.println();

        Tea meal2 = new FiveRoses();
        meal2.doTea();
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
