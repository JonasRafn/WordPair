///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import static org.junit.Assert.*;
//
//import Main.WordPair;
//import org.junit.Assert;
//
///**
// *
// * @author Tobias
// */
//public class TestJUnitTest {
//    
//    Dice d;
//    
//    public TestJUnitTest() {
//    }
//    
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
//    
//    @Before
//    public void setUp() {
//    }
//    
//    @After
//    public void tearDown() {
//    }
//
//    // TODO add test methods here.
//    // The methods must be annotated with annotation @Test. For example:
//    //
//    // @Test
//    // public void hello() {}
//    
//    @Test
//    public void testHasBirthDay() {
//        Person p = new Person("Ib", 10, "12345678");
//        p.hasBirthday();
//        Assert.assertEquals(11, p.getAge());
//    }
//    
//    @Test
//    public void testSetAge() {
//        Person p = new Person("Ib", 10, "12345678");
//        p.setAge(11);
//        assertEquals(11, p.getAge());
//    }
//    
//    @Test (expected = illegalArgumentException.class)
//    public void testSetAgeInvalid() {
//        Person p = new Person("Ib", 10, "12345678");
//        p.setAge(12);
//    }
//    
//    
//    
//    @Test
//    public void testDiceRoll() {
//        d = new Dice();
//        int eyes = d.showPips();
//        assertTrue(eyes > 0 && eyes < 7);
//    }
//}
