package Builder;

import java.util.Date;

public class Author {
	
	private String name;
	private Date birthDate;
	
	public Author(String name, Date birthDate){
		if(name == null || birthDate == null){
			throw new NullPointerException();
		}
		this.name = name;
		this.birthDate = birthDate;
	}
	
	private String getName(){
		return name;
	}
	
	private Date getBirthDate(){
		return birthDate;
	}

}
