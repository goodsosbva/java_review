package first.InheritancePractice;

public class CustomerTest1 {

	public static void main(String[] args) {
		  VIPCustomer customerKim = new VIPCustomer();  // ���� Ŭ���� ����
		  customerKim.setCustomerID(10020);
		  customerKim.setCustomerName("������");
		  customerKim.bonusPoint = 10000;
		  System.out.println(customerKim.showCustomerInfo());

	}

}
