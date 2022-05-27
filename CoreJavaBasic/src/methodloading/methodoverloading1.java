package methodloading;

public class methodoverloading1 {

	public static void main(String[] args) {

		methodoverloading1 m1 = new methodoverloading1();
		m1.display();
		m1.display('B', 29, 55000);
		m1.display('A', 32, 45000);
		m1.display('C', 23, 25000);
		m1.display(29, 'A', 25000);
		m1.getNumber();
	}

	int getNumber() {
		return 25;
	}

	void display() {

		char grade = 'A';
		int age = 30;
		double salary = 45000;
		System.out.println("Grade is: " + grade);
		System.out.println("Age is: " + age);
		System.out.println("Salary is: " + salary);

	}

	void display(char grade, int age, int salary) {

		System.out.println("Grade is: " + grade);
		System.out.println("Age is: " + age);
		System.out.println("Salary is: " + salary);

	}

	void display(int age, char grade, int salary) {

		System.out.println("Age-Grade-Salary is: " + age + "-" + grade + "-" + salary);

	}

	void display(int age) {

		System.out.println("Age is: " + age);

	}

	void display(char grade) {

		System.out.println("Grade is: " + grade);

	}

}
