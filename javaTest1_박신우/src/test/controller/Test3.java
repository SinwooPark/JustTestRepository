package test.controller;

public class Test3 {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		while(i <= 100) {
			sum += i;
			i++;
		}
		double avg = sum / 100;
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + avg);
	}
}
