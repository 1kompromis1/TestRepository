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
 
  public class HomeWorkPart2{
   double a; 
   double b; 
   double c; 
   double r1; 
   double hy; 
   double r2;  
   double rs;  
   double rc;  
   double rk;  
   double hc;  
   double hk;  
    
      double getPar(){ 
return (a*b*c); 
}
   double getShar(){
     return (4*Math.PI*rs*rs)/3;
}
   double getCil(){
     return hc*Math.PI*rc*rc;
}
   double getKon(){
     return (hk*Math.PI*rk*rk)/3;
}
   double getYskon(){
     return (hy*Math.PI*(r1*r1+r2*r2+r1*r2))/3;
}  
 
   public int setA() {
            return (int) a;
        }
   public int getA() {
            return (int) a;
        }
    public int getB() {
            return  (int) b;
        }
   public int setB() {
            return (int) b;
        }
   public int getC(){
            return (int) c;
        }
   public int setC(){
            return (int) c;
        }
   public int getR1() {
            return (int) r1;
        }
   public int setR1() {
            return (int) r1;
        }
   public int getR2() {
            return (int) r2;
        }
   public int setR2() {
            return (int) r2;
        }
   public int getHY() {
            return (int) hy;
        }
   public int setHY() {
            return (int) hy;
        }
   public int getRS() {
            return (int) rs;
        }
   public int setRS() {
            return (int) rs;
        }
   public int getRC() {
            return (int) rc;
        }
   public int setRC() {
            return (int) rc;
        }
   public int getRK() {
            return (int) rk;
        }
   public int setRK() {
            return (int) rk;
        }
   public int getHC() {
            return (int) hc;
        }
   public int setHC() {
            return (int) hc;
        }
   public int getHK() {
            return (int) hk;
        }
   public int setHK() {
            return (int) hk;
        }

  
    

   

}  

