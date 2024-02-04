/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.codejava.cweek1;

/**
 *
 * @author Harish
 */
public class L12C1 {
    //this keyword
    int arg = 5;
    void myTest(int arg){
        this.arg = arg;
    }
    public static void main(String[] args){
        int arg=10;
        L12C1 obj = new L12C1();
        obj.myTest(arg);
        System.out.println(obj.arg);
    }
}
