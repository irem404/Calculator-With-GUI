package Calculator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;

public class calculator extends JFrame {

	private JPanel contentPane;
	private JTextField input;
	private double answer,number;
	int operation;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator frame = new calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	
	
	public void addInput(String str) {
		input.setText(input.getText()+str);
	}
	
	public void calculate() {
		switch(operation) {
		case 1:
			answer = number + Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		case 2:
			answer = number - Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		case 3:
			answer = number * Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		case 4:
			answer = number / (Double.parseDouble(input.getText()));
			input.setText(Double.toString(answer));
			break;
		}
	}
	
	public calculator() {
		setType(Type.UTILITY);
		setTitle("hesap makinesi");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 476, 656);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel screen = new JPanel();
		screen.setBounds(10, 10, 442, 71);
		contentPane.add(screen);
		screen.setLayout(null);
		
		input = new JTextField();
		input.setEditable(false);
		input.setHorizontalAlignment(SwingConstants.RIGHT);
		input.setFont(new Font("Tahoma", Font.BOLD, 23));
		input.setBounds(10, 20, 422, 51);
		screen.add(input);
		input.setColumns(10);
		
		JLabel lbl = new JLabel("lbl");
		lbl.setFont(new Font("Tahoma", Font.BOLD, 10));
		lbl.setHorizontalAlignment(SwingConstants.CENTER);
		lbl.setBounds(127, 0, 305, 19);
		screen.add(lbl);
		
		JPanel kontrol = new JPanel();
		kontrol.setBounds(10, 110, 442, 350);
		contentPane.add(kontrol);
		kontrol.setLayout(new GridLayout(0, 4, 20, 20));
		
		JButton btnNewButton7 = new JButton("7");
		btnNewButton7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
				
			}
			
		});
		btnNewButton7.setFont(new Font("Tahoma", Font.BOLD, 23));
		kontrol.add(btnNewButton7);
		
		JButton btnNewButton8 = new JButton("8");
		btnNewButton8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
				
			}
			
		});
		btnNewButton8.setFont(new Font("Tahoma", Font.BOLD, 23));
		kontrol.add(btnNewButton8);
		
		JButton btnNewButton9 = new JButton("9");
		btnNewButton9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
				
			}
			
		});
		btnNewButton9.setFont(new Font("Tahoma", Font.BOLD, 23));
		kontrol.add(btnNewButton9);
		
		JButton btnNewButton10 = new JButton("+");
		btnNewButton10.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				number =Double.parseDouble(input.getText());
				operation=1;
				input.setText("");
				lbl.setText(number + e.getActionCommand());
				
				
				
			}
			
		});
		btnNewButton10.setFont(new Font("Tahoma", Font.BOLD, 23));
		kontrol.add(btnNewButton10);
		
		JButton btnNewButton6 = new JButton("6");
		btnNewButton6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
				
			}
			
		});
		btnNewButton6.setFont(new Font("Tahoma", Font.BOLD, 23));
		kontrol.add(btnNewButton6);
		
		JButton btnNewButton5 = new JButton("5");
		btnNewButton5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
				
			}
			
		});
		btnNewButton5.setFont(new Font("Tahoma", Font.BOLD, 23));
		kontrol.add(btnNewButton5);
		
		JButton btnNewButton4 = new JButton("4");
		btnNewButton4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
				
			}
			
		});
		btnNewButton4.setFont(new Font("Tahoma", Font.BOLD, 23));
		kontrol.add(btnNewButton4);
		
		JButton btnNewButton11 = new JButton("-");
		btnNewButton11.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				number =Double.parseDouble(input.getText());
				operation=2;
				input.setText("");
				lbl.setText(number + e.getActionCommand());
				
				
				
			}
			
		});
		btnNewButton11.setFont(new Font("Tahoma", Font.BOLD, 23));
		kontrol.add(btnNewButton11);
		
		JButton btnNewButton3 = new JButton("3");
		btnNewButton3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
				
			}
			
		});
		btnNewButton3.setFont(new Font("Tahoma", Font.BOLD, 23));
		kontrol.add(btnNewButton3);
		
		JButton btnNewButton2 = new JButton("2");
		btnNewButton2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
				
			}
			
		});
		btnNewButton2.setFont(new Font("Tahoma", Font.BOLD, 23));
		kontrol.add(btnNewButton2);
		
		JButton btnNewButton1 = new JButton("1");
		btnNewButton1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
				
			}
			
		});
		btnNewButton1.setFont(new Font("Tahoma", Font.BOLD, 23));
		kontrol.add(btnNewButton1);
		
		JButton btnNewButton12 = new JButton("*");
		btnNewButton12.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				number =Double.parseDouble(input.getText());
				operation=3;
				input.setText("");
				lbl.setText(number + e.getActionCommand());
				
				
				
			}
			
		});
		btnNewButton12.setFont(new Font("Tahoma", Font.BOLD, 23));
		kontrol.add(btnNewButton12);
		
		JButton btnNewButton0 = new JButton("0");
		btnNewButton0.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
				
			}
			
		});
		btnNewButton0.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnNewButton0.setBounds(10, 491, 95, 103);
		contentPane.add(btnNewButton0);
		
		JButton btnNewButton14 = new JButton("=");
		btnNewButton14.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				calculate();
				lbl.setText("");
				
				
				
			}
			
		});
		btnNewButton14.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnNewButton14.setBounds(127, 491, 95, 103);
		contentPane.add(btnNewButton14);
		
		JButton btnNewButton15 = new JButton("C");
		btnNewButton15.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				input.setText("");
				
			}
			
		});
		btnNewButton15.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnNewButton15.setBounds(245, 491, 95, 103);
		contentPane.add(btnNewButton15);
		
		JButton btnNewButton13 = new JButton("%");
		btnNewButton13.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				number =Double.parseDouble(input.getText());
				operation=4;
				input.setText("");
				lbl.setText(number + e.getActionCommand());
				
				
				
			}
			
		});
		btnNewButton13.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnNewButton13.setBounds(357, 491, 95, 103);
		contentPane.add(btnNewButton13);
	}
}
