package day1.variables;

public class GlobalVariable05 {
	static int empId=123;

	public static void main(String[] args) {
		int age=30,empId=800;
		System.out.println("local variable,age:"+age);
		age=45;
		System.out.println("Updated,local variable,age:"+age);
		System.out.println("local variable,empId:"+empId);
		System.out.println("standard way to access SGV,empId:"+GlobalVariable05.empId);
		empId=456;
		System.out.println("Updated,local variable,empId:"+empId);
		GlobalVariable05.empId=987;
		System.out.println("Updated,standard way to access SGV,empId:"+GlobalVariable05.empId);
		
		// TODO Auto-generated method stub

	}

}
