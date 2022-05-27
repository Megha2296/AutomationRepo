package inharitance;

class abc {
	int name=50;
	double surname=100.00;

	abc(int a){
		int name=150;
		System.out.println("i am abc");
		System.out.println(name);
		System.out.println(this.surname);
	}
	

void callme() {
	System.out.println("1st method no parameter");
	System.out.println(name);
	System.out.println(surname);
		
}
void callme(int a) {
	System.out.println("1st method with parameter");
	System.out.println(name);
	System.out.println(surname);
	
	
}
}
class bcd extends abc{
	int name=40;
	double surname=200.00;
	
    bcd(int a){
    	super(10);
    	a=10;
    	System.out.println("1st constructor");
    	   			
	}
	
   void callme() {
	super.callme();
	System.out.println("2st method no parameter");
	
	System.out.println("current class name:- " + name);
	System.out.println("current class surname:- " + surname);
	
	System.out.println("parent class name:- " + super.name);
	System.out.println("parent class surname:- " + super.surname);
	
	
}
  void callme(double b) {
	super.callme(10);
	System.out.println(this.name);
	System.out.println(super.surname);
	

}
}
	
class xyz extends bcd {
	int name=30;
	double surname=300.00;
	 xyz(int a){
		 super(10);
		 System.out.println("3rd method no parameter");
		
			System.out.println("current class name:- " + name);
			System.out.println("current class surname:- " + surname);
			
		}
		
	void callme() {
		super.callme();
		
	}
	void callme(int a) {
		super.callme(22);
		
	}
		
}

public class inharitance2 {

	public static void main(String[] args) {
		bcd ref=new bcd(22);
		
		ref.callme();
		ref.callme(33);
		System.out.println("----------------------1-------------------------------");
		
      abc ref1=new abc(22);
		
		ref1.callme();
		ref1.callme(33);
		System.out.println("-----------------------2------------------------------");
		
     bcd ref2=new xyz(22);
		
		ref2.callme();
		ref2.callme(33);
		System.out.println("------------------------3-----------------------------");
	}

}

		

		

		
		
	


