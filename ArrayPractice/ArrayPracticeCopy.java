package first.ArrayPractice;

public class ArrayPracticeCopy {

	public static void main(String[] args) {
		ArrayPracticeBook[] bookArray1 = new ArrayPracticeBook[3];
		ArrayPracticeBook[] bookArray2 = new ArrayPracticeBook[3];
		
		bookArray1[0] = new ArrayPracticeBook("hi", "hello");
		bookArray1[1] = new ArrayPracticeBook("안녕", "안녕하세요");
		bookArray1[2] = new ArrayPracticeBook("잘가", "잘가라");
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for(int i = 0; i < bookArray1.length; i++) {
			bookArray2[i].showBookInfo();
		}
		System.out.println("========");
		// 얕은 복사
		bookArray1[0].setBookName("정의란 무엇인가");
		bookArray1[0].setAuthor("몰라");
		
		for(int i = 0; i < bookArray1.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
		
		

	}

}
