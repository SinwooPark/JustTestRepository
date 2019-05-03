package com.calc;

public class Calculator {

	public static void main(String[] args) {
		//맨 처음에 프로그램을 시행할 때 외부에서 값을 받아오기 위해 사용
		/*Scanner s = new Scanner(System.in);
		
		args = new String[2];
		System.out.print("정수 두개 입력 : ");
		args[0] = s.next();
		args[1] = s.next();*/

		System.out.println("합 : "+ (Integer.parseInt(args[0]) + Integer.parseInt(args[1])));
		System.out.println("차 : "+ (Integer.parseInt(args[0]) - Integer.parseInt(args[1])));
		System.out.println("곱 : "+ (Integer.parseInt(args[0]) * Integer.parseInt(args[1])));
		System.out.println("나누기 : "+ (Integer.parseInt(args[0]) / Integer.parseInt(args[1])));

	}
}
