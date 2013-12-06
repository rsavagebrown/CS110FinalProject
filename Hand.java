/**
   Hand class seperates a deck into "sub decks"
   @Rogan Brown
   CS110 Final Project
*/

import java.util.ArrayList;
import java.util.Collections;


public class Hand
{
   
   //declare data
   private ArrayList<CardWar> hand;
   private int HANDSIZE = 26;
   
   
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
   */
   public void add(CardWar newCard)
   {
      hand.add(newCard);
      
//       DeckWar deck = new DeckWar();
//       
//       deck.shuffle();
//         
//       for(int i = 0; i<=26; i++)
//           {
//             hand.add(deck.deal());
//           }
// 
 
   
   }
   
   public int handSize()
   {
      return HANDSIZE;
   }
   
   public void shuffle()
      {
         //uses method from collections class to shuffle
         Collections.shuffle(hand);
      }
   
}





// public class Hand extends DeckWar
// {
//    private CardWar[] hand;
//    
//    public Hand()
//    {
//       DeckWar deck = new DeckWar();
//       
//       for(int i = 0;i <= 26 ; i++)
//          hand[i] = deck.deal();
//          
//    }
//    
//   
// }