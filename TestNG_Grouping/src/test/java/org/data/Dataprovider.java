package org.data;

import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Dataprovider extends BaseMethod {
	@BeforeClass
	private void beforeclass() {
		browserlaunch("chrome");
		implicitlyWait(20);
	}

	@BeforeMethod
	private void  beforeMethod() {
		System.out.println("date" + new Date());
	}

	@Test(dataProvider = "login")
	private void test(String user, String pass) {
		geturl("https://adactinhotelapp.com/");
		SoftAssert s = new SoftAssert();
		s.assertTrue(currenturl().contains("adactinhotelapp"), "verify url");
 
		Loginpage l=new Loginpage();
		
		sendkeys(l.user(), user);
		s.assertEquals(user, getattribute(l.user()), "verify user");

		sendkeys(l.pass(), pass);
		s.assertEquals(pass, getattribute(l.pass()), "verify pass");

		click(l.login());

	}

	@DataProvider(name = "login")
	private Object[][] data() {
		Object[][] a = new Object[][] { { "Anil", "Anil" }, { "Anil256", "Anil589" }, { "Anil8445", "Anil54646" },
				{ "Anil6536", "Anil6536" } };
		return a;
	}

	@AfterClass
	private void afterClass() {
		quit();

	}

}
