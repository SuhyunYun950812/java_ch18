package kh.consumer;

import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class ComsumerMain {

	public static void main(String[] args) {
		// 인터페이스  	사용시 인터페이스 -> 구현 클래스 -> 구현 객체 -> 부자 관계 -> 부모.추상메소드
		// Consumer 사용시 인터페이스(필요x) -> 구현 클래스(필요x) -> 구현 객체(부자 관계) -> 부모.추상메소드
		
		Consumer<String> con = t -> System.out.printf("%s님 환영합니다.\n", t);
		
		con.accept("홍길똥스");
		con.accept("구길똥스");
		con.accept("저길똥스");
		
		// 입력값 ㅇ(num를 입력.) 출력ㅇ (num을 토대로 x 9까지해서 출력한다.)
		// 내가한거(망함)
		//Scanner scan = new Scanner(System.in);
		//Consumer<Integer> nineninedan = t-> {
		//	for(int x = 1 ; x < 10; x++) {
		//			System.out.printf("%d X %d = %d\n",t,x, t*x);
		//		}
		//};
		//nineninedan.accept(Integer.parseInt(scan.nextLine()));
		
		//선생님꺼 카피
		Consumer<Integer> tc = t -> {
				System.out.printf("d단 출력\n",t);
				for(int i = 0 ; i < 9; i++) {
					System.out.printf("%d x %d = %d\n",t,i+1 ,t*(i+1));
				}
		};
		tc.accept(5);
		// IntConsumer 사용. <>(제네릭을 기입안한다. 어짜피 무조건 Int니까)
		IntConsumer icon = t -> {
			System.out.printf("d단 출력\n",t);
					for(int i = 0 ; i < 9; i++) {
						System.out.printf("%d x %d = %d\n",t,i+1 ,t*(i+1));
					}
		};
		icon.accept(7);
		//BiConsumer 사용.
		BiConsumer<String,Integer> bicon = (name, age)->System.out.printf("%s님의 나이는 %d세 입니다.\n",name,age);

		bicon.accept("개똥이", 88);
		System.out.println("The End");
	}
}
