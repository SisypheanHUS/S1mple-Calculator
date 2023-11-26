package check;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class er {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	
	double first;
	double second;
	double result;
	String operation;
	String answer;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					er window = new er();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public er() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 318, 443);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setBounds(10, 10, 318, 57);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton bttbackspace = new JButton("\uF0E7");
		bttbackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				if(textField.getText().length()>0)
				{
					StringBuilder str = new StringBuilder (textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace = str.toString();
					textField.setText(backSpace);
				}
			}
		});
		bttbackspace.setFont(new Font("Wingdings", Font.BOLD, 18));
		bttbackspace.setBounds(10, 77, 63, 57);
		frame.getContentPane().add(bttbackspace);
		
		JButton btt7 = new JButton("7");
		btt7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btt7.getText();
				textField.setText(number);
			}
		});
		btt7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btt7.setBounds(10, 144, 63, 57);
		frame.getContentPane().add(btt7);
		
		JButton btt4 = new JButton("4");
		btt4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btt4.getText();
				textField.setText(number);
			}
		});
		btt4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btt4.setBounds(10, 211, 63, 57);
		frame.getContentPane().add(btt4);
		
		JButton btt1 = new JButton("1");
		btt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btt1.getText();
				textField.setText(number);
			}
		});
		btt1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btt1.setBounds(10, 278, 63, 57);
		frame.getContentPane().add(btt1);
		
		JButton btt0 = new JButton("0");
		btt0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btt0.getText();
				textField.setText(number);
			}
		});
		btt0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btt0.setBounds(10, 345, 63, 57);
		frame.getContentPane().add(btt0);
		
		JButton bttclear = new JButton("C");
		bttclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		bttclear.setFont(new Font("Tahoma", Font.BOLD, 18));
		bttclear.setBounds(85, 77, 63, 57);
		frame.getContentPane().add(bttclear);
		
		JButton btt8 = new JButton("8");
		btt8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btt8.getText();
				textField.setText(number);
			}
		});
		btt8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btt8.setBounds(85, 144, 63, 57);
		frame.getContentPane().add(btt8);
		
		JButton btt5 = new JButton("5");
		btt5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btt5.getText();
				textField.setText(number);
			}
		});
		btt5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btt5.setBounds(85, 211, 63, 57);
		frame.getContentPane().add(btt5);
		
		JButton btt2 = new JButton("2");
		btt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btt2.getText();
				textField.setText(number);
			}
		});
		btt2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btt2.setBounds(85, 278, 63, 57);
		frame.getContentPane().add(btt2);
		
		JButton bttdot = new JButton(".");
		bttdot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+bttdot.getText();
				textField.setText(number);
			}
		});
		bttdot.setFont(new Font("Tahoma", Font.BOLD, 18));
		bttdot.setBounds(85, 345, 63, 57);
		frame.getContentPane().add(bttdot);
		
		JButton btt00 = new JButton("00");
		btt00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btt00.getText();
				textField.setText(number);
			}
		});
		btt00.setFont(new Font("Tahoma", Font.BOLD, 18));
		btt00.setBounds(160, 77, 63, 57);
		frame.getContentPane().add(btt00);
		
		JButton btt9 = new JButton("9");
		btt9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btt9.getText();
				textField.setText(number);
			}
		});
		btt9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btt9.setBounds(160, 144, 63, 57);
		frame.getContentPane().add(btt9);
		
		JButton btt6 = new JButton("6");
		btt6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btt6.getText();
				textField.setText(number);
			}
		});
		btt6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btt6.setBounds(160, 211, 63, 57);
		frame.getContentPane().add(btt6);
		
		JButton btt3 = new JButton("3");
		btt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btt3.getText();
				textField.setText(number);
			}
		});
		btt3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btt3.setBounds(160, 278, 63, 57);
		frame.getContentPane().add(btt3);
		
		JButton bttequal = new JButton("=");
		bttequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second = Double.parseDouble(textField.getText());
				if(operation=="+") 
				{
					result=first + second;
					answer = String.format("%.2f",result);
					textField.setText(answer);				}
				else if(operation=="-") 
				{
					result=first - second;
					answer = String.format("%.2f",result);
					textField.setText(answer);				}
				else if(operation=="*") 
				{
					result=first * second;
					answer = String.format("%.2f",result);
					textField.setText(answer);				}
				else if(operation=="/") 
				{
					result=first / second;
					answer = String.format("%.2f",result);
					textField.setText(answer);				}
				else if(operation=="%") 
				{
					result=first % second;
					answer = String.format("%.2f",result);
					textField.setText(answer);				}
				
			}
		});
		bttequal.setFont(new Font("Tahoma", Font.BOLD, 18));
		bttequal.setBounds(160, 345, 63, 57);
		frame.getContentPane().add(bttequal);
		
		JButton bttplus = new JButton("+");
		bttplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first =  Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
				
			}
		});
		bttplus.setFont(new Font("Tahoma", Font.BOLD, 18));
		bttplus.setBounds(235, 77, 63, 57);
		frame.getContentPane().add(bttplus);
		
		JButton bttminus = new JButton("-");
		bttminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first =  Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		bttminus.setFont(new Font("Tahoma", Font.BOLD, 18));
		bttminus.setBounds(235, 144, 63, 57);
		frame.getContentPane().add(bttminus);
		
		JButton bttmutiple = new JButton("*");
		bttmutiple.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first =  Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		bttmutiple.setFont(new Font("Tahoma", Font.BOLD, 18));
		bttmutiple.setBounds(235, 211, 63, 57);
		frame.getContentPane().add(bttmutiple);
		
		JButton bttdivide = new JButton("/");
		bttdivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first =  Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		bttdivide.setFont(new Font("Tahoma", Font.BOLD, 18));
		bttdivide.setBounds(235, 278, 63, 57);
		frame.getContentPane().add(bttdivide);
		
		JButton bttpercent = new JButton("%");
		bttpercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first =  Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		bttpercent.setFont(new Font("Tahoma", Font.BOLD, 18));
		bttpercent.setBounds(235, 345, 63, 57);
		frame.getContentPane().add(bttpercent);
	}
}
