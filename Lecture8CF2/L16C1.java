/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.codejava.cweek1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
/**
 *
 * @author Harish
 */
public class L16C1 {
    public static void main(String [] args){
        ArrayList<String> states = new ArrayList<String>();
        states.add("California");
        states.add("Alabama");
        states.add("Alaska");
        states.add("Arkansas");
        System.out.println("Arraylist: "+states);

        String s = states.get(2);
        System.out.println("I got " +s);
        //for size of list
        System.out.println("Arraylist Size " +states.size());

        //for accessing elements
        for(int i = 0;i < states.size();i++){
            System.out.println(states.get(i));
        }
        //to update elements of the list
        states.set(2, "Texas");
        System.out.println("after updating :" + states);
        //to remove elements
        states.remove(1);
        System.out.println("after removing element :"+ states);
        System.out.println("after deletion the list :" +states);

        //for sorting the list
        states.sort(Comparator.naturalOrder());//A-Z --> a-z
        System.out.println("Array after sorting :"+states);
        //to check element
        System.out.println("Is Arkansas there? "+states.contains("Arkansas"));
        //to check if list is empty
        System.out.println("is list empty "+ states.isEmpty());
        states.removeAll(states);
        System.out.println("is list empty "+ states.isEmpty());
        
    }
}
