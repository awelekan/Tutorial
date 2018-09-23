package com.makotojava.intro;
import java.util.List;
import java.math.BigDecimal;
import java.util.logging.Logger;

public class Employee extends Person {
	private String taxpayerIdentificationNumber;
	  private String employeeNumber;
	  private BigDecimal salary;
	 
	  public Employee() {
	    super();
	  }
	  public String getTaxpayerIdentificationNumber() {
	    return taxpayerIdentificationNumber;
	  }
	  public void setTaxpayerIdentificationNumber(String taxpayerIdentificationNumber) {
	    this.taxpayerIdentificationNumber = taxpayerIdentificationNumber;
	  }
	 
	  // Other getter/setters...
	}

	public Employee() {
		
		super();
			    // TODO Auto-generated constructor stub
			  }
			 public Employee(String name, int age, int height, int weight,
			  String eyeColor, String gender) 
			 {
			    super(name, age, height, weight, eyeColor, gender);
			    
			  }
			public String getEmployeeNumber() {
				return employeeNumber;
			}
			public void setEmployeeNumber(String employeeNumber) {
				this.employeeNumber = employeeNumber;
			}
			public BigDecimal getSalary() {
				return salary;
			}
			public void setSalary(BigDecimal salary) {
				this.salary = salary;
			}
			@Override
			public String getName() {
				// TODO Auto-generated method stub
				return super.getName();
			}
			@Override
			public void setName(String name) {
				// TODO Auto-generated method stub
				super.setName(name);
			}
			@Override
			public int getAge() {
				// TODO Auto-generated method stub
				return super.getAge();
			}
			@Override
			public void setAge(int age) {
				// TODO Auto-generated method stub
				super.setAge(age);
			}
			@Override
			public int getHeight() {
				// TODO Auto-generated method stub
				return super.getHeight();
			}
			@Override
			public void setHeight(int height) {
				// TODO Auto-generated method stub
				super.setHeight(height);
			}
			@Override
			public int getWeight() {
				// TODO Auto-generated method stub
				return super.getWeight();
			}
			@Override
			public void setWeight(int weight) {
				// TODO Auto-generated method stub
				super.setWeight(weight);
			}
			@Override
			public String getEyeColor() {
				// TODO Auto-generated method stub
				return super.getEyeColor();
			}
			@Override
			public void setEyeColor(String eyeColor) {
				// TODO Auto-generated method stub
				super.setEyeColor(eyeColor);
			}
			@Override
			public String getGender() {
				// TODO Auto-generated method stub
				return super.getGender();
			}
			@Override
			public void setGender(String gender) {
				// TODO Auto-generated method stub
				super.setGender(gender);
			}
			@Override
			public void printAudit(StringBuilder buffer) {
				// TODO Auto-generated method stub
				super.printAudit(buffer);
			}
			@Override
			public void printAudit(Logger l) {
				// TODO Auto-generated method stub
				super.printAudit(l);
			}
			@Override
			public boolean equals(Object arg0) {
				// TODO Auto-generated method stub
				return super.equals(arg0);
			}
			 
			}
	
