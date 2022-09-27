package test;

import javax.swing.JOptionPane;

public class Exam {

	public static void main(String[] args) {
		//1.
		char w1 = 'p';
		char w2 = 'q';
		if (w1 == w2) {
			System.out.println("PASS!");
			
		} else {
			System.out.println("재입력");
		}
		
		//2.
		double change = 2.2;
		if (change >= 2) {
			System.out.println("다이어트 성공!");
		}
		
		//3.
		if (w1 == w2 && change >= 2) {
			System.out.println("성공!");
		} else {
			System.out.println("내일 다시 도전");
		}
		
		//4.
		int p = 66;
		int m = 77;
		int e = 88;
		int k = 99;
		
		int sum = p + m + e + k;
		int count = 4;
		// 정수와 정수 계산은 무조건 정수이다.
		// 계산결과가 실수가 나왔다 하더라도
		// 실수를 잘라서 정수로 만들어 버린다!!
		
		double avg = (double)sum / count;
		// 둘 중 하나를 실수로 만들어라!
		// 무조ㅓ건결과를 실수!!!
		System.out.println("평균은 " + avg);
		
		// 다른 언어에 비해 연산자(기호)수가 적다.
		System.out.println(3 * 3);
		
		
		//5.
		final double PI = 3.14;
		double r = 2.2;
		double result = PI * r * r;
		System.out.println("원의 면적은 " + result);
	}
}
