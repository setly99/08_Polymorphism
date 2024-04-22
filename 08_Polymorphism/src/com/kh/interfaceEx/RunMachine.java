package com.kh.interfaceEx;

public class RunMachine {

	public static void main(String[] args) {

		Computer window = new Computer();
		window.powerOn();
		window.powerOff();
		
		Laundry lound = new Laundry();
		lound.powerOn();
		lound.powerOff();
		
		//어린이용 기계 실행
		BabyComputing  c1 = new BabyComputing();
		c1.powerOn();
		c1.powerOff();
		
		//어린이용 계산기 기능 테스트
		int a = 10;
		int b = 5;
		
		System.out.println(a + " + " + b + " = " + c1.sum(a, b));
		System.out.println(a + " - " + b + " = " + c1.sub(a, b));
		System.out.println(a + " * " + b + " = " + c1.mul(a, b));
		System.out.println(a + " / " + b + " = " + c1.div(a, b));
		System.out.println(a + " % " + b + " = " + c1.mod(a, b));
		
		//중학생용 계산기 실행
		MidComputing m1 = new MidComputing();
		m1.powerOn();
		
		a = 5;
		b = 3;
		
		System.out.println(a + " + " + b + " = " + m1.sum(a, b));
		System.out.println(a + " - " + b + " = " + m1.sub(a, b));
		System.out.println(a + " * " + b + " = " + m1.mul(a, b));
		System.out.println(a + " / " + b + " = " + m1.div(a, b));
		System.out.println(a + " % " + b + " = " + m1.mod(a, b));
		
		m1.powerOff();
		
		
	}

}
