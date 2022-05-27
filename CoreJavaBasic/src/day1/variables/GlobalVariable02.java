package day1.variables;
public class GlobalVariable02 {
	static int empId=123; //static global class variable
public static void main(String[] args) {
		int empId=100,age=30; //local variable
		System.out.println("local variable ,EmpId:"+empId);//100
		System.out.println("local variable,age:"+age);//30
		System.out.println("standard way to access SGV,EmpId:"+GlobalVariable02.empId);
		//123
		
		// TODO Auto-generated method stub
		

	}

}

