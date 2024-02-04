/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.codejava.cweek1;

/**
 *
 * @author Harish
 */
public class L12C2 {
    int arg = 5;
    L12C2(){
       System.out.println("Hi! i am default constructor");
}
    L12C2(int arg){
        this.arg = arg;
    }
    public static void main(String[] args){
        int arg=10;
        L12C2 obj = new L12C2(10);
        System.out.println(obj.arg);
    }
}
