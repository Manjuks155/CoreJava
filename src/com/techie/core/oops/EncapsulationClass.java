package com.techie.core.oops;

public class EncapsulationClass {

	private int id;
	private String name;

	public EncapsulationClass(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public boolean validateId() {
		return (this.id > 0 && this.id <= 100) ? true : false;
	}

	public static void main(String[] args) {
		EncapsulationClass encapsulationClass = new EncapsulationClass(55, "Manju");
		if (encapsulationClass.validateId()) {
			System.out.println("Id is : " + encapsulationClass.id);
			System.out.println("Name is : " + encapsulationClass.name);
		}
	}

}
