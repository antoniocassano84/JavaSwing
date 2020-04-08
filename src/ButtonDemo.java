// Demonstrate a push button and handle action events.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonDemo implements ActionListener {

  JLabel jlab;

  ButtonDemo() {

    // Create a new JFrame container.
    JFrame jfrm = new JFrame("A Button Example");

    // Specify FlowLayout for the layout manager.
    jfrm.setLayout(new FlowLayout());

    // Give the frame an initial size.
    jfrm.setSize(320, 90);

    // Terminate the program when the user closes the application.
    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Make two buttons.
    JButton jbtnUp = new JButton("Up");
    JButton jbtnDown = new JButton("Down");

    // Add action listeners.
    jbtnUp.addActionListener(this);
    jbtnDown.addActionListener(this);

    // Add the buttons to the content pane.
    jfrm.add(jbtnUp);
    jfrm.add(jbtnDown);

    // Create a label.
    jlab = new JLabel("Press a button.");

    // Add the label to the frame.
    jfrm.add(jlab);

    // Display the frame.
    jfrm.setVisible(true);
  }

  // Handle button events.
  @Override
  public void actionPerformed(ActionEvent ae) {
    if(ae.getActionCommand().equals("Up")) jlab.setText("You pressed Up.");
    else if (ae.getActionCommand().equals("Down")) jlab.setText("You presses Down");
    else System.out.println("Don't know what you pressed.");
  }

  public static void main(String[] args) {
    // Create the frame on the event dispatching thread.
    SwingUtilities.invokeLater(() -> new ButtonDemo());
  }
}
