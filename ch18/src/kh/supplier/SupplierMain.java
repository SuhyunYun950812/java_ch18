package kh.supplier;

import java.util.Scanner;
import java.util.function.Supplier;

public class SupplierMain {

	public static void main(String[] args) {
		//함수형 인터페이스(추상메서드 1개) -> 구현클래스(오버라이딩) -> 부모 = 자식구현객체 -> 부모.추상메서드
		//Supplier<T> (T get() : 추상메소드) -> 구현클래스 (x) -> 부모 = 자식구현객체 -> 부모.추상메서드(람다식표현)

		Supplier<String> sup = () -> {
			Scanner sc = new Scanner(System.in);
			System.out.print("이름 입력 :");
			
			String input = sc.nextLine();
			return String.format("%s님 안녕하세요.",input);
		};
		String value = sup.get();
		System.out.println(value);
		System.out.println("The End");
	}

}
