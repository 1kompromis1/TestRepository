/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeWork6;

import java.util.Scanner;

/**
 *
 * @author Никита
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean fin=false;
        while(!fin){
            System.out.println("введите номер необходимой операции:");
            System.out.println("2-рассчет объема цилиндра");
            System.out.println("1-рассчет объема параллелепипеда");
            System.out.println("3-рассчет объема шара");
            System.out.println("4-рассчет объема полого цилиндра");
            System.out.println("иной символ для выхода");
            
            try{
                int operation=Integer.parseInt(sc.next());
                switch(operation){
                    case 1:{
                        System.out.println("введите через enter ширину,высоту,длину");
                        int w=Integer.parseInt(sc.next());
                        int h=Integer.parseInt(sc.next());
                        int l=Integer.parseInt(sc.next());
                        System.out.println("объем параллелепипеда =" + parallelepipedVolume(w,h,l));
                    }break;
                    case 2:{
                        System.out.println("введите через enter радиус и высоту");
                        int r=Integer.parseInt(sc.next());
                        int h=Integer.parseInt(sc.next());
                        System.out.println("объем цилиндра = " + cilindrVolume(r,h));
                    }break;
                    case 3:{
                        System.out.println("введите через enter радиус");
                        int r=Integer.parseInt(sc.next());
                        System.out.println("объем шара = " + ballVolume(r));
                    }break;
                    case 4:{
                        System.out.println("введите через enter высоту,внутренний радиус и внешний радиус");
                        int h=Integer.parseInt(sc.next());
                        int r1=Integer.parseInt(sc.next());
                        int r2=Integer.parseInt(sc.next());
                        System.out.println("объем полого цилиндра = " + polcilindrVolume(h,r1,r2));
                    }break;
                    default:{
                        fin=true;
                    }
                }
                System.out.println("Желаете продолжить?");
                System.out.println("1-да");
                System.out.println("2-нет");
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
        System.out.println("до свидания!");
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
