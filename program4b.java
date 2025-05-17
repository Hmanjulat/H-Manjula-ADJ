package A4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class program4b extends JFrame implements ActionListener{
	    // Declare buttons and label
	    JButton btnIndia, btnSrilanka;
	    JLabel messageLabel;

	    public program4b() {
	        // Set up the frame
	        setTitle("Country Button Demo");
	        setSize(400, 200);
	        setLayout(new FlowLayout());
	        setDefaultCloseOperation(EXIT_ON_CLOSE);

	        // Create buttons
	        btnIndia = new JButton("India");
	        btnSrilanka = new JButton("Srilanka");

	        // Add action listeners to buttons
	        btnIndia.addActionListener(this);
	        btnSrilanka.addActionListener(this);

	        // Create and set up the label
	        messageLabel = new JLabel("Click a button");
	        messageLabel.setFont(new Font("SansSerif", Font.BOLD, 18));

	        // Add components to frame
	        add(btnIndia);
	        add(btnSrilanka);
	        add(messageLabel);

	        // Make the frame visible
	        setVisible(true);
	    }

	    // Event handling logic
	    public void actionPerformed(ActionEvent e) {
	        if (e.getSource() == btnIndia) {
	            messageLabel.setText("India is pressed");
	        } else if (e.getSource() == btnSrilanka) {
	            messageLabel.setText("Srilanka is pressed");
	        }
	    }

	    public static void main(String[] args) {
	        new program4b();  // Create and show the GUI
	    }
	}
