/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game.
 * HINT, you might want to subclass this more than once.
 * The group of cards has a maximum size attribute which is flexible for reuse.
 * @author dancye
 */
public class GroupOfCards extends Card 
{
   
    //The group of cards, stored in an ArrayList
    private ArrayList<String> cards;
    private Factory fac= new Factory();
    private int rank =0;
    private String suits;
    private String values;
    private String suit[] = {"Spades","Clubs","Hearts","Diamonds"};
    private String value[] = {"Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King","Ace"};
    
    public GroupOfCards(){
       
    }
    
    
    public GroupOfCards(String value,String suit)
    {
        this.values = value;
        this.suits = suit;
    }
    
    /**
     * A method that will get the group of cards as an ArrayList
     * @return the group of cards.
     */
    public ArrayList<String> showCards()
    {
        return cards;
    }
    
    public void shuffle()
    {
        Collections.shuffle(cards);
    }
    
    public void create() {
        cards= new ArrayList<>();
        for(int i=0;i<4;i++){
            for(int j=0;j<13;j++){
                cards.add(value[j] +" of "+suit[i]);
            }
        }
    }
    @Override
    public String toString(){
        return "good";
    }
    
    public void generate(){
        for(int i=0;i<52;i++){
             System.out.println(cards.get(i));
    }
    }
    public void split(){
        ArrayList<String> deck1 = new ArrayList<>();
         ArrayList<String> deck2 = new ArrayList<>();
         int j=0;
         int k=1;
         for(int i=0;i<52;i++){
             if(i%2==0){
                 
                 deck1.add(cards.get(j));
                 j+=2;
             }
             else{
                 
                 deck2.add(cards.get(k));
                 k+=2;
             }
         }
         User user = fac.generateUser();
         user.play(deck1, deck2);
         
    }
    public String pop(ArrayList<String> cards) {
        String o = cards.get(cards.size() - 1);
        cards.remove(cards.size() - 1);
        System.out.println("The card value is "+o);
        return o;
  }
    
    
}//end class
