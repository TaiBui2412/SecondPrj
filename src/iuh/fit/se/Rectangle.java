package iuh.fit.se;

import java.io.IOException;

/**
 * @description:  This class represents oop exercises
 * @author:  Bui Van Tai
 * @version: 1.0
 * @created: Aug 23, 2024
 */

public class Rectangle {
	private double length;
	private double width;
	
	
	/**
	 * ham kho tao
	 */
	public Rectangle() {
	}
	/**
	 * ham kho tao
	 * @param length
	 * @param width
	 */
	public Rectangle(double length, double width) {
		if(length<0 || width<0) {
			throw new ArithmeticException("Length and width must be greater than 0");
		}
		this.length = length;
		this.width = width;
	}
	/**
	 * lay do dai cua hinh chu nhat
	 * @return length
	 */
	public double getLength() {
		return length;
	}
	/**
	 * thay doi do dai cua hinh chu nhat
	 * @param length
	 */
	public void setLength(double length) {
		if(width<0) {
			throw new ArithmeticException("Length must be greater than 0");
		}
		this.length = length;
	}
	/**
	 * lay do rong cua hinh chu nhat
	 * @return width
	 */
	public double getWidth() {
		return width;
	}
	/**
	 * thay doi do rong cua hinh chu nhat
	 * @param width
	 */
	public void setWidth(double width) {
		if(width<0) {
			throw new ArithmeticException("Width must be greater than 0");
		}
		this.width = width;
	}
	/**
	 * tinh dien tich
	 * @return length*width
	 */
	public double getArea(){
		return length*width;
	}
	/**
	 * tinh chu vi
	 * @return 2*length+2*width
	 */
	public double getPerimeter(){
		return 2*length+2*width;
	}
	
}
