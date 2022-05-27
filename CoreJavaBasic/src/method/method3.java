package method;

public class method3 {

	public static void printdetails(int age, int salary) {    //int age=25; int salary=56000;
		System.out.println("Hi, good morning");
		System.out.println("Age"+age);
		
		System.out.println("my salary is"+salary);
		System.out.println("Hi, good night");
		//return; //optional bcz if you dont write it dn java complier will write it
	}
	public static void main(String[] args) {
		System.out.println("****************1*****************");
		printdetails(30,96000);
		System.out.println("****************2*****************");
		method3.printdetails(25,56000);
		System.out.println("****************3*****************");
		printdetails(26,45000);	
		System.out.println("****************4*****************");
		printdetails(24,25000);
		System.out.println("****************5*****************");
		printdetails(29,75000);
		System.out.println("****************6*****************");
		method3.printdetails(28,65000);	
		System.out.println("****************7*****************");
		printdetails(32,85000);
		System.out.println("****************8*****************");
		printdetails(31,35000);
		System.out.println("****************9*****************");
		method3.printdetails(36,55000);	
		System.out.println("****************10*****************");
		printdetails(32,45200);
		
		// TODO Auto-generated method stub

	}

}
