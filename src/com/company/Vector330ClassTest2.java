package com.company;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Vector330ClassTest2 {
    private static final double EPS = 1.0E-9;
    Vector330Class a;
    Vector330Class b;
    Vector330Class c;

    /**
     * @BeforeEach
     */
    void setUp() {
        a = new Vector330Class(3.0, 4.0);
        b = new Vector330Class(-1.7, 0.9);
    }

    /**
     * @AfterEach
     */
    void tearDown() {
        a = null;
        b = null;
    }

    /**
     * @Test
     */
    void getX() {

    }

    /**
     * @Test
     */
    void getY() {

    }

    /**
     * @Test
     */
    void getXint() {

    }

    /**
     * @Test
     */
    void getYint() {

    }

    /**
     * @Test
     */
    void getXlong() {

    }

    /**
     * @Test
     */
    void getYlong() {

    }

    /**
     * @Test
     */
    void setX() {

    }

    /**
     * @Test
     */
    void setY() {

    }

    /**
     * @Test
     */
    void setX1() {

    }

    /**
     * @Test
     */
    void setY1() {

    }

    /**
     * @Test
     */
    void setX2() {

    }

    /**
     * @Test
     */
    void setY2() {

    }

    /**
     * @Test
     */
    void equals() {

    }

    /**
     * @Test
     */
    void add() {

    }

    /**
     * @Test
     */
    void subtract() {

    }

    /**
     * @Test
     */
    void scale() {

    }

    /**
     * @Test
     */
    void magnitude() {
        double res = a.magnitude();
        assertEquals(res,5.0,EPS);
    }

    /**
     * @Test
     */
    void direction() {

    }

    /**
     * @Test
     */
    void normalize() {

    }

    /**
     * @Test
     */
    void parseVector() {

    }

    /**
     * @Test
     */
    void dotProduct() {

    }
}

