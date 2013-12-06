/**
   WarGame class simulate a game of war
   Rogan Brown
   CS 110 Final Project
*/
public class WarGame
{

   public static void main(String[] args)
   {
      //create a deck of cards and shuffle
      
      DeckWar deck = new DeckWar();
      deck.shuffle();
      
      //create two hands and shuffle them
      Hand player1 = new Hand();
      Hand player2 = new Hand();
      
      //makes a hand of 26 cards for each player
      for(int i = 0; i < 26; i++)
      {
         player1.add(deck.deal());
         player2.add(deck.deal());
      
      }
      //shuffles the hands
      player1.shuffle();
      player2.shuffle();
      
      //get top card
      player1.getTopCard();
      player2.getTopCard();
      
      //compare the cards
      
      //player with higher card puts both cards into hand
      
      //player with most cards at the end of the game wins
      
      //player with empty hand losses
      
      
       
           
   }

}