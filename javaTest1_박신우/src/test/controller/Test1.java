package test.controller;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("�Ѱ��� ����(1~100) : ");
		int a = s.nextInt();
		if(a >= 1 && a <= 100) {
			if(a % 2 == 0) {
				System.out.println("2�� ����Դϴ�.");
			} else {
				System.out.println("2�� ����� �ƴմϴ�.");
			}
		} else {
			System.out.println("1�� 100 ������ ������ �Է��ϼ���.");
		}
	}
}