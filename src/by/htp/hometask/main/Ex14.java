package by.htp.hometask.main;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		double a = 0;
		double b = 0;
		double c = 0;
		double result1 = 0;
		double result2 = 0;
		double result3 = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Введте первое число: ");

		while (!sc.hasNextDouble()) {
			System.out.println("Это не число!");
			sc.nextLine();

		}
		a = sc.nextDouble();

		if (a >= 0) {
			result1 = Math.pow(a, 2);
		} else {
			result1 = Math.pow(a, 4);
		}

		System.out.println("Введте второе число: ");

		while (!sc.hasNextDouble()) {
			System.out.println("Это не число!");
			sc.next();
		}

		b = sc.nextDouble();

		if (b >= 0) {
			result2 = Math.pow(b, 2);
		} else {
			result2 = Math.pow(b, 4);
		}

		System.out.println("Введте третье число: ");

		while (!sc.hasNextDouble()) {
			System.out.println("Это не число!");
			sc.next();
		}
		c = sc.nextDouble();

		if (a >= 0) {
			result3 = Math.pow(c, 2);
		} else {
			result3 = Math.pow(c, 4);
		}

		System.out.println("a = " + result1);
		System.out.println("b = " + result2);
		System.out.println("c = " + result3);
	}
}
