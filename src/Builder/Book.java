package Builder;

public class Book {
	
	private String title;
	private String author;
	
	public Book(String title, String author){
		if(title == null || author == null){
			throw new NullPointerException();
		}
		this.title = title;
		this.author = author;
	}
	
	private String getTitle(){
		return title;
	}
	
	private String getAuthor(){
		return author;
	}
	
}
