package wtn_tm01;

public class Main {
	public static void main(String args[]) {
		ConnectionService cs=new ConnectionService();
		System.out.println(cs.generateBill(250, 130,"Commercial"));
		System.out.println(cs.generateBill(-250,0,"Commercial"));
		System.out.println(cs.generateBill(250, 130,"Domestic"));
		System.out.println(cs.generateBill(250, 130,"Domestic"));	
	}
}

