package innerClass;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {

	public static void main(String[] args) {
		TravelCustomer lee = new TravelCustomer("lee", 40, 100);
		TravelCustomer kwon = new TravelCustomer("kwon", 29, 999);
		TravelCustomer son = new TravelCustomer("son", 30, 777);
		
		List<TravelCustomer> customerList = new ArrayList<>();
		
		customerList.add(lee);
		customerList.add(kwon);
		customerList.add(son);
		
		System.out.println("==고객 명단 추가된 순서대로 출력==");
		customerList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
		
		int total = customerList.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println("가치의 총 합은 " + total + " 임!");
		
		System.out.println("==30세 이상 출력==");
		customerList.stream().filter(c -> c.getAge() >= 30).map(c -> c.getName()).sorted().forEach(s -> System.out.println(s));
		
	}

}
