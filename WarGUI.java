import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
   War GUI designs applet for a card game of war
   @Rogan Brown
   CS 110 Final Project
*/

public class WarGUI extends JFrame  //example of inheritence 
{

   private WarGame game;  //the guts
   
   
   //declare panels
   private JPanel buttonPanel, Player1, Player2, title, info, centerPanel;
   
   //declare buttons
   private JButton flip, startOver, endGame;
   //declare labels for title, info, and card icons
   private JLabel pic, pic2, welcome, titleLabel, picfront, pic2front;
   //declare image icons
   private ImageIcon front, back, back2, front2;


   public WarGUI(String s) 
   {
      //inherit s from JFrame
      super(s);
      
      //create new war game
      game = new WarGame();
      
      //set initial layout
      setLayout(new BorderLayout());
      
      //create instance of buttons
      flip = new JButton("flip");
      startOver = new JButton("start over");
      endGame = new JButton("end game");
      
      //create and add panels 
      centerPanel = new JPanel(new FlowLayout());
      add(centerPanel,BorderLayout.CENTER);
      
      buttonPanel = new JPanel(new GridLayout(3,1));
		add(buttonPanel,BorderLayout.EAST);
      
		Player1 = new JPanel(new FlowLayout());
		centerPanel.add(Player1);
      
		Player2 = new JPanel(new FlowLayout());
		centerPanel.add(Player2);
      
		title = new JPanel(new FlowLayout());
	   add(title,BorderLayout.NORTH);
      
		info = new JPanel(new FlowLayout());
		add(info,BorderLayout.SOUTH);
      
      //set panel colors
      buttonPanel.setBackground(Color.RED);
		Player1.setBackground(Color.GREEN);
		Player2.setBackground(Color.BLUE);
		title.setBackground(Color.WHITE);
		info.setBackground(Color.WHITE);
      
      //display labels
      welcome = new JLabel("Welcome to Rogan's Java War Game!");
		welcome.setHorizontalAlignment(JLabel.CENTER);
		welcome.setForeground(Color.BLACK);
		title.add(welcome);

      //create button listeners
      flip.addActionListener(new ButtonListener());
      startOver.addActionListener(new ButtonListener());
      endGame.addActionListener(new ButtonListener());

      
      //add buttons to panels
      buttonPanel.add(flip);
      buttonPanel.add(startOver);
      buttonPanel.add(endGame);  
      
      
      //create image icons
      front = new ImageIcon("cardPics (2)/aces.jpg");
      back = new ImageIcon("cardPics (2)/back.jpg");
      back2 = new ImageIcon("cardPics (2)/back.jpg");
      front2 = new ImageIcon("cardPics (2)/aces.jpg");
      
      pic = new JLabel(back);
      //picfront = new JLabel(front);
      
      pic2 = new JLabel(back2);
      //pic2front = new JLabel(front2);
      
      
      Player1.add(pic);        //print back card
      //Player1.add(picfront);   //print first card in hand
      
      //Player2.add(pic2front);  //print first card in hand
      Player2.add(pic2);       //print back card
   }   
      
            
      class ButtonListener implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            
               pic.setIcon(front);
               //pic.setIcon(back);
               pic2.setIcon(front2);
               //pic2.setIcon(back2);
            
            
         }
         
         
   }
}


      
      