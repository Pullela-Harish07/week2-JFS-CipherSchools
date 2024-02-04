/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.codejava.cweek1;

/**
 *
 * @author Harish
 */
class L12C3 {
    L12C3(){
        System.out.println("Constructor");
    }
    L12C3(int num){
        System.out.println(num);
    }
}
public class Test2 extends L12C3{

    Test2(int num) {
        super();
        System.out.println("Constructor of Test2");
    }
    public static void main(String[] args){
        new Test2();
    }
}
