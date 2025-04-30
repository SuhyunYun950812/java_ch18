package kh.lamda;

import java.util.Scanner;

public class LamdaMain {

	public static void main(String[] args) {
		//임시객체 부 = new 자식()
		//입력,리턴이 없다 => 람다식
		A a = ()-> System.out.println("입력없고,리턴이 없다");
		// 부모 추상메소드를 불러주면 -> 자식의 오버라이딩 함수가 작동이 된다.
		a.method();
		// 자식 임시객체 부모의 추상메소드를 오버라이딩했다.

		System.out.println("The End");
		
		D d = (c,b)->c+b;
		double value = d.methodD(10, 20.0);
		System.out.printf("d.methodD(10,20.0)=%.2f\n",value);
		
		B e = (name)->{
				Scanner scan = new Scanner(System.in);
				System.out.printf("당신의 %s 입력:",name);
				int value1 = Integer.parseInt(scan.next());
				return value1;
		};
		int value1 = e.methodB("국어");
		System.out.printf("니 점수는 %d점 이다.\n",value1);
		int value2 = e.methodB("영어");
		System.out.printf("니 점수는 %d점 이다.\n",value2);
	}
}