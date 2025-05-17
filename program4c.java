package A4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class program4c extends JFrame implements ActionListener {
	

	

	    JButton btnClock, btnHourglass;
	    JLabel messageLabel;

	    public program4c() {
	        setTitle("Image Button Demo");
	        setSize(400, 300);
	        setLayout(new FlowLayout());
	        setDefaultCloseOperation(EXIT_ON_CLOSE);

	        // Load image icons (Make sure the image files are in the same directory as this Java file)
	        ImageIcon clockIcon = new ImageIcon("clock.png");
	        ImageIcon hourglassIcon = new ImageIcon("hourglass.png");

	        // Create buttons with images
	        btnClock = new JButton(clockIcon);
	        btnHourglass = new JButton(hourglassIcon);

	        // Add action listeners
	        btnClock.addActionListener(this);
	        btnHourglass.addActionListener(this);

	        // Label to display message
	        messageLabel = new JLabel("Press an image button");
	        messageLabel.setFont(new Font("SansSerif", Font.BOLD, 16));

	        // Add components to the frame
	        add(btnClock);
	        add(btnHourglass);
	        add(messageLabel);

	        setVisible(true);
	    }

	    // Handle button clicks
	    public void actionPerformed(ActionEvent e) {
	        if (e.getSource() == btnClock) {
	            messageLabel.setText("Digital Clock is pressed");
	        } else if (e.getSource() == btnHourglass) {
	            messageLabel.setText("Hour Glass is pressed");
	        }
	    }

	    public static void main(String[] args) {
	        new program4c();
	    }
	}


