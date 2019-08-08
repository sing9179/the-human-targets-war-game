/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class GroupOfCardsTest {
    
    public GroupOfCardsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of showCards method, of class GroupOfCards.
     */
    @Test
    public void testShowCardsGood() {
        System.out.println("showCards");
        GroupOfCards instance = new GroupOfCards();
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.showCards();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testShowCardsBad() {
        System.out.println("showCards");
        GroupOfCards instance = new GroupOfCards();
        ArrayList<String> expResult = new ArrayList<>();
        expResult.add("Clubs of Two");
        ArrayList<String> result = instance.showCards();
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testShowCardsBoundary() {
        System.out.println("showCards");
        GroupOfCards instance = new GroupOfCards();
        ArrayList<String> expResult = new ArrayList<>();
        expResult.add("");
        ArrayList<String> result = instance.showCards();
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of shuffle method, of class GroupOfCards.
     */
    @Test
    public void testShuffle() {
        System.out.println("shuffle");
        GroupOfCards instance = new GroupOfCards();
        instance.create();
        instance.shuffle();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class GroupOfCards.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        GroupOfCards instance = new GroupOfCards();
        instance.create();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class GroupOfCards.
     */
    @Test
    public void testToStringGood() {
        System.out.println("toString");
        GroupOfCards instance = new GroupOfCards();
        String expResult = "good";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testToStringBad() {
        System.out.println("toString");
        GroupOfCards instance = new GroupOfCards();
        String expResult = "goods";
        String result = instance.toString();
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testToStringBoundary() {
        System.out.println("toString");
        GroupOfCards instance = new GroupOfCards();
        String expResult = "";
        String result = instance.toString();
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of generate method, of class GroupOfCards.
     */
    @Test
    public void testGenerate() {
        System.out.println("generate");
        GroupOfCards instance = new GroupOfCards();
        instance.create();
        instance.generate();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of pop method, of class GroupOfCards.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        ArrayList<String> cards = null;
        GroupOfCards instance = new GroupOfCards();
        instance.create();
        String expResult = instance.cards.get(instance.cards.size()-1);
        String result = instance.pop(instance.cards);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
