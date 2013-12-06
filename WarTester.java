import javax.swing.*;
/**
   WarTester 
   JFrame for WarGUI
   Rogan Brown
   CS110 final project
*/

public class WarTester 
{
	public static void main(String [] args) 
{
		
      //create frame
      JFrame frame = new WarGUI("Card Game of War");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
      frame.setSize(1000,400);
      frame.validate();
      frame.setVisible(true);

	}
}
