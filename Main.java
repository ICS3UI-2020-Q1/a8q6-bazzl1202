import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements Runnable, ActionListener{

  // Class Variables 
  JPanel mainPanel;
  JPanel topPanel;
  JPanel buttonPanel; 

  JButton[] numberButtons;
  JButton clearButton;
  JButton enterButton;
  
  JTextField display;

  // Method to assemble our GUI
  public void run(){
    // Creats a JFrame that is 800 pixels by 600 pixels, and closes when you click on the X
    JFrame frame = new JFrame("Title");
    // Makes the X button close the program
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // makes the windows 800 pixel wide by 600 pixels tall
    frame.setSize(800,600);
    // shows the window
    frame.setVisible(true);

    // initialize the main panel with a border layout
    mainPanel = new JPanel();
    mainPanel.setLayout(new BorderLayout());

    // initialize the button pnale with a grid layout
    buttonPanel = new JPanel();
    buttonPanel.setLayout(new GridLayout(4, 3));

    // initialize the top panel with the default layout (flow)
    topPanel = new JPanel();

    // create the display panel
    display = new JTextField("0");
    // set a preferred size so Flow layout knows it should be bigger
    display.setPreferredSize(new Dimension(800, 100));
    topPanel.add(display);

    // sets the size of the array
    numberButtons = new JButton[10];

    // creating the number numberButtons
    for(int i = 0; i < numberButtons.length; i++){
      numberButtons[i] = new JButton("" + i);
      // set the actions command
      numberButtons[i].setActionCommand(""+i);
      // add ActionListener
      numberButtons[i].addActionListener(this);
    }

    // create the clear and enter Buttons
    clearButton = new JButton("Clear");
    clearButton.addActionListener(this);
    clearButton.setActionCommand("Clear");

    enterButton = new JButton("Enter");
    enterButton.addActionListener(this);
    enterButton.setActionCommand("Enter");

    // add the buttons to the grid
    buttonPanel.add(numberButtons[1]);
    buttonPanel.add(numberButtons[2]);
    buttonPanel.add(numberButtons[3]);

    buttonPanel.add(numberButtons[4]);
    buttonPanel.add(numberButtons[5]);
    buttonPanel.add(numberButtons[6]);

    buttonPanel.add(numberButtons[7]);
    buttonPanel.add(numberButtons[8]);
    buttonPanel.add(numberButtons[9]);

    buttonPanel.add(clearButton);
    buttonPanel.add(numberButtons[0]);
    buttonPanel.add(enterButton);
  

    // assemble the panels
    mainPanel.add(topPanel, BorderLayout.PAGE_START);
    mainPanel.add(buttonPanel, BorderLayout.CENTER);

    // add the mainPanel to the frame
    frame.add(mainPanel);
  }

  // method called when a button is pressed
  public void actionPerformed(ActionEvent e){
    // get the command from the action
    String command = e.getActionCommand();

  }

  // Main method to start our program
  public static void main(String[] args){
    // Creates an instance of our program
    Main gui = new Main();
    // Lets the computer know to start it in the event thread
    SwingUtilities.invokeLater(gui);
  }
}
