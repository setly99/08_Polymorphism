package com.kh.inheritance.ex;

//자식클래스
public class IPhone extends SmartPhone{
	
//필드
	private int iOS; //아이폰운영체제


//메서드
	//Setter
	public void setIOS(int iOS) {
		this.iOS = iOS;
	}
	//Getter
	public int getIOS() {
		return iOS;
	}
	//생성자 : 기본
	public IPhone() {
	}
	//생성자 : 필수
	public IPhone(String display, String telecom, String power, int iOS) {
		super(display, telecom, power);
		this.iOS = iOS;
	}
	
	
	//toString
	public String toString() {
		return "iPhone Ver : " + iOS + " / " + super.toString();
	}

}
