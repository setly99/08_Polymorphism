package com.kh.inheritance.ex;
/*
 abstract class(추상클래스)
 추상메서드 포함하는 클래스
 미완성 클래스기 때문에
 컴퓨터에 추상클래스로 만든 파일의 자체공간 만든는 것은 불가능
 
 사용예제:
 [접근제어자 ] = public protected default private
 [접근제어자 ] = abstract class 파일명{
 	//필드, 메서드
 	 [접근제어자] abstract 자료형 변수명();
 */
public abstract class Shape {//추상클래스
//추상 : 같은 것을 본 뜬 것
	
//필드
	private String color;

//메서드	
	//setter
	public void setColor(String color) {
		this.color = color;
	}	
	//getter
	public String getColor() {
		return color;
	}
	
	//생성자
	public Shape() {
	}
		
	public Shape(String color) {
		super();
		this.color = color;
	}

	/*
	 abstract 나중에 설계도로 완성할 파일에서 필수로 불러줘서 완성해야하는 메서드들
	 abstract 메서드는 미완성 메서드이기 때문에 자식클래스에서 미완성된 부모클래스를 
		완성시켜주기 위해서 자식이 부모를 불러올 때 abstract 같은 경우에는
		자식에서 필수로 불러온 다음 메서드 모양을 완성해야 함
	 */
	public abstract double shapeArea();
	public abstract double shapeSize();
	
	public void info() {
		System.out.println("넓이 : "+ shapeArea() + " 이고 둘레 : " + shapeSize());
	}
	

}
