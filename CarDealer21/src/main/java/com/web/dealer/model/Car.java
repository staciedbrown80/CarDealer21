package com.web.dealer.model;

public abstract class Car {
	protected String make;
	protected String model;
	protected String year;
	protected String mileage;
	protected String price;
	protected String vin;
	protected String acquisitionDate;
	protected String currentDate;
	protected String dateSold;

	
	public Car() {
		super();
	}

	public String getDateSold() {
		return dateSold;
	}

	public void setDateSold(String dateSold) {
		this.dateSold = dateSold;
	}

	public Car(String make, String model, String year, String mileage, String price, String vin, String acquisitionDate, String currentDate, String dateSold) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.mileage = mileage;
		this.price = price;
		this.vin = vin;
		this.acquisitionDate = acquisitionDate;
		this.currentDate = currentDate;
		this.dateSold = dateSold;
	}
	public String getCurrentDate() {
		return currentDate;
	}

	public void setCurrentDate(String currentDate) {
		this.currentDate = currentDate;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getAcquisitionDate() {
		return acquisitionDate;
	}

	public void setAcquisitionDate(String acquisitionDate) {
		this.acquisitionDate = acquisitionDate;
	}

	public String toString() {
		return (make + " "  + model + " " + year +" " +mileage +" " +price);
	}	
	
	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMileage() {
		return mileage;
	}

	public void setMileage(String mileage) {
		this.mileage = mileage;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	

	//public abstract void drive();

	//public abstract void brake();

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMake() {
		return this.make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	//protected abstract Object getVIN();

	public void getCar() {
		// TODO Auto-generated method stub
		
	}

	public void printCar() {
		// TODO Auto-generated method stub
		
	}

	/*protected abstract void printCar(); */
}
