/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson7;

/**
 *
 * @author Никита
 */
 
  public class Par{
   int a; 
   int b; 
   int c; 
    
  

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = (int) a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = (int) b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = (int) c;
    }

    @Override
    public String toString() {
        return "a=" + a  + " b=" + b + " c=" + c;
    }
}  

