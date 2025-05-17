package A4;
import javax.swing.*;
import java.awt.*;

public class program4a {
	public static void main(String[] args) {
	        // Create a new JFrame (window)
	        JFrame frame = new JFrame("Swing Hello Program");

	        // Create the message label
	        JLabel label = new JLabel("Hello! VI C, Welcome to Swing Programming", SwingConstants.CENTER);

	        // Set font: plain style, size 32
	        label.setFont(new Font("SansSerif", Font.PLAIN, 32));

	        // Set font color to blue
	        label.setForeground(Color.BLUE);

	        // Optional: center the label in the frame
	        frame.getContentPane().add(label);

	        // Set frame size
	        frame.setSize(800, 200);

	        // Close the application when the frame is closed
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        // Make the frame visible
	        frame.setVisible(true);
	    }
	}


