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
public class Factory {
    
    public GroupOfCards generateGOC(){
        GroupOfCards GOC = new GroupOfCards();
        return GOC;
    }
    
    public User generateUser(){
        User user = new User();
        return user;
    }
    
    public War generateWar(String value){
        War war = new War(value);
        return war;
    }
    
    public Rank generateRank(){
        Rank rank = new Rank();
        return rank;
    }
}
