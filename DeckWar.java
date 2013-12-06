/**
*  DeckWar
*  represents a deck of cards
*  deals, shuffles, displays size
*  Rogan Brown
*  CS110 Final Project
*/

//import java libraries 
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
import java.util.*;



public class DeckWar
{
   private ArrayList<CardWar> deck;  //create ArrayList of Cards
   
   
   /**
      DeckWar constructor, building the deck of cards
   */
   public DeckWar()
   {
      deck = new ArrayList<CardWar>();
      
      //loop every suit and rank into a deck of cards
      for (int i = 0; i<=3; i++)
      {
         for(int j = 0; j<=12; j++)
          {
            deck.add(new CardWar(j,i));
          }
      
      }

         
   }
   /**
      deal() class returns the deck in order
      @return the deck of cards in order
   */
   public CardWar deal()
   {
      
      return deck.remove(0);
   }
   /**
      getDeckSize returns the size of the deck
      @return the size of the deck
   */
   public int getDeckSize()
   {
      return deck.size();
   }
   
   /**
      shuffle() method returns the deck in random order, from collections library
   */
   public void shuffle()
   {
      //uses method from collections class to shuffle
      Collections.shuffle(deck);
   }
         
   
}
 
   

