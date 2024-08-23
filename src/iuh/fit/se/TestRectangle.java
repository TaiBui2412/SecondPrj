package iuh.fit.se;

import java.util.Scanner;

/**
 * @description:  This class represents oop exercises
 * @author:  Bui Van Tai
 * @version: 1.0
 * @created: Aug 23, 2024
 */

public class TestRectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter length : ");
		double length = sc.nextDouble();
		System.out.print("enter width : ");
		double width = sc.nextDouble();
		Rectangle re = new Rectangle(length, width);
		System.out.println("Area re = "+re.getArea());
		System.out.println("Perimeter re = "+ re.getPerimeter());
	}
}
