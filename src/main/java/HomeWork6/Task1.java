/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeWork6;

import java.util.Scanner;

/**
 *
 * @author ������
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean fin=false;
        while(!fin){
            System.out.println("Enter the required transaction number:");
            System.out.println("2-cylinder volume calculation");
            System.out.println("1-calculation of the box volume");
            System.out.println("3-sphere volume calculation");
            System.out.println("4-calculation of the volume of the hollow cylinder");
            System.out.println("a character to quit");
            
            try{
                int operation=Integer.parseInt(sc.next());
                switch(operation){
                    case 1:{
                        System.out.println("enter via enter the width, height, length");
                        int w=Integer.parseInt(sc.next());
                        int h=Integer.parseInt(sc.next());
                        int l=Integer.parseInt(sc.next());
                        System.out.println("the volume of the box =" + parallelepipedVolume(w,h,l));
                    }break;
                    case 2:{
                        System.out.println("enter enter through the radius and height");
                        int r=Integer.parseInt(sc.next());
                        int h=Integer.parseInt(sc.next());
                        System.out.println("cylinder volume = " + cilindrVolume(r,h));
                    }break;
                    case 3:{
                        System.out.println("enter enter through the range");
                        int r=Integer.parseInt(sc.next());
                        System.out.println("the volume of a sphere = " + ballVolume(r));
                    }break;
                    case 4:{
                        System.out.println("enter enter through the height, the inner radius and the outer radius");
                        int h=Integer.parseInt(sc.next());
                        int r1=Integer.parseInt(sc.next());
                        int r2=Integer.parseInt(sc.next());
                        System.out.println("volume of the hollow cylinder = " + polcilindrVolume(h,r1,r2));
                    }break;
                    default:{
                        fin=true;
                    }
                }
                System.out.println("Do you want to continue?");
                System.out.println("1-yes");
                System.out.println("2-no");
                int operation2=Integer.parseInt(sc.next());
                switch(operation2){
                    case 1:{ fin=false;
                 }break;
                    case 2:{fin=true;
                 }
               }
            }catch(Exception ex){
                fin=true;
            }
        }  
        System.out.println("goodbye!");
    }

    private static double parallelepipedVolume(int w, int h, int l) {
        return(w*h*l);
    }

    private static double cilindrVolume(int r, int h) {
     return(double)(r*h);
    }

    private static double ballVolume(int r) {
        return(double)((4*Math.PI*r*r*r)/3);
    }

    private static double polcilindrVolume(int h, int r1, int r2) {
     return(double)(Math.PI*h*(r2*r2-r1*r1));   
}
}
