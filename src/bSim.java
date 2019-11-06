// Comments with *** in front them are taken from the ECSE 202 Assignment 1, 2 and 3 Instructions

import acm.graphics.*;
import acm.program.*;
import acm.util.RandomGenerator;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import acm.gui.*;


/**
 * The simulation class that extends GraphicsProgram and sets up the screen to bounce the balls from aBall and put them
 * in the bTree
 */

public class bSim extends GraphicsProgram {
    // Parameters used in this program
    private static final int WIDTH = 1200; //*** n.b. screen coordinates
    private static final int HEIGHT = 600; //***
    private static final int OFFSET = 200; //***
    private static final double SCALE = HEIGHT/100; // pixels per meter //***
    private static final int NUMBALLS = 60; // # balls to simulate //***
    private static final double MINSIZE = 1.0; // Minimum ball radius (meters ) //***
    private static final double MAXSIZE = 7.0; // Maximum ball radius (meters) //***
    private static final double EMIN = 0.2; // Minimum loss coefficient //***
    private static final double EMAX = 0.6; // Maximum loss coefficient //***
    private static final double VoMIN = 40.0; // Minimum velocity (meters/sec) //***
    private static final double VoMAX = 50.0; // Maximum velocity (meters/sec) //***
    private static final double ThetaMIN = 80.0; // Minimum launch angle (degrees) //***
    private static final double ThetaMAX = 100.0; // Maximum launch angle (degrees) //***
    private RandomGenerator rgen = RandomGenerator.getInstance(); //***

    //public void doSim(){}
    //public void doStack(){}

    //add(new JButton("Run"));
    //add(new JButton("Stack"));
    //add(new JButton("Clear"));
    //add(new JButton("Stop"));
    //add(new JButton("Quit"));


    //String[] petStrings = { "Run", "Stack", "Clear", "Stop", "Quit" };

    //Create the combo box, select item at index 4.
    //Indices start at 0, so 4 specifies the pig.
    //JComboBox petList = new JComboBox(petStrings);
    //petList.setSelectedIndex(4);
    //petList.addActionListener(this);

    //JComboBox sizeChooser = new JComboBox();
    //add(new JComboBox(""), NORTH);
    //JToggleButton
    //sizeChooser.addItem("Small");
    //sizeChooser.addItem("Medium");
    //sizeChooser.addItem("Large");
    //sizeChooser.addItem("X-Large");
    //sizeChooser.setEditable(false);

    //new JSlider (min, max, value)

    /**
     * This program allows users to convert temperatures back and forth
     * from Fahrenheit to Celsius.
     */
    public class TemperatureConverter extends Program {
        /* Initializes the graphical user interface */
        public void init() {

            setLayout(new TableLayout(2, 3));
            fahrenheitField = new IntField(32);
            fahrenheitField.setActionCommand("F -> C");
            fahrenheitField.addActionListener(this);
            celsiusField = new IntField(0);
            celsiusField.setActionCommand("C -> F");
            celsiusField.addActionListener(this);
            add((new JLabel("Degrees Fahrenheit")),NORTH);
            add(fahrenheitField);
            add(new JButton("F -> C"));
            add(new JLabel("Degrees Celsius"));
            add(celsiusField);
            add(new JButton("C -> F"));
            addActionListeners();
        }

        /* Listens for a button action */
        public void actionPerformed(ActionEvent e) {
            String cmd = e.getActionCommand();
            if (cmd.equals("F -> C")) {
                int f = fahrenheitField.getValue();
                int c = GMath.round((5.0 / 9.0) * (f - 32));
                celsiusField.setValue(c);
            } else if (cmd.equals("C -> F")) {
                int c = celsiusField.getValue();
                int f = GMath.round((9.0 / 5.0) * c + 32);
                fahrenheitField.setValue(f);
            }
        }
        /* Private instance variables */
        private IntField fahrenheitField;
        private IntField celsiusField;
    }



//    public void run() {
//        this.resize(WIDTH, HEIGHT + OFFSET); //*** size display window
//
//        // Ground plane
//        GRect rect = new GRect(0, HEIGHT, 1200, 3);
//        rect.setFilled(true);
//        add(rect);
//
//        // Creating instance of bTree class
//        bTree myTree = new bTree(); //***
//
//        // Set seed for randomness
//        rgen.setSeed((long) 424242); //***
//
//
//
//        // for loop to randomize and create 60 different balls
//        for (int i = 1; i <= NUMBALLS; i++) {
//            // Randomizing the different aBall parameters with boundaries
//            double bSize = rgen.nextDouble(MINSIZE, MAXSIZE); //***
//            Color bColor = rgen.nextColor(); //***
//            double bLoss = rgen.nextDouble(EMIN, EMAX); //***
//            double bVel = rgen.nextDouble(VoMIN, VoMAX); //***
//            double theta = rgen.nextDouble(ThetaMIN, ThetaMAX); //***
//
//            // Creating the ball with the previously randomly generate parameters
//            aBall iBall = new aBall((WIDTH/2)/SCALE,bSize,bVel,theta,bSize,bColor,bLoss,this); // Adding the ball // Null for no trace, this for trace
//            add(iBall.getBall()); //*** Getting the ball object
//            myTree.addNode(iBall); //*** Adding balls to a bTree
//            iBall.start(); // Starting the ball simulation
//
//        }
//
//        while (myTree.isRunning()) {} //*** Loop to block following code from running
//        GLabel label1 = new GLabel("Click mouse to continue", WIDTH/2, HEIGHT/2); // Message to click to stack balls
//        label1.setFont("SansSerif-24");
//        label1.setColor(Color.RED);
//        add(label1);
//        //Code to wait for a mouse click // Wait
//        this.waitForClick(); // Wait for user to click to continue program (found from looking through Glabel methods)
//        label1.setVisible(false); // Making the first message invisible (found from looking through Glabel methods)
//        myTree.stackBalls(); //*** Lay out balls in order
//        GLabel label2 = new GLabel("All Stacked!", WIDTH/2, HEIGHT/2); // Message that balls are stacked
//        label2.setFont("SansSerif-36");
//        label2.setColor(Color.RED);
//        add(label2);
//
//
//    }
}
