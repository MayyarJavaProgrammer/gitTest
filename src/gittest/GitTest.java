/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gittest;

import java.util.Scanner;

/**
 *
 * @author mear
 */
public class GitTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //get name
        System.out.println("Enter you name");
        String username = reader.next();
        //get age
        System.out.println("Enter you age");
        int userage = reader.nextInt();
        //get favorite meal
        System.out.println("What is your favorite meal ?");
        String meal  = reader.next();
        
        //get favorite sport
        System.out.println("What is your favorite sport ?");
        String sport  = reader.next();
        //print user info
        System.out.println("hello " + username);
        System.out.println("your age is :" + userage);
        System.out.println("your favorite meal is :" + meal);
        System.out.println("your favorite sport is :" + sport );
        System.out.println("-------------finish for b1---------------");
        System.out.println("this is for b1");
        System.out.println("this is for b1");
    
    }

}
