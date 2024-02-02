/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.codejava.cweek1;

/**
 *
 * @author Harish
 */
//Inheritance
//Memory usage optimization, Code reusability(faster development, easy to debug/test), productivity/efficient
public class L9C1 {
    int width;
    int height;
    void display(String item) {
        System.out.println(item + "Width"+width+"Height"+height);
    }
    public static void main(String[] args){
        Chair neelkamal = new Chair();
        neelkamal.foo();
    }
}
class Chair extends L9C1{
    void foo() {width=10;height=20;display("Chair");}
}
class Table extends L9C1{
    void foo() {width=30;height=50;display("Table");}
}
class Almira extends L9C1{
    void foo() {width=100;height=200;display("Almira");}
}
