package by.htp.hometask.main;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double d;

		Scanner sc = new Scanner(System.in);

		System.out.print("Введите a:");
		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.print("Введите a:");
		}

		a = sc.nextDouble();

		System.out.print("Введите b:");
		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.print("Введите b:");
		}

		b = sc.nextDouble();

		System.out.print("Введите c:");
		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.print("Введите c:");
		}

		c = sc.nextDouble();

		d = (a * a) - ((b - c) * (b - c)) + Math.log((b * b) + 1);

		System.out.println("Значение выражения равно: " + d);

	}

}
