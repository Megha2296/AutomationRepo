package Abstract;

abstract class gharate {

	abstract void print(); // abstract method/incomplete method

	void display() {//normal or non-abstract or concrete method or complete method
		System.out.println("i am non-abstract method display1()");
	}
}

abstract class gharate1 {
	void display() {
		System.out.println("i am non-abstract method display2()");
	}

	void display2() {
		System.out.println("i am non-abstract method display3()");
	}
}

abstract class gharate2 {
	abstract void print();

	abstract void print1();

	abstract void print2();
}

public class abstract01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
