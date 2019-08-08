/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

/**
 *
 * @author User
 */
public class War extends Game{
    private int user=0;
    private int comp=0;
    private Factory fac = new Factory();
    
    public War(String name){
        super(name);
    }
    
    
    public void play(String card2, String card1){
        Rank rank = fac.generateRank();
           if(rank.rank(card2) <rank.rank(card1)){//if player 1 win
                
                System.out.println("\nPlayer wins the round"  + "\n" + "\n");
                System.out.println("***************************************\n");
                user++;
            }//end if

            else if(rank.rank(card2)>rank.rank(card1)){//if player 2 win
                System.out.println("Computer wins the round" + "\n" + "\n");
                System.out.print("*****************************************\n");
                comp++;
            }//end else if

            else if(rank.rank(card2)==rank.rank(card1)){ //war happens when both cards' rank matched
                System.out.println("Tie\nNo point for any player");
                System.out.print("*****************************************\n");
    }
    }
    
    @Override
    public void declareWinner()
    {
            if(user>comp){
                System.out.println("\nCongratulations!! You Won the Game");
            }
            else{
                System.out.println("\nOops!! You lost the Game");
            }
        System.out.println("Score of player" + user);
            System.out.println("Score of computer" + comp);
    }
}
