package com.kh.interfaceEx;

//기계와 계산기를 가지고와서 재사용 겸 메서드 완성
public class MidComputing implements Computing, Machine{
	
	@Override
	public void powerOn() {
		System.out.println("중학생계산기 켭니다.");
	}
	@Override
	public void powerOff() {
		System.out.println("중학생계산기 끕니다.");
	}
	
	@Override
	public int sum(int a, int b) {
		return a + b;
	}
	@Override
	public int sub(int a, int b) {
		return a - b;
	}	
	@Override
	public int mul(int a, int b) {
		return a * b;
	}
	@Override
	public double div(int a, int b) {
		return (double)a / b;
	}
	@Override
	public int mod(int a, int b) {
		return a % b;
	}
	
	

}
