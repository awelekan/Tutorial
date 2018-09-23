package com.makotojava.intro;
import java.util.logging.Logger;
import java.math.BigDecimal;
import java.util.List;
public class HumanResourcesApplication {
	private static final Logger log = Logger.getLogger(HumanResourcesApplication.class.getName());
	  public static void main(String[] args) {
	    Employee e = new Employee();
	    e.setName("J Smith");
	    e.setEmployeeNumber("0001");
	    e.setTaxpayerIdentificationNumber("123-45-6789");
	    e.setSalary(BigDecimal.valueOf(45000.0));
	    e.printAudit(log);
	  }

}