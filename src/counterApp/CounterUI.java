package counterApp;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CounterUI extends JFrame{ //handles the user interface and event handling
	
	private JLabel label;
	private JButton button;
	private CounterLogic logic;
	
	public CounterUI() {
		
		logic = new CounterLogic();
		
		setTitle("Counter App");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		label = new JLabel("Count : 0", SwingConstants.CENTER);
		button = new JButton("Increment");
		
		setLayout(new BorderLayout());
		add(label, BorderLayout.CENTER);
		add(button, BorderLayout.SOUTH);
		
		button.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
			logic.increment();
			label.setText("Count: "+logic.getCount());
		}
		}
				);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			
			public void run() {
				
				CounterUI ui = new CounterUI();
				ui.setVisible(true);
				
			}
			
		});
	}

}
