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
public class User extends Player{
    
    public User(){
    }
    
    @Override
    public void play(){
        
    }
    
    public void play(ArrayList<String> deck1, ArrayList<String> deck2){
         Scanner input = new Scanner(System.in);
         System.out.println("Please Enter your name");
         Factory fac = new Factory();
         String val = input.next();
         War war = fac.generateWar(val);
         System.out.println("Welcome :) "+war.getGameName());
         System.out.print("You want to play the game: (yes, no)");
        String user = input.next();
        int counter = 0;
        if(user.equals("yes")){
        while(counter<25){
            GroupOfCards p1Card = fac.generateGOC();  //each player place one card face up
            GroupOfCards p2Card = fac.generateGOC();

            //display the face up card
            System.out.println("For Computer,");
            String val2 = p1Card.pop(deck1);
            System.out.println("\nPress Enter for your turn");
            input.nextLine();
            System.out.println("For User,");
            String val1 = p2Card.pop(deck2);
            war.play(val2, val1);
            counter++;
    }
            war.declareWinner();
        }
        else{
            System.out.println("PLease leave");
        }
    }
}
