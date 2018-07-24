public class Manga extends Books {

	String illustrator;
	public Manga(String name,String author,String genre, int pages,String illustrator) {
		super(name,author,genre,pages,"Manga");
		this.illustrator = illustrator;
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
	
	
	protected String getIllustrator() {
		return illustrator;
	}

}
