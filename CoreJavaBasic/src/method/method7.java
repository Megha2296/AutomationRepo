package method;

public class method7 {

	public static void main(String[] args) {
		System.out.println("program start");
		method7 m1 = new method7();
		m1.additionoftwonumbers(25, 45);

		int res = m1.getadditionoftwonumbers(25, 45);
		System.out.println("result:" + res);
		double total = res * 100 - 58;
		System.out.println("total sum:" + total);
		System.out.println("sum:" + m1.getadditionoftwonumbers(25, 45));
		System.out.println("program ends....");
	}

	public void additionoftwonumbers(int p, int t) // int p=25; int t=45;
	{
		int rt = p + t;
		System.out.println("addition result is:" + rt);
	}

	public int getadditionoftwonumbers(int p, int t) {
		int wq = p + t;
		return wq;

		// TODO Auto-generated method stub

	}

}
