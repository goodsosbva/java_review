package first.ArrayPractice;

public class ArrayPractice2 {

	public static void main(String[] args) {
		double[] data = new double[5];
		
		for(int i = 0; i < data.length; i++) {
			data[i] = i * 10;
		}
		
		for(int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}

}
