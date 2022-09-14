package Equation2;

import java.util.Scanner;

class Ptrinhbac1 {
	double hsb1, hsb0;

	Ptrinhbac1() {
	}

	Ptrinhbac1(double a, double b) {
		hsb1 = a;
		hsb0 = b;
	}

	void nhap() {
		Scanner kb = new Scanner(System.in);
		System.out.println(" nhap he so bac 1: ");
		hsb1 = kb.nextDouble();
		System.out.println(" nhap he so bac 0: ");
		hsb0 = kb.nextDouble();
	}

	void giai() {
		System.out.println("\n Giai ptrinh: " + hsb1 + ".x +" + hsb0 + " =0");
		if (hsb1 == 0)
			if (hsb0 == 0)
				System.out.println("\n Phuong trinh co vo so nghiem");
			else
				System.out.println("\n Phuong trinh vo nghiem");
		else
			System.out.println("\n Phuong trinh co nghiem x = " + (-hsb0 / hsb1));
	}

	double gethsb1() {
		return hsb1;
	}

	double gethsb0() {
		return hsb0;
	}
}

public class PTB2 extends Ptrinhbac1 {
	double hsb2;

	void nhap() {
		Scanner kb = new Scanner(System.in);
		System.out.println(" nhap he so bac 2: ");
		hsb2 = kb.nextDouble();
		super.nhap();
	}

	PTB2() {
	}

	PTB2(double a, double b, double c) { // ax^2 + bx + c = 0
		super(b, c);
		hsb2 = a;

	}

	void in() {
	}

	void giai() {
		if (hsb2 == 0) {
			System.out.println("\n day la phuong trinh bac 1:\n");
			super.giai();
		} else {
			double d = gethsb1() * gethsb1() - 4 * hsb2 * gethsb0();
			System.out.println("\n Giai PT bac 2");
			if (d < 0)
				System.out.println("\n Phuong trinh vo nghiem");
			else if (d == 0)
				System.out.println("\n Phuong trinh co nghiem kep =" + (-gethsb1() / (2 * hsb2)));
			else if (d > 0) {
				System.out.println("phuong trinh co 2 nghiem phan biet la:");
				System.out.println("x1=" + ((-gethsb1() - Math.sqrt(d) / (2 * hsb2))));
				System.out.println("x1=" + ((-gethsb1() + Math.sqrt(d) / (2 * hsb2))));
			} else {
				System.out.println("Phuong trinh vo nghiem");
			}
		}
	}

	public static void main(String[] args) {
		PTB2 m = new PTB2();
		m.nhap();
		m.giai();
	}
}
