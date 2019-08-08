/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args){
        GroupOfCards self = new GroupOfCards();
        User user = new User();
        Scanner input = new Scanner(System.in);
        self.create();
        self.shuffle();
        
        self.split();
        
     //    System.out.print("You want to play the game: (yes, no)");
         
      //  String user = input.next();
       // if(user.equals("yes")){
            
        }
    }
    

