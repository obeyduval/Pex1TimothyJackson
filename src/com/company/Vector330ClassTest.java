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
    }

    @Test
    void setY() {
    }

    @Test
    void testSetX() {
    }

    @Test
    void testSetY() {
    }

    @Test
    void testSetX1() {
    }

    @Test
    void testSetY1() {
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
        Vector330Class c = a.add(b);
        assertEquals(c.getX(),1.3,EPS);
        assertEquals(c.getY(), 4.9, EPS);
    }

    @Test
    void subtract() {
        //assert(a.subtract(a).equals("< 0.0, 0.0 >"));
    }

    @Test
    void dotProduct() {
        //assert(a.add(a).equals("< 9.0, 12.0 >"));
    }

    @Test
    void scale() {
    }

    @Test
    void magnitude() {
        double res = a.magnitude();
        assertEquals(res,5.0,EPS);
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