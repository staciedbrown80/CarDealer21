
package com.web.dealer.model;

import org.apache.tomcat.jni.Address;

public abstract class Transactions extends Car{

	Car[] entry = new Car[0];
	
	
	public Transactions(Car[] entry) {
		// TODO Auto-generated constructor stub
	}
//////////////////////////////////////////////////////////////////////-WORKS
	public Transactions(Car tempSearchFName) {
		// TODO Auto-generated constructor stub
	}

	//Add a new Car or entry
	public void addCar(Car newCar) {
		Car[] temp = new Car[entry.length + 1];
		for(int i=0; i< entry.length; i++) {
			temp[i]=entry[i];
		}
	temp[temp.length-1]=newCar;
	entry=temp;
	System.out.println(temp);
	}
	///////////////////////////////////////////////////////////////////
	//Delete a new Car or entry
	//Search Car/entry by the Make then by the Model
			@SuppressWarnings("unused")
			public Car [] searchByMake(String make) {
				Car[] temp = new Car[0];
				for(int i=0; i<entry.length; i++) {
					Car c= entry[i];
					if(c.getMake().equals(make)) {
						temp=expandArray(temp,c);
						for(int j=0; j<entry.length; j++) {
							Car c2= entry[j];
							if(c2.getModel().equals(model)) {
								temp=expandArray(temp,c2);
							}
							return temp;
						}
					}
					return temp;
				}
				return temp;
			}

	/////////////////////////////////////////////////////////////////////////NEW!!! 12/31/2020
			@SuppressWarnings("unused")
			public Car [] searchByVin(String vin) {
				Car[] temp = new Car[0];
				for(int i=0; i<entry.length; i++) {
					Car c= entry[i];
					if(c.getVin().equals(vin)) {
						temp=expandArray(temp,c);
						for(int j=0; j<entry.length; j++) {
							Car c2= entry[j];
							if(c2.getModel().equals(model)) {
								temp=expandArray(temp,c2);
							}
							return temp;
						}
					}
					return temp;
				}
				return temp;
			}

	
	//Search Car/entry by the Acquisition Date & print
			public Car [] searchByAcquisitionDate(String acquisitionDate) {
		Car[] temp = new Car[0];
		for(int i=0; i<entry.length; i++) {
			Car p= entry[i];
			if(p.getAcquisitionDate().equals(acquisitionDate)) {
				temp=expandArray(temp,p);
				System.out.println(entry);
				p.printCar();
				p.toString();
			}
		}
		return temp;
	}
	
	/*//Search Car/entry by the last name
		public Car [] searchByLastName(String lastName) {
			Car[] temp = new Car[0];
			for(int i=0; i<entry.length; i++) {
				Car p= entry[i];
				if(p.getLastName().equals(lastName)) {
					temp=expandArray(temp,p);
				}
			}
			return temp;
		} */
	
		/*public Address [] searchByCity(String city) {
			Address [] listing = new Address[0];
			for(int i=0; i<listing.length; i++) {
				Address a= listing[i];
				if(a.getCity().equals(city)) {
					listing=expandArrayA(listing,a);
				}
			}
			return listing;
		}	*/
			
	//When adding a new Car or entry, we need to expand the array size by "1"
	public Car[] expandArray(Car [] source, Car newCar) { 
		Car[] temp = new Car[source.length +1];
		for(int i=0; i<source.length; i++) {
			temp[i]=source[i];
		}
		temp[temp.length-1]=newCar;
		return temp;
	}
	
	//When deleting new Car or entry, we need decrease the array size by "1"
	public Car[] shrinkArray(Car [] source, Car newCar) { 
		Car[] temp = new Car[source.length];
		for(int i=0; i<source.length; i++) {
			temp[i]=source[i];
		}
		temp[temp.length-1]=newCar;
		return temp;
	}
	
	
	//When adding a new Address to array named "adrlist" we need to expand the array size by "1"
	public Address[] expandArrayA(Address [] adrlist, Address newAddress) {
		Address[] temp = new Address[adrlist.length +1];
		for(int i=0; i<adrlist.length; i++) {
			temp[i]=adrlist[i];
		}
		temp[temp.length-1]=newAddress;
		return temp;
	}
	
	
	//public Car[] getDirectory() {
		//return entry;
	//}
	
	public void printCars() {
		for(int i=0; i < entry.length; i++) {
			entry[i].getCar();
		}
	}
	
}