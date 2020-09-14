package com.company;

public class Vector330Class {
    private static double EPS = 1.0E-9;
    private double x;
    private double y;

    /*
    constructor initializing both x and y components with doubles
     */
    public Vector330Class (double x, double y) {
        this.x = x;
        this.y = y;
    }

    /*
     constructor initializing both x and y components with ints
     */
    public Vector330Class(int x, int y){
        this.x = (double) x;
        this.y = (double) y;
    }

    /*
     constructor initializing both x and y components with longs
     */
    public Vector330Class(long x, long y){
        this.x = (double) x;
        this.y = (double) y;
    }

    /*
        returns x component of vector as a double
     */
    public double getX(){
        return (double) this.x;
    }

    /*
        returns y component of vector as a double
     */
    public double getY(){
        return (double) this.x;
    }
    /*
        returns x component of vector as a int
     */
    public int getXint(){
        return (int) this.x;
    }

    /*
        returns y component of vector as a double
     */
    public int getYint(){
        return (int) this.x;
    }

    /*
     returns x component of vector as a long
    */
    public long getXlong(){
        return (long) this.x;
    }

    /*
        returns y component of vector as a long
     */
    public long getYlong(){
        return (long) this.x;
    }

    /*
     sets the x component of vector using an input of type double
    */
    public void setX(double x){
        this.x = x;
    }

    /*
     sets the y component of vector using an input of type double
    */
    public void setY(double y){
        this.y = y;
    }

    /*
     sets the x component of vector using an input of type int
    */
    public void setX(int x){
        this.x = x;
    }

    /*
     sets the y component of vector using an input of type int
    */
    public void setY(int y){
        this.y = y;
    }

    /*
     sets the x component of vector using an input of type long
    */
    public void setX(long x){
        this.x = x;
    }

    /*
     sets the y component of vector using an input of type long
    */
    public void setY(long y){
        this.y = y;
    }

    /*
    still need to fix
    checks for vector equality if this and the other (v) vector have
    components within epsilon of each other
     */
    public boolean equals(Vector330Class v){
        if(v == null){
            return true;
        } else {
            return false;
        }
    }
}

