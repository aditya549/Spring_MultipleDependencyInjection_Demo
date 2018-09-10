package com.java.SpringDemo;

public class Car {
	private String[] carnames;
	private Engine[] engines;
	
	public String[] getCarnames() {
		return carnames;
	}
	public void setCarnames(String[] carnames) {
		this.carnames = carnames;
	}
	public Engine[] getEngines() {
		return engines;
	}
	public void setEngines(Engine[] engines) {
		this.engines = engines;
	}
	public void printcarnames() {
		for(String s:carnames) {
			System.out.println("Car Name is:"+s);	
		}
	}
	public void printenginenames() {
		for(Engine e:engines) {
			System.out.println("Engine ModelYear:"+e.getModelYear());	
		}
	}
	
	
}
