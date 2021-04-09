package by.htp.hometask.main;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		final double Pi = 3.14159265358979;
		double r = 0;
		double c = 0;
		double s = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Введите радиус:");

		while (!sc.hasNextDouble()) {
			System.out.println("Введите число!");
			sc.nextLine();
		}
		r = sc.nextDouble();

		c = 2 * Pi * r;

		s = Pi * Math.pow(r, 2);

		System.out.printf("Длина окружности = " + "%.2f\n", c);
		System.out.printf("Площадь круга = " + "%.2f\n", s);

	}

}