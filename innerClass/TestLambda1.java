package innerClass;

interface PrintString1 {
	void showString(String str);
}

public class TestLambda1 {

	public static void main(String[] args) {
		PrintString1 lamstr = s -> System.out.println(s);
		lamstr.showString("hello!");
		showString(lamstr);
	}
	
	public static void showString(PrintString1 p) {
		p.showString("hi!!");
	}

}
