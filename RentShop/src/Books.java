
public abstract class Books implements Renting {

		private String name;
		private String author;
		private int pages;
		private String genre;
		private String bookType;
		
		protected Books(String name, String author,String Genre, int pages, String booktype) {
		this.name = name;
		this.author = author;
		this.genre = Genre;
		this.pages = pages;
		this.bookType = booktype;
		}
		
		protected String getName() {
			return name;
		}
		
		protected String getAuthor() {
			return author;
		}
		
		protected int getPages() {
			return pages;
		}
		
		protected String getGenre() {
			return genre;
		}
		
		protected String getBookType() {
			return bookType;
		}
		
}
