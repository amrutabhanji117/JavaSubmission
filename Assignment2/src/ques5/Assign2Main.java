package ques5;

public class Assign2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Commission(121, "amit",2.1, 200000);
		Invoice invoice=new Invoice("A123", "Electronic23W", 20, 3000);
		PaymentProcess.PaymentProcessSystem(e);

	}

}
