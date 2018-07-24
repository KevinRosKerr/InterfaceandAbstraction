
public class main {

	public static void main(String[] args) {
		Manga mangaBook = new Manga("Food Wars", "A Japanese Man", "Drama", 350, "Some Artist");
		displayobject(mangaBook);
		Novels novelBook = new Novels("Harry Potter", "JK", "Magic", 400);
		displayobject(novelBook);
	}
	
	
	private static void displayobject(Manga book){
		System.out.println("Name: " + book.getName());
		System.out.println("Author: " + book.getAuthor());
		System.out.println("Genre: " + book.getGenre());
		System.out.println("Number of Pages: " + book.getPages());
		System.out.println("Illustrator: " + book.getIllustrator());
		System.out.println("");
	}
	
	private static void displayobject(Novels book){
		System.out.println("Name: " + book.getName());
		System.out.println("Author: " + book.getAuthor());
		System.out.println("Genre: " + book.getGenre());
		System.out.println("Number of Page: " + book.getPages());
		System.out.println("");
	}

}