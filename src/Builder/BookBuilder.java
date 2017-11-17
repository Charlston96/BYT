package Builder;

public class BookBuilder extends Builder<Book>{
	
	private String title;
	private String author;
	
	

	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	@Override
	Book getResult() {
		if(title != null && author != null){
		 return new Book(title, author);
		} else {
			return null;
		}
	}

}
