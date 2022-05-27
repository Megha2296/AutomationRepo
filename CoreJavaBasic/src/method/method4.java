package method;

public class method4 {
	public static void main(String[] args) {
    System.out.println("result of addition1:"+getadditionresult(250.36,45));
	System.out.println("***********************");
	System.out.println("result of addition2:"+method4.getadditionresult(250.36,45));
	System.out.println("***********************");

	double sum=getadditionresult(25,30);
	System.out.println("sum of two numbers:" +sum);
	double finalresult =sum*100;
	System.out.println("result after some operation:"+finalresult);
	
	}
	
	static double getadditionresult(double num1,double num2) {
		System.out.println("Num1:" +num1);
		System.out.println("Num2:" +num2);
		double res=num1+num2;
	
		return res;
	}
}


