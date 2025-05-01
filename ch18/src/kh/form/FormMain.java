package kh.form;

public class FormMain {

	public static void main(String[] args) {
		//학생성적프로그램 테이블
		System.out.printf("%-10s No.%-5s %-5s, %-5s, %-5s, %-5s %-6.2s\n","이름","번호","국어","영어","수학","총점","평균");
		for( int i = 0; i < 7 ; i++ ) {
			System.out.printf("%-10s No.%-5d %-5d, %-5d, %-5d, %-5d %-6.2f\n","윤수현","1","30","20","40","50","100.00");
		}
		   //학생성적프로그램 테이블
	    System.out.printf("%-10s %-5s %-5s %-5s %-5s %-5s %-6s\n","name","age","kor","eng","math","total","avg");
	    for(int i=0;i<5;i++) {
	        System.out.printf("%-10s %-5d %-5d %-5d %-5d %-5d %-6.2f\n","홍길동",10, 100,90,80,200,78.45);
	    }

	    System.out.println("The end");
	}
}