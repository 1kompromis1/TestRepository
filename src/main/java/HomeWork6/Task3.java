/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeWork6;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ������
 */
public class Task3 {
    public static void main(String[] args) {
        String[] first={"������� ������!","� ������ ������� ","������ ������� ","������������ �������� ����������, ��� ","���������� ���� ������� ��������� ��������, ��� ","������������� � ������� ���� ","������ �����������, � ����������� �� "};
        String[] second={"���������� ���������� �������� ������� ","����� � ����� �������� ������ ","��������������� ������������ ","���������� �������� ��������� ���� ������������ ","���������� �������������-���������������� ����������� ����� ������������","���������� � �������� ��������� ","������ ������������ ������ �� ������������ ������� "};
        String[] third={"������ ������ ���� � ������������","������� �� ��� �������","������������ ���������� � ���������� ","������������ �������� ����� ������������ ������� � ������������","� ������������ ������� ������������� �������� ","������������ ����� ���������� ����������� �������� ","������ �� ����� ������� ��������� � ������������ "};
        String[] fourth={"���������� ����������� ��������","������������ ���������� � ���������������� �������","�������, ���������� ����������� � ��������� ������������ ����� ","����������� �������������� �������� ","������� �������� ������ \n" +
"��������������� �������� ������������ ","��������������� ������� ����������� ","������ �������� "};
        Random ran=new Random();
        Scanner sc=new Scanner(System.in);
        String result = null,result1 = null,result2 = null,result3=null;
        
        
        System.out.println("enter kol-vo sentenses");
        int o=Integer.parseInt(sc.next());
        
        
        for(int m=0;m<o;m++){
        for(int i = 0;i<first.length;i++){
            i = ran.nextInt(first.length);
            result = first[i];
            break;
        }
        for(int j = 0;j<second.length;j++){
            j = ran.nextInt(second.length);
            result1 = second[j];
            break;
        }
        for(int k = 0;k<third.length;k++){
            k = ran.nextInt(third.length);
            result2 = third[k];
            break;
        }
        for(int n = 0;n<fourth.length;n++){
            n = ran.nextInt(fourth.length);
            result3 = fourth[n];
            break;
        }
        
        System.out.println(result + result1 + result2 + result3 + ".");
        }
    }
}
