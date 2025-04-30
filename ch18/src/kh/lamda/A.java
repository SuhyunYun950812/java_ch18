package kh.lamda;

public interface A {
	// 입력,리턴이 없다.
	public abstract void method();
}

interface D {
	// 입력 있고, 리턴 있다.
	public abstract double methodD(int a, double b);
}

interface B {
	// public abstract는 본래 interface에서 생략된다.
	// 입력 있고, 리턴 있다.
	int methodB(String a);

}

interface C {
	// 입력 있고, 리턴 없다.
	void methodC(int a);
}