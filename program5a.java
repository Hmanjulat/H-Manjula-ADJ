package A5;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.List;
public class program5a  extends JFrame {
	    // List of countries
	    String[] countries = {
	        "USA", "India", "Vietnam", "Canada", "Denmark",
	        "France", "Great Britain", "Japan", "Africa", "Greenland", "Singapore"
	    };

	    public program5a () {
	        setTitle("Country List Demo");
	        setSize(300, 250);
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	        setLayout(new FlowLayout());

	        // Create JList with the countries
	        JList<String> countryList = new JList<>(countries);
	        countryList.setVisibleRowCount(8);
	        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

	        // Add a scroll pane for better UI if many countries
	        JScrollPane scrollPane = new JScrollPane(countryList);
	        add(scrollPane);

	        // Add a listener to handle selection changes
	        countryList.addListSelectionListener(new ListSelectionListener() {
	            public void valueChanged(ListSelectionEvent e) {
	                if (!e.getValueIsAdjusting()) {
	                    List<String> selected = countryList.getSelectedValuesList();
	                    System.out.println("Selected countries:");
	                    for (String country : selected) {
	                        System.out.println(country);
	                    }
	                    System.out.println("-----");
	                }
	            }
	        });

	        setVisible(true);
	    }

	    public static void main(String[] args) {
	        new program5a ();
	    }
	}
