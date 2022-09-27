package test;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의세번째윈도우 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		//jframe, 크기정하고, 보여라. ==> windowbuilder로!
		JFrame f = new JFrame();
		f.setSize(500, 391);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("숫자1");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewLabel.setBounds(71, 136, 117, 36);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setForeground(new Color(0, 0, 0));
		t1.setBounds(144, 137, 284, 36);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("숫자2");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(71, 216, 61, 16);
		f.getContentPane().add(lblNewLabel_1);
		
		t2 = new JTextField();
		t2.setForeground(Color.BLACK);
		t2.setColumns(10);
		t2.setBounds(144, 207, 284, 36);
		f.getContentPane().add(t2);
		
		JButton plus = new JButton("더하기");
		plus.addActionListener(new ActionListener() {
			//버튼을 클릭했을 때 actionPerformed()함수가 사용하도록 규칙이 설정되어 있음.
			public void actionPerformed(ActionEvent e) {
				//plus버튼을 눌렀을 때 처리하고 싶은 내용을 넣는다.
				JOptionPane.showMessageDialog(f, "플러스 버튼을 누르셨군요.");
				//1. 두수를 가지고 오세요.(String)
				String n1 = t1.getText(); //"100"
				String n2 = t2.getText(); //"200"
				
				//2. 숫자로 변경해서 정수변수에 넣어주세요.
				int n11 = Integer.parseInt(n1);
				int n22 = Integer.parseInt(n2);
				
				//3. 결과출력
				JOptionPane.showMessageDialog(f, n11 + n22);
				f.setTitle("더한 결과는 " + (n11 + n22));
				//result.setText("더한 결과는 " + (n11 + n22));
				t1.setText("");
				t2.setText("");
				t1.setBackground(Color.blue);
				t1.setForeground(Color.red);
			}
		});
		plus.setBounds(144, 281, 117, 29);
		f.getContentPane().add(plus);
		
		JButton minus = new JButton("빼기");
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//버튼 눌렀을 때 실행할 부분을 넣어줌.
				JOptionPane.showMessageDialog(f, "마이너스 버튼을 누르셨군요.");
				//1. 두 수를 가지고 오세요. (String)
				String n1 = t1.getText();
				String n2 = t2.getText();
				
				//2. 숫자로 변경해서 정수변수에 넣어주세요.
				int n11 = Integer.parseInt(n1);
				int n22 = Integer.parseInt(n2);
				
				//3. 결과출력
				JOptionPane.showMessageDialog(f, n11 - n22);
			}
		});
		minus.setBounds(259, 281, 117, 29);
		f.getContentPane().add(minus);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("/Users/sgcha/Downloads/photo-1453728013993-6d66e9c9123a.jpeg"));
		lblNewLabel_2.setBounds(71, 37, 357, 73);
		f.getContentPane().add(lblNewLabel_2);
		
		JButton div = new JButton("나누기");
		div.setBounds(259, 315, 117, 29);
		f.getContentPane().add(div);
		
		JButton mul = new JButton("곱하기");
		mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mul.setBounds(144, 315, 117, 29);
		f.getContentPane().add(mul);
		f.setVisible(true);

	}
}
