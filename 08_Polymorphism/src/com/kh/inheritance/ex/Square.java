package com.kh.inheritance.ex;

//도형가져오기 extends
public class Square extends Shape{
//필드
	//밑변 높이
	private double low;
	private double height;
	
	//메서드
		//생성자
	public Square() {
	}
		//생성자 : 필수

	public Square(String color, double low, double height) {
		super(color);
		this.low = low;
		this.height = height;
	}
	
	@Override//원래자바에있어서인지 abstract구현하면서 쓰는건지?
	public double shapeArea() {
		return low * height;
	}
	
	public double shapeSize() {
		return 2*(low + height);
	}
	
	
	
}
