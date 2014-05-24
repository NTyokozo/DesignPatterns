/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobu.designpatterns.test.behaviouralpatterns;

import com.nobu.patterns.behaviouraldesignpatterns.interpretor.InterpreterClient;
import com.nobu.patterns.behaviouraldesignpatterns.interpretor.InterpreterContext;
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
public class InterpretorTest {
    
    public InterpretorTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    public void testInterpretor() {
    String str1 = "28 in Binary"; 
    String str2 = "28 in Hexadecimal"; 
    
    InterpreterClient ec = new InterpreterClient(new InterpreterContext()); 
    System.out.println(str1+"= "+ec.interpret(str1)); 
    System.out.println(str2+"= "+ec.interpret(str2));  
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
