package Serializ;

import java.io.Serializable;


public class car implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = -2510467307774682677L;

//	date member or instance variable
	private String make ,model , color;
	//private Engine engine;
	
public car(){
	
	
	make=model=color=" ";
}







public car(String make, String model, String color) {
	
	this.make = make;
	this.model = model;
	this.color = color;
}
@Override
public String toString(){
	return String.format("%s---%s---%s", getMake(),getModel(),getColor());
}

//	member method
//	function 
//	instance method
//	accessor
	
	
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}
