package method;

public class method5 {

	public static void main(String[] args) {
		/**
		 * res=(p*r*t)/100;
		 */
		System.out.println("get interest using getinterest():"+method5.getinterest(250000,6.5,60));
		System.out.println("get interest using getinterest1():"+method5.getinterest1(250000,6.5,60));
		method5.getinterest2(350000,5,36);
		System.out.println("***************************");
		double res=method5.getinterest(250000,6.5,60);
		System.out.println(res);
	}
	public static double getinterest(int p,double r, int t) { //p=250000,r=6.5,t=60
		return(p*r*t)/100;
	} 
	//or
	public static double getinterest1(int p,double r, int t) { //p=250000,r=6.5,t=60
		double res=(p*r*t)/100;
		return res;
	}
	//or
	public static void getinterest2(int p,double r, int t) { //p=350000,r=5,t=36
		double res=(p*r*t)/100;
	System.out.println("interest is:"+res);	
	
		
		// TODO Auto-generated method stub

	}

}
