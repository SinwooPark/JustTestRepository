package test.controller;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("���� �� �� �Է� : ");
		int a = s.nextInt();
		int b = s.nextInt();
		
		if(a >= 1 && a <= 9 && b >= 1 && b <= 9) {
			if(a*b / 10 == 0) {
				System.out.println("�� �ڸ� �� �Դϴ�.");
			} else {
				System.out.println("�� �ڸ� �� �Դϴ�.");
			}
		}
	}
}
