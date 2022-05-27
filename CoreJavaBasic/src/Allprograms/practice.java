package Allprograms;

public class practice {
	static int rollnumberno = 123;
	double salary = 22000;
	char grade = 'A';

	public static void main(String[] args) {
		practice ref = new practice();

		ref.getresult(25);
		System.out.println("getresult1:" + rollnumberno);

		ref.getresult(30, 260.00);

		ref.getresult(20, 230.05, 'B');

		practice.getresult(32.00);

		// modifier return value name of method args()
		// if the method name are same java compiler get confused

	}

	static void getresult(double m) {
		System.out.println("getresult1:" + m);

	}

	void getresult(int i) {
		System.out.println("getresult2:" + i);

		System.out.println("getresult2:" + salary);
	}

	void getresult(int i, double j) {
		System.out.println("getresult3:" + i);
		System.out.println("getresult4:" + j);

	}

	void getresult(int i, double j, char A) {
		System.out.println("getresult5:" + i);
		System.out.println("getresult6:" + j);
		System.out.println("getresult7:" + A);
	}

}