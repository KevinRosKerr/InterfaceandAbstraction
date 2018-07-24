
public abstract class Books implements Renting {

		String name;
		String author;
		int pages;
		String genre;
		String bookType;
		
		public Books(String name, String author,String Genre, int pages, String booktype) {
		this.name = name;
		this.author = author;
		this.genre = Genre;
		this.pages = pages;
		this.bookType = booktype;
		}
		
		
}
