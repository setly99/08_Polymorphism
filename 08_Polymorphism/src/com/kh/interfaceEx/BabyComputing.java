package com.kh.interfaceEx;

// 계산기 기본 사용 메서드 implements로 가져오기
// 계산기 220v 사용해서 사용할 것
//인터페이스는 모든 인터페이스로 만들어진 파일을 원없이 가지고 올 수 있음
//여러 파일을 가지고 올 때 (,) 써서 interface 파일명 작성해주면 됨
public class BabyComputing implements Computing, Machine{//, Machine ?
	/*
	 Machine.java 인터페이스에서 가져온 powerOn, powerOff
	 */	
	@Override
	public void powerOn() {
		System.out.println("계산기 전원을 킵니다.");
	}
	@Override
	public void powerOff() {
		System.out.println("계산기 전원을 끕니다.");
	}
	
	/*
	 Computing.java 인터페이스에서 가져온 합 차 곱 나눗셈 나머지
	 */
	
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
