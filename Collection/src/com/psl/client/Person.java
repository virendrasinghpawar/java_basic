package com.psl.client;
import java.sql.Date;
public  class Person implements Comparable<Person>{
	
	private String FirstName,LastName;
	private Date dateOfBirth;
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((FirstName == null) ? 0 : FirstName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (this.FirstName == null) {
			if (other.FirstName != null)
				return false;
		} else if (!FirstName.equals(other.FirstName))
			return false;
		return true;
	}
	public Person(String firstName, String lastName, Date dateOfBirth) {
		super();
		FirstName = firstName;
		LastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public int compareTo(Person rhs) {
		return this.getFirstName().compareTo(rhs.getFirstName());
		
	}

	
	

}
