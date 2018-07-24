
public class Novels extends Books {

	public Novels(String name,String author,String genre, int pages) {
		// TODO Auto-generated constructor stub
		super(name,author,genre,pages,"Novel");
	}
	
	@Override
	public void rentobject() {
		// TODO Auto-generated method stub
		System.out.println("");
	}

	@Override
	public void returnobject() {
		// TODO Auto-generated method stub
	}
}
