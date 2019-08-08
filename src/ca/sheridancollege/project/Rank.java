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
public class Rank {
    private int rank=0;
    public int rank(String value){
        
        switch (value) {
            case "Two of Spades":
            case "Two of Clubs":
            case "Two of Hearts":
            case "Two of Diamonds":
                rank=2;
                break;
            case "Three of Spades":
            case "Three of Clubs":
            case "Three of Hearts":
            case "Three of Diamonds":
                rank=3;
                break;
            case "Four of Spades":
            case "Four of Clubs":
            case "Four of Hearts":
            case "Four of Diamonds":
                rank=4;
                break;
            case "Five of Spades":
            case "Five of Clubs":
            case "Five of Hearts":
            case "Five of Diamonds":
                rank=5;
                break;
            case "Six of Spades":
            case "Six of Clubs":
            case "Six of Hearts":
            case "Six of Diamonds":
                rank=6;
                break;
            case "Seven of Spades":
            case "Seven of Clubs":
            case "Seven of Hearts":
            case "Seven of Diamonds":
                rank=7;
                break;
            case "Eight of Spades":
            case "Eight of Clubs":
            case "Eight of Hearts":
            case "Eight of Diamonds":
                rank=8;
                break;
            case "Nine of Spades":
            case "Nine of Clubs":
            case "Nine of Hearts":
            case "Nine of Diamonds":
                rank=9;
                break;
            case "Ten of Spades":
            case "Ten of Clubs":
            case "Ten of Hearts":
            case "Ten of Diamonds":
                rank=10;
                break;
            case "Jack of Spades":
            case "Jack of Clubs":
            case "Jack of Hearts":
            case "Jack of Diamonds":
                rank=11;
                break;
            case "Queen of Spades":
            case "Queen of Clubs":
            case "Queen of Hearts":
            case "Queen of Diamonds":
                rank=12;
                break;
            case "King of Spades":
            case "King of Clubs":
            case "King of Hearts":
            case "King of Diamonds":
                rank=13;
                break;
            case "Aceof Spades":
            case "Ace of Clubs":
            case "Ace of Hearts":
            case "Ace of Diamonds":
                rank=14;
                break;
            default:
                break;
        }
        return rank;
    }
    
}
