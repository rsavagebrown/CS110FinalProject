import javax.swing.*;
/**
   JFrame for WarGUI
   @Rogan Brown
   CS110 final project
*/

public class WarTester 
{
	public static void main(String [] args) 
{
		
      
      JFrame frame = new WarGUI("Card Game of War");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.pack();
      // OR
      frame.setSize(1000,400);
      frame.validate();
      frame.setVisible(true);

	}
}