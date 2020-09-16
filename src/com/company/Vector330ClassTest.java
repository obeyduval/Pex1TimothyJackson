package com.company;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
    }

    @AfterEach
    void tearDown() {
        a = null;
        b = null;
    }

    @Test
    void getX() {
    }

    @Test
    void getY() {
    }

    @Test
    void getXint() {
    }

    @Test
    void getYint() {
    }

    @Test
    void getXlong() {
    }

    @Test
    void getYlong() {
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
    }

    @Test
    void add() {
    }

    @Test
    void subtract() {
    }

    @Test
    void dotProduct() {
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
}