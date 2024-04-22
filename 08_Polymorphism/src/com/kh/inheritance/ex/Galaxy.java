package com.kh.inheritance.ex;

//extends 스마트폰 상속받기
public class Galaxy extends SmartPhone {
//필드
	private int android;

	
	//메서드
	//Setter
	public void setAndroid(int android) {
		this.android = android;
	}
	
	//Getter
	public int getAndroid() {
		return android;
	}

	
	//생성자 : 기본 ctrl + space + enter
	public Galaxy() {
	}
	//생성자 : 필수 alt + shift + s -> o

	public Galaxy(int android) {
		super();
		this.android = android;
	}


	
	//@Override annotation toString alt + shift + s -> s
	@Override
	public String toString() {
		return "Galaxy [android=" + android + "]";
	}
	
	
	/*
	@Override
	public String toString() {
		return "Galaxy Ver : " + android + "//" + super.toString();
	}
	*/
	
	

}
