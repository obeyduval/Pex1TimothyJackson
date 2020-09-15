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
        return v == null;
    }

    /*
    does vector addition of this vector with the one passed in
     */
    public Vector330Class add(Vector330Class v){
        //vector addition

        return v;
    }

    /*
    subtracts passed in vector from this vector
     */

    public Vector330Class subtract(Vector330Class v){
        return v;
    }

    /*
     computes the dot product of this vector and the other vector
     */

    public double dotProduct(Vector330Class v){
        return 0.0;
    }

    /*
    does a scalar-vector multiplication of this vector with double value passed in
     */

    public Vector330Class scale( double s) {
        //return;
    }

    /*
    computes the magnitude (2-norm or length) of this vector
     */

    public double magnitude(){

        return 0.0;
    }

    /*
    computes and returns the direction (orientation) of the vector in radians
     */

    public double direction(){
        return 0.0;
    }

    /*
    creates a normalized (of length one) vector in same direction as this vector
     */

    public Vector330Class normalize(){
        //return;
    }

    /*
    overrides the default toString() method producing an angle-bracket version of this vector
     */

    public java.lang.String toString(){
        //return;
    }

    /*
     inputs a Scanner object from which it reads and parses a string representing the
     vector with and expected form of "< 3.0, 4.0 >" - note spaces are needed after '<',
     after the comma, and before the '>'.
     */
    public static Vector330Class parseVector(java.util.Scanner s) throws java.lang.Exception{
        //return;
    }
}







