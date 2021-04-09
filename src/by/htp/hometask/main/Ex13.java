package by.htp.hometask.main;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
		double e = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Введте а: ");

		while (!sc.hasNextDouble()) {
			System.out.println("Нужно число");
			sc.nextLine();
		}
		a = sc.nextDouble();

		System.out.println("Введте b: ");

		while (!sc.hasNextDouble()) {
			System.out.println("Нужно число");
			sc.next();
		}
		b = sc.nextDouble();

		System.out.println("Введте c: ");

		while (!sc.hasNextDouble()) {
			System.out.println("Нужно число");
			sc.next();
		}
		c = sc.nextDouble();

		System.out.println("Введте d: ");

		while (!sc.hasNextDouble()) {
			System.out.println("Нужно число");
			sc.next();
		}
		d = sc.nextDouble();

		if (c * d != 0) {

			e = (a * b / c * d) - (a * b - c) / c * d;
		} else {

			System.out.println("Знаменатель равен нулю");
			e = Double.NaN;
		}

		System.out.println("e = " + e);

	}
}