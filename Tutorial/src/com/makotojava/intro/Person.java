package com.makotojava.intro;

import java.util.logging.Logger;
public class Person {
	Logger l = Logger.getLogger(Person.class.getName());

	private String name;
	  private int age;
	  private int height;
	  private int  weight;
	  private String eyeColor;
	  private String gender;

//	  public Person(String name, int age, int height, int weight, String eyeColor, String gender)
	  {
		this.name = name;
	  	this.age = age;
	    this.height = height;
	    this.weight = weight;
	    this.eyeColor = eyeColor;
	    this.gender = gender;
	  }
	  
	  public String getName() 
	  {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getEyeColor() {
		return eyeColor;
	}

	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	// PrintAudit: Overloading the class Person
	
	public void printAudit(StringBuilder buffer) {
	   buffer.append("Name=");
	   buffer.append(getName());
	   buffer.append(",");
	   buffer.append("Age=");
	   buffer.append(getAge());
	   buffer.append(",");
	   buffer.append("Height=");
	   buffer.append(getHeight());
	   buffer.append(",");
	   buffer.append("Weight=");
	   buffer.append(getWeight());
	   buffer.append(",");
	   buffer.append("EyeColor=");
	   buffer.append(getEyeColor());
	   buffer.append(",");
	   buffer.append("Gender=");
	   buffer.append(getGender());
	}
	 
	public void printAudit(Logger l) {
	   StringBuilder sb = new StringBuilder();
	   printAudit(sb);
	   l.info(sb.toString());
	}

	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}	
	
}


