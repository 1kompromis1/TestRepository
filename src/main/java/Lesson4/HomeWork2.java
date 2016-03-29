/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson4;

/**
 *
 * @author Никита
 */
public class HomeWork2 {
    public static void main(String[] args) {
        int r=10,R=20;
        double PI=3.14;
        double l,s0,s;
        l=2*PI*r;
        s0=PI*r*r;
        s=(R*R-r*r)*PI;
        System.out.print("длина окружности l=");
        System.out.println(l);
        System.out.print("площадь окружности so=" );
        System.out.println(s0 );
        System.out.print("площадь кольца s=");
        System.out.println(s );
    }
    
}
