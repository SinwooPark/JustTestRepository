package test.controller;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("한개의 정수(1~100) : ");
		int a = s.nextInt();
		if(a >= 1 && a <= 100) {
			if(a % 2 == 0) {
				System.out.println("2의 배수입니다.");
			} else {
				System.out.println("2의 배수가 아닙니다.");
			}
		} else {
			System.out.println("1과 100 사이의 정수만 입력하세요.");
		}
	}
}