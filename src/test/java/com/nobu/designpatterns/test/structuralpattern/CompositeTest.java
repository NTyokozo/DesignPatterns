/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nobu.designpatterns.test.structuralpattern;

import com.nobu.patterns.structuraldesignpatterns.compositepattern.Composite;
import com.nobu.patterns.structuraldesignpatterns.compositepattern.Student;
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
public class CompositeTest {
    
    public CompositeTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
       @Test
    public void testComposite() {
        Student stud1 = new Student("Bob");
        Student stud2 = new Student("Fred");
        Student stud3 = new Student("Sue");
        Student stud4 = new Student("Ellen");
        Student stud5 = new Student("Joe");

        Composite composite1 = new Composite();
        composite1.add(stud1);
        composite1.add(stud2);

        Composite composite2 = new Composite();
        composite2.add(stud3);
        composite2.add(stud4);

        Composite composite3 = new Composite();
        composite3.add(composite1);
        composite3.add(composite2);
        composite3.add(stud5);

        System.out.println("Calling 'sayHello' on leaf1");
        stud1.giveName();

        System.out.println("\nCalling 'sayHello' on composite1");
        composite1.giveName();

        System.out.println("\nCalling 'sayHello' on composite2");
        composite2.giveName();

        System.out.println("\nCalling 'sayGoodbye' on composite3");
        composite3.giveCourse();
    
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
