/**
   WarGame class simulate a game of war
   @Rogan Brown
   CS 110 Final Project
*/
public class WarGame
{
        
      DeckWar deck = new DeckWar();
      Hand hand = new Hand();

      deck.shuffle();
      
            
      System.out.println(deck);
   }

}