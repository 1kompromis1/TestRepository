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

    


import java.util.Scanner;
import static javax.xml.bind.DatatypeConverter.printInt;

/**
 *
 * @author Никита
 */
public class HomeWork1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         Scanner vn=new Scanner(System.in);
         Scanner v1=new Scanner(System.in);
         Scanner v2=new Scanner(System.in);
         Scanner v3=new Scanner(System.in);
         Scanner v4=new Scanner(System.in);
         Scanner v=new Scanner(System.in);     
        int ans1,ans2;               
        HomeWorkPart2 p=new HomeWorkPart2();
        HomeWorkPart2 s=new HomeWorkPart2();
        HomeWorkPart2 ci=new HomeWorkPart2();
        HomeWorkPart2 k=new HomeWorkPart2();
        HomeWorkPart2 yk=new HomeWorkPart2();               
        double Par;
        double Shar;
        double Cil;
        double Kon;
        double Yskon;
        System.out.println("Введите способ задания фигуры: 1-генерация случайных чисел, 2- ввод вручную: ");
        ans1=sc.nextInt();
         System.out.println("Выберите фигуру:1-paralelepiped,2-shar,3-cilindr,4-konys,5-ysechkonys ");
        ans2=sc.nextInt();
        switch(ans1){
            case 1:
       
        switch(ans2){
            case 1:                
                p.a=1+(int)(Math.random()*((100)+1)) ;
                p.c=1+(int)(Math.random()*((100)+1)) ;
                p.b=1+(int)(Math.random()*((100)+1)) ;                
                System.out.println("a="+ p.a);
                System.out.println("b="+ p.b);
                System.out.println("c="+ p.c);            
                Par=p.getPar();
                System.out.println("par=" + Par);                      
            break;
            case 2:               
                s.rs=1+(int)(Math.random()*((100)+1));
                System.out.println("r="+ s.rs); // выводим на экран
                Shar=s.getShar();
                System.out.println("shar=" + Shar);               
            break;
            case 3:
                System.out.println("h,r");
                ci.hc=1+(int)(Math.random()*((100)+1));
                ci.rc=1+(int)(Math.random()*((100)+1));
                printInt((int)ci.hc); // выводим на экран
                Cil=ci.getCil();
                System.out.println("cil=" + Cil);                     
            break;          
            case 4:               
                k.hk=1+(int)(Math.random()*((100)+1));
                k.rk=1+(int)(Math.random()*((100)+1));              
                Kon=k.getKon();
                System.out.println("kon=" + Kon);                     
            break;          
            case 5:              
                yk.hy=1+(int)(Math.random()*((100)+1));
                yk.r1=1+(int)(Math.random()*((100)+1));
                yk.r2=1+(int)(Math.random()*((100)+1));           
                Yskon=yk.getYskon();
                System.out.println("yskon=" + Yskon);                     
            break;          
            default: System.out.println("Введено неверное значение!");
            }     
            break;
        case 2:
        
        switch(ans2){
            case 1:
                System.out.println("vvedite a,b,c");
                p.a=v.nextInt();                            
                p.b=v.nextInt();                            
                p.c=v.nextInt();                            
                Par=p.getPar();
                System.out.println("par=" + Par);                      
            break;
            case 2:
                System.out.println("r");
                s.rs=v1.nextInt();
                printInt((int) s.rs); // выводим на экран
                Shar=s.getShar();
                System.out.println("shar=" + Shar);               
            break;
            case 3:
                System.out.println("h,r");
                ci.hc=v2.nextInt();
                ci.rc=v2.nextInt();
                Cil=ci.getCil();
                System.out.println("cil=" + Cil);                     
            break;          
            case 4:
                System.out.println("h,r");
                k.hk=v3.nextInt();
                k.rk=v3.nextInt();
                Kon=k.getKon();
                System.out.println("kon=" + Kon);                     
            break;          
            case 5:
                System.out.println("h,r");
                yk.hy=v4.nextInt();
                yk.r1=v4.nextInt();
                yk.r2=v4.nextInt();
                Yskon=yk.getYskon();
                System.out.println("yskon=" + Yskon);                     
            break;          
            default: System.out.println("Введено неверное значение!");
        }     
    }
}
}


