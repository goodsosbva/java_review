package innerClass;

interface PrintString{
	void showString(String str);
}

public class TestLambda {
	public static void main(String[] args) {
		PrintString lambdaPrint = str->System.out.println(str);		  //lamdaPrint�� ����ó�� �̿�
		lambdaPrint.showString("test");
		
		showMyString(lambdaPrint);
		
		PrintString reStr = returnPrint();
		reStr.showString("kwon");
	}
	
	public static void showMyString(PrintString lambda) {
		lambda.showString("test2");
	}
	public static PrintString returnPrint() {
		return s->System.out.println(s + " world");
	}

}
