package com.kh.inheritance.ex;

public class PhoneCheck {

	public static void main(String[] args) {

		//스마트폰 중 아이폰을 확인
		//SmartPhone p1 = new IPhone(); 이렇게하면 p1.setIOS();안됨
		IPhone p1 = new IPhone();
		
		p1.setDisplay("레티나 디스플레이");
		System.out.println("p1.display : " + p1.getDisplay());
		
		//스마트폰 그릇에 아이폰을 가지고오면
		//부모의 기능은 가져올 수 있지만 자식의 기능은 가져올 수 없음
		
		p1.setTelecom("KH");
		System.out.println("p1.telecom : " + p1.getTelecom());
		
		p1.setPower("최신");
		System.out.println("p1.power : " + p1.getPower());
		p1.setIOS(1);

		
		//부모의 기능을 상속받은 자식을 호출하면
		//모두사용가능
		
		IPhone p2 = new IPhone();
		p2.setDisplay("사과");
		p2.setTelecom("KH");
		p2.setPower("초고속");
		p2.setIOS(1);
		System.out.println(p2.toString());
		
		Galaxy p3 = new Galaxy();
		p3.setDisplay("안드로이드");
		p3.setTelecom("KH");
		p3.setPower("LTE");
		p3.setAndroid(2);
		System.out.println(p3.toString());
		
		//
		SmartPhone g1 = new Galaxy();
		g1.setDisplay("아몰레드");
		g1.setTelecom("KH");
		g1.setPower("최신초고속");
		
		//무조건 갤럭시에 있는 g1.android 써야겠다-
		//다운캐스팅
		//강제 형변환 진행해주기
		Galaxy g2 = (Galaxy) g1;
		g2.setAndroid(4); // g1을 g2에 담아서 사용가능
		
		
		
	}

}
