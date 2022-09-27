package test;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 조건문확인문제 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 600);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("먹고 싶은 음식");
		lblNewLabel.setFont(new Font("Sandoll GyeokdongGothic", Font.BOLD, 17));
		lblNewLabel.setBounds(66, 63, 144, 44);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setForeground(new Color(254, 255, 255));
		t1.setFont(new Font("Nanum Gothic", Font.BOLD, 15));
		t1.setBackground(new Color(0, 173, 255));
		t1.setBounds(199, 63, 246, 44);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("당신의 나이는");
		lblNewLabel_1.setFont(new Font("Sandoll GyeokdongGothic", Font.BOLD, 17));
		lblNewLabel_1.setBounds(66, 203, 144, 44);
		f.getContentPane().add(lblNewLabel_1);
		
		t2 = new JTextField();
		t2.setForeground(new Color(254, 255, 255));
		t2.setFont(new Font("Nanum Gothic", Font.BOLD, 15));
		t2.setColumns(10);
		t2.setBackground(new Color(0, 173, 255));
		t2.setBounds(199, 203, 246, 44);
		f.getContentPane().add(t2);
		
		JButton btnNewButton = new JButton("어디로 갈까?");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				if (s1.equals("아메리카노") || s1.equals("아이스 아메리카노") || s1.equals("홍차")) {
					JOptionPane.showMessageDialog(f, "카페 가세요.");
				} else {
					JOptionPane.showMessageDialog(f, "물이나 마셔요.");
				}
			}
		});
		btnNewButton.setBackground(new Color(255, 223, 0));
		btnNewButton.setBounds(66, 118, 379, 40);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("나의 내년 나이는?");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s2 = t2.getText();
				int age = Integer.parseInt(s2);
				JOptionPane.showMessageDialog(f, (age + 1) + "살");
			}
		});
		btnNewButton_1.setBackground(new Color(255, 223, 0));
		btnNewButton_1.setBounds(66, 263, 379, 40);
		f.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("수학 점수");
		lblNewLabel_1_1_1.setFont(new Font("Sandoll GyeokdongGothic", Font.BOLD, 17));
		lblNewLabel_1_1_1.setBounds(66, 404, 144, 44);
		f.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("국어 점수");
		lblNewLabel_1_1.setFont(new Font("Sandoll GyeokdongGothic", Font.BOLD, 17));
		lblNewLabel_1_1.setBounds(66, 344, 144, 44);
		f.getContentPane().add(lblNewLabel_1_1);
		
		t3 = new JTextField();
		t3.setForeground(new Color(254, 255, 255));
		t3.setFont(new Font("Nanum Gothic", Font.BOLD, 15));
		t3.setColumns(10);
		t3.setBackground(new Color(0, 173, 255));
		t3.setBounds(199, 344, 246, 44);
		f.getContentPane().add(t3);
		
		t4 = new JTextField();
		t4.setForeground(new Color(254, 255, 255));
		t4.setFont(new Font("Nanum Gothic", Font.BOLD, 15));
		t4.setColumns(10);
		t4.setBackground(new Color(0, 173, 255));
		t4.setBounds(198, 404, 246, 44);
		f.getContentPane().add(t4);
		
		JButton btnNewButton_1_1 = new JButton("두 과목 점수의 평균은?");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s3 = t3.getText();
				String s4 = t4.getText();
				int g1 = Integer.parseInt(s3);
				int g2 = Integer.parseInt(s4);
				
				double avg = (g1 + g2) / 2.0;
				JOptionPane.showMessageDialog(f, avg + "점");
			}
		});
		btnNewButton_1_1.setBackground(new Color(255, 223, 0));
		btnNewButton_1_1.setBounds(65, 467, 379, 40);
		f.getContentPane().add(btnNewButton_1_1);
		
		f.setVisible(true);

	}

}
