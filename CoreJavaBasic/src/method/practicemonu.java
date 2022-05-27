package method;


public class practicemonu {  
	
static void vrush(char grade,int height) {
	System.out.println("grade" +grade);
	System.out.println("height" +height);
	}
 void monu(int age,double weight) {
	System.out.println("age" +age);	
	System.out.println("weight" +weight);	
	}
	
	void megha() {
		int age=28;
		System.out.println("age" +age);	
		
		
	}
	
	public static void main(String[] args) {
		System.out.println("program start");
		practicemonu.vrush('A',155); //vrush('A',155); System.out.println("program +"vrush('A',155));
		practicemonu M1=new practicemonu();
		M1.megha();
		M1. monu(26,60);

	}

}
