package inharitance;

class maggi {

	int empid = 123;
	double age = 26.00;

	maggi(int a) { //a=22

		int empid = 15;
        int age = 23;
		
		System.out.println("i am 1st constructor of maggi class");
		System.out.println(empid); // 123, 15
		System.out.println(age); //23
		System.out.println(this.age);//26.00   ,   this= global variable this.variable  this super=variable,method

	}

	void callme() {
		System.out.println("i am display method from maggi class with no parameter");
		System.out.println(age);// 26.00
		System.out.println(empid);//123

	}

	void callme(int a) {
		double age = 25.55;
		System.out.println("i am display method from maggi class with parameter");
		System.out.println(age);//25.55
		System.out.println(this.age);//26.00

	}
}

class monu extends maggi {
	int empid = 456;
	double age = 25.00;

	monu(int a) { //super(22) access for different class a=55
		super(22); //this(22)-same class values access
		a = 15;
		System.out.println("i am 1st constructor");
	}

	void callme() {
		super.callme();
		System.out.println("i am display method from monu class with no parameter");

		System.out.println("current class age:- " + age); //25.00
		System.out.println("current class empid:- " + empid);//456

		System.out.println("parent class age:- " + super.age);//26.00
		System.out.println("parent class empid:- " + super.empid);//123

	}

	void callme(double b) { //b=20

		super.callme(22); //super.keyword =
		 System.out.println("i am display method from monu class");

		 System.out.println(age);//25
		System.out.println(this.age);//25
		System.out.println(super.age);//26
	}

}

class vrush extends monu {
	int empid = 789;
	double age = 24.00; //9,10,11,12,14,15,18,20

	vrush(int a) {
		super(22);
		a = 15;
		System.out.println("i am 1st constructor of vrush class");
		System.out.println("current class age:- " + age);//24.00
		System.out.println("current class empid:- " + empid);//789

	}

	void callme(int a) {
		super.callme(55);
	}

	void callme() {
		super.callme();
	}

}

public class inharitance1 {

	public static void main(String[] args) {
		monu M1 = new monu(55);

		M1.callme(20);
		M1.callme();
		System.out.println("-----------------------------------------");

		maggi C1 = new maggi(55);
		C1.callme(22);
		C1.callme();
		System.out.println("-----------------------------------------");

		monu D1 = new vrush(45);
		D1.callme(22);
		D1.callme();
		System.out.println("-------------------------------------------");

		// TODO Auto-generated method stub

	}

}
