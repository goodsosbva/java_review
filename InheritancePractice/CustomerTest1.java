package first.InheritancePractice;

public class CustomerTest1 {

	public static void main(String[] args) {
		  VIPCustomer customerKim = new VIPCustomer();  // 하위 클래스 생성
		  customerKim.setCustomerID(10020);
		  customerKim.setCustomerName("권현성");
		  customerKim.bonusPoint = 10000;
		  System.out.println(customerKim.showCustomerInfo());

	}

}
