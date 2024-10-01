package practice;


import javax.swing.*;

import java.awt.*;

public class java_ui {

		

		
		    public static void main(String[] args) {
		        JFrame frame = new JFrame("Simple UI");
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        frame.setSize(300, 200);

		        JPanel panel = new JPanel();
		        panel.setLayout(new FlowLayout());

		        JLabel label = new JLabel("Hello, World!");
		        JButton button = new JButton("Click Me");

		        panel.add(label);
		        panel.add(button);

		        frame.add(panel);
		        frame.setVisible(true);
		        
		    }
		    
	
	}


