package first.ArrayPractice;

public class ArrayPracticeCopy {

	public static void main(String[] args) {
		ArrayPracticeBook[] bookArray1 = new ArrayPracticeBook[3];
		ArrayPracticeBook[] bookArray2 = new ArrayPracticeBook[3];
		
		bookArray1[0] = new ArrayPracticeBook("hi", "hello");
		bookArray1[1] = new ArrayPracticeBook("�ȳ�", "�ȳ��ϼ���");
		bookArray1[2] = new ArrayPracticeBook("�߰�", "�߰���");
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for(int i = 0; i < bookArray1.length; i++) {
			bookArray2[i].showBookInfo();
		}
		System.out.println("========");
		// ���� ����
		bookArray1[0].setBookName("���Ƕ� �����ΰ�");
		bookArray1[0].setAuthor("����");
		
		for(int i = 0; i < bookArray1.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
		
		

	}

}
