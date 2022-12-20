package lotto;

import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.awt.*;

public class lotto4 extends JFrame {
	
	lotto4() {

		setTitle("연금복권 생성기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
		setLayout(new BorderLayout(0, 5));
		makeElements();
		setVisible(true);
	}
	
	void makeElements() {
		
		JPanel northPanel = new JPanel();
		JPanel southPanel = new JPanel();
		northPanel.setBackground(Color.orange);
		southPanel.setBackground(Color.orange);
		
		
		JTextArea text = new JTextArea();
		text.setBackground(Color.orange);
		JScrollPane textPanel = new JScrollPane(text);
		
		
		JButton[] num = new JButton[6];
		JPanel numPane = new JPanel();
		numPane.setBackground(Color.orange);
		numPane.setLayout(new GridLayout(1, 6, 10, 0));
		for(int i = 0; i < num.length; i++) {
			num[i] = new JButton(" ");
			numPane.add(num[i]);
		}
		
		JButton btn = new JButton("각 자리 생성하기");
		btn.addActionListener(new MyActionListener(num, text));
		
		northPanel.add(numPane);
		southPanel.add(btn);
		
		add(textPanel, BorderLayout.CENTER);
		add(northPanel, BorderLayout.NORTH);
		add(southPanel, BorderLayout.SOUTH);
		
	}
	
	class MyActionListener implements ActionListener {
		
		JButton[] buttons;
		JTextArea textArea;
		
		MyActionListener(JButton[] buttons, JTextArea textArea) {
			this.buttons = buttons;
			this.textArea = textArea;
		}
		
		public void actionPerformed(ActionEvent e) {
			ArrayList<String> lottoNum = new ArrayList<>();
			
			int i = 0;
			while(i < 6) {
				Integer temp = (int)(Math.random() * 10);
				String element;
				if(temp < 10) {
					element = String.valueOf(temp);
				}
				else {
					element = String.valueOf(temp);
				}
				if(!lottoNum.contains(element)) {
					lottoNum.add(element);
					i++;
				}
			}
			
			String message = "                                   ";
			
			for(int j = 0; j < buttons.length; j++) {
				buttons[j].setText(lottoNum.get(j));
				message += lottoNum.get(j) + "       ";
			}
			
			textArea.append(message + "\n");
			textArea.setCaretPosition(textArea.getDocument().getLength());
		}
		
	}

	public static void main(String[] args) {
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		new lotto4();
		
	}

}
