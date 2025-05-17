package A5;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.HashMap;
public class program5c extends JFrame{
	    private JList<String> countryList;
	    private HashMap<String, String> countryCapitalMap;

	    public program5c() {
	        // Frame properties
	        setTitle("Country and Capitals");
	        setSize(350, 300);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLayout(new BorderLayout());

	        // Initialize countries
	        String[] countries = {
	            "USA", "India", "Vietnam", "Canada", "Denmark",
	            "France", "Great Britain", "Japan", "Africa", "Greenland", "Singapore"
	        };

	        // Initialize map with capitals
	        countryCapitalMap = new HashMap<>();
	        countryCapitalMap.put("USA", "Washington, D.C.");
	        countryCapitalMap.put("India", "New Delhi");
	        countryCapitalMap.put("Vietnam", "Hanoi");
	        countryCapitalMap.put("Canada", "Ottawa");
	        countryCapitalMap.put("Denmark", "Copenhagen");
	        countryCapitalMap.put("France", "Paris");
	        countryCapitalMap.put("Great Britain", "London");
	        countryCapitalMap.put("Japan", "Tokyo");
	        countryCapitalMap.put("Africa", "Addis Ababa (AU HQ)");
	        countryCapitalMap.put("Greenland", "Nuuk");
	        countryCapitalMap.put("Singapore", "Singapore");

	        // Create JList
	        countryList = new JList<>(countries);
	        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
	        countryList.setVisibleRowCount(8);

	        // Add scroll pane
	        JScrollPane scrollPane = new JScrollPane(countryList);
	        add(scrollPane, BorderLayout.CENTER);

	        // Add listener
	        countryList.addListSelectionListener(e -> {
	            if (!e.getValueIsAdjusting()) {
	                java.util.List<String> selectedCountries = countryList.getSelectedValuesList();
	                System.out.println("Capitals of selected countries:");
	                for (String country : selectedCountries) {
	                    String capital = countryCapitalMap.get(country);
	                    System.out.println(country + " → " + capital);
	                }
	                System.out.println("-----");
	            }
	        });

	        // Make visible
	        setVisible(true);
	    }

	    public static void main(String[] args) {
	        new program5c();
	    }
	}
