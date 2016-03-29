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
public class Task2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m,n,i=0,j=0,ans1,ans2;
        System.out.print("������� ���������� �����  �������:");
        n=sc.nextInt();
        System.out.print("������� ���������� ��������  �������:");
        m=sc.nextInt();
        System.out.print(" ������� ������ ������� �������: 1-��������� ��������� �����, 2- ���� �������: ");
        ans1=sc.nextInt();
        int[][] matr1= new int[n][m];          
        int[][] matr2= new int[n][m];
        switch(ans1){
            case 1:
                System.out.println("1 �������:");
                initArray(matr1); // ��������� ������ ���������� �������
                printArray(matr1); // ������� �� �����
                System.out.println("2 �������:");
                initArray(matr2); // ��������� ������ ���������� �������
                printArray(matr2); // ������� �� �����
            break;
            case 2: 
                System.out.println("1 �������:");
                HinArray(matr1); // ������ �������� ��������� �������
                printArray(matr1); // ������� �� �����
                System.out.println("2 �������:");
                HinArray(matr2); // ������ �������� ��������� �������
                printArray(matr2); // ������� �� �����
            break;
            default: System.out.println("������� �������� ��������!");
        }
        System.out.println("�������� ��� ���������:");
        System.out.println("1. �������� ������");
        System.out.println("2. ��������� ������");
        System.out.println("3. ��������� ������ �� �����");
        System.out.println("4. ���������������� ������");
        ans2=sc.nextInt();
        switch(ans2){
            case 1:
                matSum(matr1,matr2,m,n);
                break;
            case 2:
                matProiz(matr1,matr2,m,n);
                break;
            case 3:
                System.out.println("������� �����, �� ������� ���������� �������� �������:");
                int ch=sc.nextInt();
                matChislo(matr1,matr2,m,n,ch);
                break;
            case 4:
                Transp(matr1,matr2,m,n);
                break;
            default: System.out.println("������ �������� �����!");
            
                
        }
         
    }
    private static void printArray(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[0].length; j++) {
            System.out.print(arr[i][j] + " ");
            }
        System.out.println();
        }
        System.out.println();
    }
 
    private static void initArray(int[][] arr) {
       // Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = -100+(int)(Math.random()*(201));
            }
        }
    }
    private static void HinArray(int[][] arr) {
        
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }
   public  static void matSum(int[][] ma1, int[][] ma2, int m1, int n1){
      int[][] sum = new int[n1][m1];
      for(int i=0;i<n1;i++){
          for(int j=0;j<m1;j++){
              sum[i][j]=ma1[i][j]+ma2[i][j];
              System.out.print(sum[i][j]+"\t");
          }
          System.out.println();
      }
   }    
   
    public  static void matProiz(int[][] ma1, int[][] ma2, int m1, int n1){
      int[][] pr = new int[n1][m1];
      for(int i=0;i<n1;i++){
          for(int j=0;j<m1;j++){
              pr[i][j]=ma1[i][j]*ma2[i][j];
              System.out.print(pr[i][j]+"\t");
          }
          System.out.println();
      }
   }    
    
     public  static void matChislo(int[][] ma1, int[][] ma2, int m1, int n1, int ch){
      int[][] prch = new int[n1][m1];
      System.out.println("1 �������:");
      for(int i=0;i<n1;i++){
          for(int j=0;j<m1;j++){
              prch[i][j]=ma1[i][j]*ch;
              System.out.print(prch[i][j]+"\t");
          }
          System.out.println();
      }
      System.out.println("2 �������:");
      for(int i=0;i<n1;i++){
          for(int j=0;j<m1;j++){
              prch[i][j]=ma2[i][j]*ch;
              System.out.print(prch[i][j]+"\t");
          }
          System.out.println();
      }
   }  
     public  static void Transp(int[][] ma1, int[][] ma2, int m1, int n1){
      int[][] tr = new int[m1][n1];
      System.out.println("1 �������:");
      for(int i=0;i<ma1.length;i++){
          for(int j=0;j<ma1.length;j++){
              tr[i][j]=ma1[j][i];
              System.out.print(tr[i][j]+"\t");
          }
          System.out.println();
      }
      System.out.println("2 �������:");
      for(int i=0;i<ma2.length;i++){
          for(int j=0;j<ma2.length;j++){
              tr[i][j]=ma2[j][i];
              System.out.print(tr[i][j]+"\t");
          }
          System.out.println();
      }
   }    
}
