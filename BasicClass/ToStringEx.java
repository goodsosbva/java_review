package basicClass;

class Book{
	
	int bookNumber;
	String bookTitle;

	Book(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	// 재정의
	@Override
	public String toString() {
		
		return bookTitle + ", " + bookNumber;
	}
	
}

public class ToStringEx {
	
	public static void main(String[] args) {

		Book book1 = new Book(200, "개미");
		Book name1 = new Book(201714179, "권현성");
		
		System.out.println(book1);
		System.out.println(book1.toString());
		
		System.out.println(name1);
		System.out.println(name1.toString());
		}
	
	

}
