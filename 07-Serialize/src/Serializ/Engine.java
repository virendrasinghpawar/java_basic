package Serializ;

import java.io.Serializable;

public  class Engine {
	private int cubicCapacity;
	private double horsepower;
	public FuelType fueltype;
	
	public Engine(int cubicCapacity, double horsepower, FuelType fueltype) {
		super();
		this.cubicCapacity = cubicCapacity;
		this.horsepower = horsepower;
		this.fueltype = fueltype;
	}
	
	
	
	public int getCubicCapacity() {
		return cubicCapacity;
	}
	public void setCubicCapacity(int cubicCapacity) {
		this.cubicCapacity = cubicCapacity;
	}
	public double getHorsepower() {
		return horsepower;
	}
	public void setHorsepower(double horsepower) {
		this.horsepower = horsepower;
	}
	public FuelType getFueltype() {
		return fueltype;
	}
	public void setFueltype(FuelType fueltype) {
		this.fueltype = fueltype;
	}

}
