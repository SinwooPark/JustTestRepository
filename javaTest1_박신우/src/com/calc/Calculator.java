package com.calc;

public class Calculator {

	public static void main(String[] args) {
		//�� ó���� ���α׷��� ������ �� �ܺο��� ���� �޾ƿ��� ���� ���
		/*Scanner s = new Scanner(System.in);
		
		args = new String[2];
		System.out.print("���� �ΰ� �Է� : ");
		args[0] = s.next();
		args[1] = s.next();*/

		System.out.println("�� : "+ (Integer.parseInt(args[0]) + Integer.parseInt(args[1])));
		System.out.println("�� : "+ (Integer.parseInt(args[0]) - Integer.parseInt(args[1])));
		System.out.println("�� : "+ (Integer.parseInt(args[0]) * Integer.parseInt(args[1])));
		System.out.println("������ : "+ (Integer.parseInt(args[0]) / Integer.parseInt(args[1])));

	}
}
