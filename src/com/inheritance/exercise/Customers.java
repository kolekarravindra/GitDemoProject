package com.inheritance.exercise;

public class Customers {

	private int id;
	private String name;
	private String surnmae;
	private String geneder;
	private boolean isLicensed;
	
	
	
	
	public Customers(int id, String name, String surnmae, String geneder, boolean isLicensed) {
		super();
		this.id = id;
		this.name = name;
		this.surnmae = surnmae;
		this.geneder = geneder;
		this.isLicensed = isLicensed;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurnmae() {
		return surnmae;
	}
	public void setSurnmae(String surnmae) {
		this.surnmae = surnmae;
	}
	public String getGeneder() {
		return geneder;
	}
	public void setGeneder(String geneder) {
		this.geneder = geneder;
	}
	public boolean isLicensed() {
		return isLicensed;
	}
	public void setLicensed(boolean isLicensed) {
		this.isLicensed = isLicensed;
	}
	


	
	
}
