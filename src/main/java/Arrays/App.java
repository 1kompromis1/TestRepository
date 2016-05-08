/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Никита
 */
public class App {
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n,k;
        System.out.print("Введите размер матрицы:");
        n=sc.nextInt();
        int [][] matr=new int[n][n]; 
        intArray(matr);
        //System.out.print("Введите значение числа сдвига:");
        //k=sc.nextInt();
        //leftShift(matr,k,n);
        //rightShift(matr,n,k);
        //shiftDown(matr,n,k);
        //shiftUp(matr,n,k);
        System.out.println("\n"+"Среднее значение:");
        average(matr,n);
        System.out.println("\n"+"Нули в конец:");
        zero(matr,n);
        System.out.println("\n"+"Последовательность:");
        inDecrease(matr,n);
        System.out.println("\n"+"Сумма:");
        sum(matr,n);
        System.out.println("\n"+"Поворот матрицы на 90:");
        turn90(matr,n);
        System.out.println("\n"+"Поворот матрицы на 180:");
        turn180(matr,n);
        System.out.println("\n"+"Поворот матрицы на 270:");
        turn270(matr,n);
    }
    private static void print(int[][] arr,int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                System.out.print(arr[i][j]+"\t");
            System.out.println();
        }
    }
    private static void zero(int [][] arr,int n){
        
        for(int i=0;i<n;i++){
            int k=0;
            int [] c=new int[n];
            for(int j=0;j<n;j++){
                if(arr[i][j]!=0){
                   c[k++]=arr[i][j]; 
                } 
            }
        arr[i]=Arrays.copyOf(c, n);
        }
        print(arr,n);            
    }
    private static void average(int [][] arr, int n){
        
        int [] sum=new int[n];
        double [] av=new double [n];
        double [][] new_arr= new double [n][n];
        System.out.println("\nСреднее арифметическое в каждой строке:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                sum[i]=sum[i]+arr[i][j];          
            av[i]=sum[i]/n;
            System.out.print(av[i]+"\t");
        }
        System.out.println("\nНовая матрица:");
        for(int i=0;i<n;i++){
          for(int j=0;j<n;j++)  {
              new_arr[i][j]=arr[i][j]-av[i];
              System.out.print(new_arr[i][j]+"\t");
          }
          System.out.println();
        } 
    }
    private static void intArray(int [][] matr)
    {
        System.out.println("Исходная матрица:");
        for(int i=0; i<matr.length;i++)
            {
                for(int j=0; j<matr.length;j++){
                    matr[i][j]=-10+(int)(Math.random()*21);
                    
                    System.out.print(matr[i][j]+ "\t");
                }
                System.out.println();
            }
    
    }
   
    
    private static void leftShift(int [][] arr,int k,int n)
    {
       if(k>n ||k<1){
           System.out.println("Сдвиг невозможен!");
           return;
       }
       int tmp,i,j;
       for(int r=0;r<k;r++){
           for(i=0;i<n;i++){
               tmp=arr[i][0];
               for(j=0;j<n;j++){
                   arr[i][j]=arr[i][j+1];
               }
               arr[i][j]=tmp;
           }
       }
       print(arr,n);
            
    }
   
    private static void rightShift(int [][] arr,int n,int k)
    {
        if (k > n || k < 1) {
            System.out.println("Сдвиг невозможен");
            return;
        }
        int tmp, i, j;
        for (int r = 0; r < k; r++) {
            for (i = 0; i < n; i++) {
                tmp = arr[i][n - 1];
                for (j = n - 1; j > 0; j--) {
                     arr[i][j] = arr[i][j - 1];
                }
            arr[i][j] = tmp;
            }
        }
    }
    private static void shiftDown(int [][] arr,int n,int k)
    {
        if (k> n || k < 1) {
            System.out.println("Сдвиг невозможен");
            return;
        }
        int tmp, i, j;
        for (int r = 0; r < k; r++) {
            for (i = 0; i < n; i++) {
                tmp = arr[n - 1][i];
                for (j = n - 1; j > 0; j--) {
                    arr[j][i] = arr[j - 1][i];
                }
                    arr[j][i] = tmp;
            }
        }
    }
    private static void shiftUp(int [][] arr,int n,int k)
    {
        if (k> n || k < 1) {
            System.out.println("Сдвиг невозможен");
            return;
        }
        int tmp, i, j;
        for (int r = 0; r < k; r++) {
            for (i = 0; i < n; i++) {
                tmp = arr[0][i];
                for (j = n - 1; j > 0; j--) {
                    arr[j][i] = arr[j + 1][i];
                }
                    arr[j][i] = tmp;
            }
        }
    }
    
    private static void inDecrease(int[][] arr,int n) {
        int[] f = new int[n * n];//преобразую в одномерный массив
        int c = 0;int r=0;int max=0;int h=0;int m=0;int min=0;int h1=0;
        for(int[]x:arr){
            for(int z:x){
                f[c++] =z;
            }
        }
        for (int g=0;g<f.length-1;g++){
            if(f[g]<f[g+1]){//если последующий элемент больше
                r+=1;
                if(r>max){max=r;h=g+1;}//запоминаем количество возрастаний и индекс последнего возрастающего элем
            }else{r=0;}//возрастание прервалась
            if(f[g]>f[g+1]){
                m+=1;
            if(m>min){min=m;h1=g+1;}//запоминаем количество возрастаний и индекс последнего убыв элем
            } else{m=0;}// убывание прервалась
        }
        System.out.println("Максимальная последовательность возрастающих чисел:");
        int[]l=new int[max+1];
        System.arraycopy(f,(h-max),l,0,(max+1));//копирую последовательность возр элем в новый массив
        System.out.println(Arrays.toString(l)+" "+(max+1));
        System.out.println("Максимальная последовательность убывающих чисел:");
        int[]t=new int[min+1];
        System.arraycopy(f,(h1-min),t,0,(min+1));//копирую последовательность убыв элем в новый массив
        System.out.println(Arrays.toString(t)+" "+(min+1));
    }

    private static void sum(int[][] arr,int n){
        int[] sum= new int[n];
        int k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]>0){
                    k=k+1;
                    sum[i]=sum[i]+arr[i][j];
                }
                 if(k==2)
                     break;
                 
                
            }
            if(k!=2) 
            {
                sum[i]=0;
            }
            System.out.println("Значение суммы "+(i+1)+"строки:"+sum[i]);
            k=0; 
        }
            
    }

    private static void turn90(int[][] arr,int n){
        int[][] new_arr=new int[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                new_arr[i][j]=arr[j][n-i-1];
        print(new_arr,n);
    }
    private static void turn180(int[][] arr,int n){
        int[][] new_arr=new int[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                new_arr[i][j]=arr[n-i-1][n-j-1];
        print(new_arr,n);
    }
    
    private static void turn270(int[][] arr,int n){
        int[][] new_arr=new int[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                new_arr[i][j]=arr[n-j-1][i];
        print(new_arr,n);
    }
    
}


