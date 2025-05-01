package kh.Predicate;

import java.util.function.Predicate;

public class PridicateMain {

	public static void main(String[] args) {
		//predicate<T> => boolean test (T t) : 추상메소드
		Predicate<String> pre = t -> {
				boolean flag = false;
				try {
					Integer.parseInt(t);
					flag = true;
				}catch(NumberFormatException e) {
					flag = false;
				}catch(Exception e) {
					flag = false;
				}
				return flag;
		};
		boolean flag = pre.test("255");
		System.out.printf("%s\n",(flag == true)?("숫자로 변환됩니다."):("숫자로 변환 안됩니다."));
		System.out.println("The End");
	}

}
