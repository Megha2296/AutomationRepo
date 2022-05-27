package method;

public class method8 {

	public static void main(String[] args) {
		System.out.println("Program Starts...");
		
		method8 m1 = new method8();
		m1.display();
		m1.display('H', 45.00, 12);
		meghagharate(30,33.33);
	}
	// TODO Auto-generated method stub

	void display() {
		char grade = 'M';
		double weight = 30;
		int age = 17;
		System.out.println("grade:" + grade);
		System.out.println("weight :" + weight);
		System.out.println("age:" + age);

	}

	void display(char grade, double weight, int age) {
		System.out.println("grade:" + grade);
		System.out.println("weight :" + weight);
		System.out.println("age:" + age);

	}

	 static void meghagharate(int age, double weight) {
		System.out.println("weight :" + weight);
		System.out.println("age:" + age);

	}
}
