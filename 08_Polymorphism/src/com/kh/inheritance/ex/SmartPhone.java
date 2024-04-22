package com.kh.inheritance.ex;

//부모클래스
public class SmartPhone {
//필드
	private String display;
	private String telecom;
	private String power;
	
//메서드
	//setter
	public void setDisplay(String display) {
		this.display = display;
	}
	public void setTelecom(String telecom) {
		this.telecom = telecom;
	}
	public void setPower(String power) {
		this.power = power;
	}
	//getter
	public String getDisplay() {
		return display;
	}
	public String getTelecom() {
		return telecom;
	}
	public String getPower() {
		return power;
	}
	//생성자 : 기본 ctrl + space -> enter
	public SmartPhone() {
	}
	//생성자 : 필수 alt + shift + s -> o
	public SmartPhone(String display, String telecom, String power) {
		//super();
		this.display = display;
		this.telecom = telecom;
		this.power = power;
	}
		
	//void, return
	
	//toString String밑에 만들어진 method
	@Override
	public String toString() {
		return "스마트폰 [화면=" + display + ", 통신사=" + telecom + ", 성능=" 
	+ power + "]";
	}
	
	
	
	
	

}
