package com.kh.interfaceEx;

public class Laundry implements Machine {

	@Override//컴퓨터에서 썼으니까 override?
	public void powerOn() {
		System.out.println("세탁기의 전원이 켜졌습니다.");
	}
	
	@Override
	public void powerOff() {
		System.out.println("세탁기의 전원이 꺼졌습니다.");
		
	}
}
