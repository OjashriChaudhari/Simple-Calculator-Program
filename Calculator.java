package com.testing;

import java.util.Scanner;

public class Calculator {

	double n1;
	double n2;
	double ans;

	void calculations(char op) {

		if (op == '+') {
			ans = n1 + n2;
		} else if (op == '-') {
			ans = n1 - n2;
		} else if (op == '*') {
			ans = n1 * n2;
		} else if (op == '/') {
			if (n2 != 0) { // Check for division by zero
				ans = n1 / n2;
			} else {
				System.out.println("Division by zero is not allowed.");
				return;
			}
		} else if (op == '%') {
			if (n2 != 0) { // Check for modulus by zero
				ans = n1 % n2;
			} else {
				System.out.println("Modulus by zero is not allowed.");
				return;
			}
		} else {
			System.out.println("Invalid operator!");
		}
	}

	void display() {
		System.out.println("Answer : " + ans);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Calculator cal = new Calculator();

		System.out.print("Enter first number :");
		cal.n1 = sc.nextDouble();

		System.out.print("Enter Second number :");
		cal.n2 = sc.nextDouble();

		System.out.print("Enter the type of operation (+ , - , * , / , %) : ");

		char op = sc.next().charAt(0);

		cal.calculations(op);
		cal.display();

	}
}
