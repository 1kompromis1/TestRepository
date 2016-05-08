/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *
 * @author Никита
 */
public class BubbleSortes {
     public static void sort(int[] matr) {
        for(int barrier=matr.length-1;barrier>=0;barrier--){
            for(int index=0;index<barrier;index++){
                if(matr[index]>matr[index+1]){
                    int tmp=matr[index];
                    matr[index]=matr[index+1];
                    matr[index+1]=tmp;
                }
            }
        }
    }
}
