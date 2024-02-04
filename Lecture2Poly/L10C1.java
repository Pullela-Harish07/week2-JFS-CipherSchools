/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.codejava.cweek1;

/**
 *
 * @author Harish
 */
public class L10C1 {
    void add(int num1,int num2){System.out.println(num1+num2);}
    void add(int num1,int num2,int num3){System.out.println(num1+num2+num3);}
    void add(float num1,float num2){System.out.println(num1+num2);}
    void add(int num1,float num2){System.out.println(num1+num2);}
    void add(float num1,int num2){System.out.println(num1+num2);}
    public static void main(String[] args){
        L10C1 p = new L10C1();
        p.add(12.2f, 300);
    }
}
