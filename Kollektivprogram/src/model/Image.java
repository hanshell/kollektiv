package model;

import java.sql.Blob;

public class Image {
	Blob blob;
	Person person;
	
	public Image(Blob blob, Person person){
		this.blob=blob;
		this.person=person;
	}
	public Blob getBlob(){
		return this.blob;
	}
	public void setBlob(Blob blob){
		this.blob=blob;
	}
	public Person getPerson(){
		return this.person;
	}
	public void setPerson(Person person){
		this.person=person;
	}
}
