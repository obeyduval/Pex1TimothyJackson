package com.company;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class Vector330ClassTest {
    private static final double EPS = 1.0E-9;
    Vector330Class a;
    Vector330Class b;
    Vector330Class c;

    @BeforeEach
    void setUp() {
        a = new Vector330Class(3.0, 4.0);
        b = new Vector330Class(-1.7, 0.9);
        c = new Vector330Class(8.4, -4.4);
    }

    @AfterEach
    void tearDown() {
        a = null;
        b = null;
        c = null;
    }

    @Test
    void getX() {
        assertEquals(3.0, a.getX(), EPS);
        assertEquals(-1.7, b.getX(), EPS);
        assertEquals(8.4, c.getX(), EPS);
    }

    @Test
    void getY() {
        assertEquals(4.0, a.getY());
        assertEquals(0.9, b.getY());
        assertEquals(-4.4, c.getY());
    }

    @Test
    void getXint() {
        assertEquals(3, a.getXint());
        assertEquals(-1, b.getXint());
        assertEquals(8, c.getXint());
    }

    @Test
    void getYint() {
        assertEquals(4, a.getYint());
        assertEquals(0, b.getYint());
        assertEquals(-4, c.getYint());
    }

    @Test
    void getXlong() {
        assertEquals(3.0, a.getXlong());
        assertEquals(-1.0, b.getXlong());
        assertEquals(8.0, c.getXlong());
    }

    @Test
    void getYlong() {
        assertEquals(4.0, a.getYlong());
        assertEquals(0.0, b.getYlong());
        assertEquals(-4.0, c.getYlong());
    }

    @Test
    void setX() {
        a.setX(6.89);
        assertEquals(6.89, a.getX(), EPS);
        b.setX(2.3);
        assertEquals(2.3, b.getX(), EPS);
        c.setX(-9.0);
        assertEquals(-9.0, c.getX(), EPS);
    }

    @Test
    void setY() {
        a.setY(4.0);
        assertEquals(4.0, a.getY(), EPS);
        b.setY(8.0);
        assertEquals(8.0, b.getY(), EPS);
        c.setY(-1.0);
        assertEquals(-1.0, c.getY(), EPS);
    }

    @Test
    void testSetX() {
        a.setX(6);
        assertEquals(6, a.getX(), EPS);
        b.setX(2);
        assertEquals(2, b.getX(), EPS);
        c.setX(-9);
        assertEquals(-9, c.getX(), EPS);
    }

    @Test
    void testSetY() {
        a.setY(4);
        assertEquals(4, a.getY(), EPS);
        b.setY(8);
        assertEquals(8, b.getY(), EPS);
        c.setY(-1);
        assertEquals(-1, c.getY(), EPS);
    }

    @Test
    void testSetX1() {
        a.setX(600);
        assertEquals(600, a.getX(), EPS);
        b.setX(200);
        assertEquals(200, b.getX(), EPS);
        c.setX(-900);
        assertEquals(-900, c.getX(), EPS);
    }

    @Test
    void testSetY1() {
        a.setY(400);
        assertEquals(400, a.getY(), EPS);
        b.setY(800);
        assertEquals(800, b.getY(), EPS);
        c.setY(-100);
        assertEquals(-100, c.getY(), EPS);
    }

    @Test
    void testEquals() {
        assertTrue(a.equals(a));
        assertFalse(a.equals(b));
        assertFalse(a.equals(c));
        assertTrue(b.equals(b));
        assertFalse(b.equals(a));
        assertFalse(b.equals(c));
        assertTrue(c.equals(c));
        assertFalse(c.equals(b));
        assertFalse(c.equals(a));
    }

    @Test
    void add() {
        Vector330Class addTest = a.add(a);
        assertEquals(addTest.getX(),6.0,EPS);
        assertEquals(addTest.getY(),8.0, EPS);
        addTest = a.add(b);
        assertEquals(addTest.getX(),1.3,EPS);
        assertEquals(addTest.getY(),4.9, EPS);
        addTest = a.add(c);
        assertEquals(addTest.getX(),11.4,EPS);
        assertEquals(addTest.getY(),-0.4, EPS);

        addTest = b.add(b);
        assertEquals(addTest.getX(),-3.4,EPS);
        assertEquals(addTest.getY(),1.8, EPS);
        addTest = b.add(c);
        assertEquals(addTest.getX(),6.7,EPS);
        assertEquals(addTest.getY(),-3.5, EPS);

        addTest = c.add(c);
        assertEquals(addTest.getX(),16.8,EPS);
        assertEquals(addTest.getY(),-8.8, EPS);
    }

    @Test
    void subtract() {
        Vector330Class subTest = a.subtract(a);
        assertEquals(subTest.getX(),0,EPS);
        assertEquals(subTest.getY(),0, EPS);
        subTest = a.subtract(b);
        assertEquals(subTest.getX(),4.7,EPS);
        assertEquals(subTest.getY(),3.1, EPS);
        subTest = a.subtract(c);
        assertEquals(subTest.getX(),-5.4,EPS);
        assertEquals(subTest.getY(),8.4, EPS);

        subTest = b.subtract(b);
        assertEquals(subTest.getX(),0,EPS);
        assertEquals(subTest.getY(),0, EPS);
        subTest = b.subtract(c);
        assertEquals(subTest.getX(),-10.1,EPS);
        assertEquals(subTest.getY(),5.3, EPS);

        subTest = c.subtract(c);
        assertEquals(subTest.getX(),0,EPS);
        assertEquals(subTest.getY(),0, EPS);
    }

    @Test
    void dotProduct() {

       assertEquals(a.dotProduct(a), 25, EPS);
       assertEquals(a.dotProduct(b), -1.5,EPS);
       assertEquals(a.dotProduct(c), 7.6, EPS);

       assertEquals(b.dotProduct(b), 3.7, EPS);
       assertEquals(b.dotProduct(c), -18.24, EPS);

       assertEquals(c.dotProduct(c), 89.92, EPS);
    }

    @Test
    void scale() {
//        a = new Vector330Class(3.0, 4.0);
//        b = new Vector330Class(-1.7, 0.9);
//        c = new Vector330Class(8.4, -4.4);

        Vector330Class sRes = a.scale(2.0);
        assertEquals(sRes.getX(), 6.0, EPS);
        assertEquals(sRes.getY(), 8.0, EPS);

        sRes = b.scale(-3.5);
        assertEquals(sRes.getX(), 5.95, EPS);
        assertEquals(sRes.getY(), -3.15, EPS);

        sRes = c.scale(9.2);
        assertEquals(sRes.getX(), 77.28, EPS);
        assertEquals(sRes.getY(), -40.48, EPS);
    }

    @Test
    void magnitude() {
        assertEquals(a.magnitude(),5.0,EPS);
        assertEquals(b.magnitude(),2.0,EPS);
        assertEquals(c.magnitude(),9.0,EPS);
    }

    @Test
    void direction() {

    }

    @Test
    void normalize() {
    }

    @Test
    void testToString() {
        assert(a.toString().equals("< 3.0, 4.0 >"));
        assert(b.toString().equals("< -1.7, 0.9 >"));
        assert(c.toString().equals("< 8.4, -4.4 >"));
    }

    @Test
    void parseVector() {
        String goodVector1 = "< 3.0, 4.0 >";
        Scanner in1 = new Scanner(goodVector1);
        Vector330Class parseTest1 = null;
        try {
            parseTest1 = Vector330Class.parseVector(in1);
            assertEquals(parseTest1.getX(), 3.0, EPS);
            assertEquals(parseTest1.getY(), 4.0, EPS);
        } catch (Exception e){
            assertNotNull(parseTest1);
        }

        String goodVector2 = "< -1.7, 0.9 >";
        Scanner in2 = new Scanner(goodVector2);
        Vector330Class parseTest2 = null;
        try {
            parseTest2 = Vector330Class.parseVector(in2);
            assertEquals(parseTest2.getX(), -1.7, EPS);
            assertEquals(parseTest2.getY(), 0.9, EPS);
        } catch (Exception e){
            assertNotNull(parseTest2);
        }

        String goodVector3 = "< 8.4, -4.4 >";
        Scanner in3 = new Scanner(goodVector3);
        Vector330Class parseTest3  = null;
        try {
            parseTest3 = Vector330Class.parseVector(in3);
            assertEquals(parseTest3.getX(), 8.4, EPS);
            assertEquals(parseTest3.getY(), -4.4, EPS);
        } catch (Exception e){
            assertNotNull(parseTest3);
        }
    }
}