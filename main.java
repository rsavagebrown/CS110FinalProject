/**
   main
   tester for deck, card and hand classes
   Rogan Brown
   CS110 Final project
*/

public class main {

	public static void main(String[] args)
	{
		
      //tests to see if deck prints and shuffles
      int index = 0;
      DeckWar deck = new DeckWar();
      deck.shuffle();
		CardWar C;

		System.out.println( deck.getDeckSize() );

	   while (deck.getDeckSize()!= 0 )
	   {
		   C = deck.deal();
		   System.out.println(C.toString());
	   }
      
      
     //  Hand pile = new Hand();
//       pile.shuffle();  
//       //CardWard D;
//       while( pile.handSize() != 0 && pile.handSize() <=26)
//       {   
//           C = deck.deal();
//           
//           D = pile.add();
//           System.out.println(D.toString());
//           
//       }
      
	}
}