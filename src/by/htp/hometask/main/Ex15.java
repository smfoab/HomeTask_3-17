package by.htp.hometask.main;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int h = 0;
		double x = 0;
		double fn = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Первое значение аргумента: ");

		while (!sc.hasNextInt()) {
			System.out.println("Введите целое число!");
			sc.next();

		}
		a = sc.nextInt();

		System.out.println("Второе значение аргумента: ");

		while (!sc.hasNextInt()) {
			System.out.println("Введите целое число!");
			sc.next();

		}
		b = sc.nextInt();

		System.out.println("Введте шаг:");

		while (!sc.hasNextInt()) {
			System.out.println("Введите целое число!");
			sc.next();

		}
		h = sc.nextInt();

		System.out.print("[Значения аргумента]" + "   ");
		System.out.println("[Значения функции]");
		System.out.println("  ");

		for (x = a; x <= b; x = x + h) {

			fn = 2 * Math.tan((x / 2)) + 1;

			System.out.print(x + "                  ");
			System.out.println(fn);

		}

	}

}