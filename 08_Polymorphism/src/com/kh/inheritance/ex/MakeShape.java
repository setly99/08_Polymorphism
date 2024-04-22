package com.kh.inheritance.ex;

public class MakeShape {

	public static void main(String[] args) {
		//삼각형 만들기
		Triangle tri1 = new Triangle("삼색",3,5);
		
		//삼각형 넓이와 둘레와 색상
		System.out.println("삼각형 색깔 : " + tri1.getColor());
		System.out.println("삼각형 넓이 : " + tri1.shapeArea());
		System.out.println("삼각형 둘레 : " + tri1.shapeSize());
		
		//사각형 만들기
		//사각형 각진사각형 ("파란색", 5, 3);
		Square rs1 = new Square("파란색", 5, 3);
		System.out.println("사각형의 색깔 : " + rs1.getColor());
		System.out.println("사각형의 넓이 : " + rs1.shapeArea());
		System.out.println("사각형의 둘레 : " + rs1.shapeSize());
	}

}
