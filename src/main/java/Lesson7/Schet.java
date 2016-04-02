/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson7;

import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author Никита
 */
public class Schet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         Random r=new Random();
        int ans1,ans2;               
        Par p=new Par();
        Shar s=new Shar();
        Cilindr c=new Cilindr();
        Konys k=new Konys();
        Ysechkonys yk=new Ysechkonys();
        System.out.println("sposob zadaniz : 1-random, 2- enter manually: ");
        ans1=sc.nextInt();
         System.out.println("vibor figur:1-paralelepiped,2-shar,3-cilindr,4-konys,5-ysechkonys ");
        ans2=sc.nextInt();    
            switch(ans2){
            case 1:{  
                if(ans1==2){
                    System.out.println("enter via enter the length, width, height");
                   p.a=Integer.parseInt(sc.next());
                   p.b=Integer.parseInt(sc.next());
                   p.c=Integer.parseInt(sc.next());
                }else{
                p.a=r.nextInt();
                p.b=r.nextInt();
                p.c=r.nextInt();
                }
                System.out.println(p.toString()); 
                System.out.println("parallelepipedVolume =" + parallelepipedVolume(p.a,p.b,p.c));
            }break;
            case 2:{  
                if(ans1==2){
                    System.out.println("enter the radius");
                    s.r=Integer.parseInt(sc.next());
                }else{
                s.r=r.nextInt();
                }
                System.out.println(s.toString()); 
                System.out.println("Shar =" + Shar(s.r));
            }break;
            case 3:{  
                 if(ans1==2){
                    System.out.println("enter enter through the radius, height");
                    c.r=Integer.parseInt(sc.next());
                    c.h=Integer.parseInt(sc.next());
                }else{
                c.r=r.nextInt();
                c.h=r.nextInt();}
                System.out.println(c.toString()); 
                System.out.println("Cilindr =" + Cilindr(c.h,c.r));
            }break;
            case 4:{  
                 if(ans1==2){
                    System.out.println("enter enter through the radius, height");
                    k.r=Integer.parseInt(sc.next());
                    k.h=Integer.parseInt(sc.next());
                }else{
                k.r=r.nextInt();
                k.h=r.nextInt();}
                System.out.println(k.toString()); 
                System.out.println("Konys =" + Konys(k.h,k.r));
            }break;
            case 5:{  
                 if(ans1==2){
                    System.out.println("enter enter through a small radius, a large radius, height");
                    yk.r1=Integer.parseInt(sc.next());
                    yk.r2=Integer.parseInt(sc.next());
                    yk.h=Integer.parseInt(sc.next());
                }else{
                yk.r1=r.nextInt();
                yk.r2=r.nextInt();
                yk.h=r.nextInt();}
                System.out.println(yk.toString()); 
                System.out.println("Ysechkonys =" + Ysechkonys(yk.h,yk.r1,yk.r2));
            }break;
         
        }
}
    
    public static double Ysechkonys(int r1,int r2,int h) {
      return (((Math.PI*h*(r1*r1+r2*r2+r1*r2))/3));  
    }

    
     public static double Konys(int r,int h) {
        return ((Math.PI*r*r*h)/3);
    }
     public static double Cilindr(int h,int r) {
     return (Math.PI*r*r*h);   
    }
    
     public static double parallelepipedVolume(int a, int b, int c) {
        return(a*b*c); 
    }
     public static double Shar( int r) {
        return((Math.PI*4*r*r*r)/3);
    }
}


