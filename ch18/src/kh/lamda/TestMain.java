package kh.lamda;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		// 람다식 없이 구현
		// 구현객체를 생성한다.
		TestChild tc = new TestChild();

		// 부자관계
		Test test = tc;
		// 다형성을 구현.
		int kor = test.methodTest("국어");
		System.out.printf("국어 점수 = %d점\n", kor);
		
		System.out.println("==================");
		// 람다식 구현
		Test testLamda = a -> {
			Scanner scan = new Scanner(System.in);
			System.out.printf("%s 점수요청 : ", a);
			int value = Integer.parseInt(scan.nextLine());
			return value;
		};
		int eng = testLamda.methodTest("영어");
		System.out.printf("영어 점수 = %d점\n", eng);
		
		System.out.println("The End");

	}
}
