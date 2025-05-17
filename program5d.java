package A5;
import javax.swing.*;
import java.awt.*;
public class program5d extends JFrame{
	
	

	    public program5d() {
	        setTitle("Color Tabbed Pane");
	        setSize(400, 300);
	        setDefaultCloseOperation(EXIT_ON_CLOSE);

	        // Create the tabbed pane
	        JTabbedPane tabbedPane = new JTabbedPane();

	        // Create panels for each color
	        JPanel cyanPanel = new JPanel();
	        cyanPanel.setBackground(Color.CYAN);

	        JPanel magentaPanel = new JPanel();
	        magentaPanel.setBackground(Color.MAGENTA);

	        JPanel yellowPanel = new JPanel();
	        yellowPanel.setBackground(Color.YELLOW);

	        // Add the panels as tabs
	        tabbedPane.addTab("Cyan", cyanPanel);
	        tabbedPane.addTab("Magenta", magentaPanel);
	        tabbedPane.addTab("Yellow", yellowPanel);

	        // Add tabbed pane to the frame
	        add(tabbedPane);

	        // Show the frame
	        setVisible(true);
	    }

	    public static void main(String[] args) {
	        new program5d();
	    }
	}


