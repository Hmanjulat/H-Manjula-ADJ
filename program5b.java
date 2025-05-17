package A5;
import javax.swing.*;
import java.awt.*;
public class program5b extends JFrame  {
	 public program5b() {
	        setTitle("Color Tabbed Pane Demo");
	        setSize(400, 300);
	        setDefaultCloseOperation(EXIT_ON_CLOSE);

	        // Create a tabbed pane
	        JTabbedPane tabbedPane = new JTabbedPane();

	        // Create panels with different background colors
	        JPanel redPanel = new JPanel();
	        redPanel.setBackground(Color.RED);

	        JPanel bluePanel = new JPanel();
	        bluePanel.setBackground(Color.BLUE);

	        JPanel greenPanel = new JPanel();
	        greenPanel.setBackground(Color.GREEN);

	        // Add tabs to the tabbed pane
	        tabbedPane.addTab("RED", redPanel);
	        tabbedPane.addTab("BLUE", bluePanel);
	        tabbedPane.addTab("GREEN", greenPanel);

	        // Add tabbed pane to the frame
	        add(tabbedPane);

	        setVisible(true);
	    }

	    public static void main(String[] args) {
	        new program5b();
	    }
	}


