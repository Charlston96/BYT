package Builder;

import java.util.Date;

public class AuthorBuilder extends Builder<Author>{
	
	private String name;
	private Date birthDate;
	
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Date getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}


	@Override
	Author getResult() {
		if(name != null && birthDate != null){
		 return new Author(name, birthDate);
		} else {
			return null;
		}
	}

}
