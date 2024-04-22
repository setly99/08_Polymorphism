package com.kh.inheritance.ex;

//도형에서 사용한 메서드를 사용하겠다.extends

public class Triangle extends Shape {


	private double low;
	private double height;
	
	//생성자 : 필수
		//도형에 있는 필드를 작성해주지 않아  String color에 빨간줄생김*
		//도형에서 String 색깔을 넣어줬다면 삼각형에서도 String 색깔과 super(색깔)을넣어줘야함
	public Triangle(String color, double low, double height) {
		super(color);//
		this.low = low;
		this.height = height;
	}
	
	@Override
	public double shapeArea() {
		return 0.5 * low * height;
	}
	
	/*
	 Math
	 	sqrt = 제곱근 계산 메서드
	 	pow = 주어진 값을 거듭제곱하는 메서드
	 */
	@Override
	public double shapeSize() {//
		double side = Math.sqrt(Math.pow(low, 2) + Math.pow(height, 2));
		
		return low + height;
	}//이 메서드 넣으면 public class Triangle extends 에서 Triangle 에러없어짐
	
	
	

}
