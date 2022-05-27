package day1.variables;

public class GlobalVaiable04 {
static int empId=123;
	public static void main(String[] args) {
		int age=30;
		System.out.println("local variable,age:"+age);
		System.out.println("Direct way to access SGV,empId:"+empId);
		System.out.println("standard way to access SGV,empId:"+GlobalVaiable04.empId);
		
		// TODO Auto-generated method stub

	}

}
