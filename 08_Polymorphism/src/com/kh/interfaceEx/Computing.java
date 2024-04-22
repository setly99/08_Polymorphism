package com.kh.interfaceEx;

public interface Computing {//calculator
//필드 public static final
	//final의 경우 변하지 않는 상수이기 때문에 영어로 모두 대문자로 작성해줌
	double PI = 3.14;
	int MIN = -100_000_000;
	int MAX = 100_000_000;
//메서드 합 차 곱 나눗셈 나머지를 사용해달라고 작성만 해주고 계산식은 없음
	//미완성됐지만 다른 곳에서 계산기를 불러올 때 필수로 불러와서 완성해줘야 하는 메서드 작성
	
	//전달받은 두 정수의 합
	public abstract int sum(int a, int b);
	//차
	public abstract int sub(int a, int b);
	//곱
	public abstract int mul(int a, int b);
	//나누기
	public abstract double div(int a, int b);
	//나누기 나머지
	public abstract int mod(int a, int b);

}
