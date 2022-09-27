package test;

import javax.swing.JFrame;
import javax.swing.JToggleButton;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class 나의첫윈도우 {
	private static JTextField txtAsdfasdf;

	public static void main(String[] args) {
		//1. jframe 부품을 새로 만들어주자.
		JFrame f = new JFrame();
		
		//2. 새로 만든 부품의 크기를 결정
		f.setSize(654, 604);
		
		txtAsdfasdf = new JTextField();
		txtAsdfasdf.setText("댓글을 입력하세요.");
		f.getContentPane().add(txtAsdfasdf, BorderLayout.SOUTH);
		txtAsdfasdf.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		f.getContentPane().add(textArea, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setIcon(new ImageIcon("/Users/sgcha/Downloads/giphy.gif"));
		f.getContentPane().add(btnNewButton, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("돌아간다");
		f.getContentPane().add(lblNewLabel, BorderLayout.WEST);
		
		//3. 새로 만든 부품 "보여주세요" 설 
		f.setVisible(true);
	}

}
