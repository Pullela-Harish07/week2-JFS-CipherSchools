/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.codejava.cweek1;

/**
 *
 * @author Harish
 */
import java.io.File;
import java.io.IOException;
public class L14C3 {
    public static void main(String[] args) throws IOException{
        File f = new File("d:\\abc.txt");
        f.createNewFile();
    }
}
