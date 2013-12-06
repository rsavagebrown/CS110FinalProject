/**
*  Hand 
*  class seperates a deck into "sub decks"
*  Rogan Brown
*  CS110 Final Project
*/

//import java libraries
import java.util.ArrayList;
import java.util.*;
import java.util.Collections;


public class Hand
{
    
   //declare data: ArrayList for hand
   private ArrayList<CardWar> hand;
   
   
   
   /**
      Hand constructor creates array list for hand
   */
   public Hand()
   {
      
      //create array list
      hand = new ArrayList<CardWar>();
      
   }
   /**
      add method from ArrayList methods adds card to hand
      @param newCard adds a card to hand
   */
   public void add(CardWar newCard)
   {
      hand.add(newCard); 
   
   }
   
   /**
      handSize mehtod returns the size of the hand
      @return the size of the hand
   */
   public int handSize()
   {
      
      return hand.size();
   }
   
   /**
      shuffle method shuffles the hand
   */
   public void shuffle()
      {
         //uses method from collections class to shuffle
         Collections.shuffle(hand);
      }
      
   public CardWar getTopCard()
      {
         return hand.remove(0); 
      
      }
      
   public String toString()
   {
      return hand.toString();
   
   }
   

   
}
