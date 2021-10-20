package org.vaild;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.loginpage.LoginPage;

public class VaidDeatils extends BaseClass {
	
	@BeforeClass
	public static void beforeclass() {
		launchbrowser("chrome");
		implicitlyWait(20);
	}
	@Before
	public void Before() {
		System.out.println("Stating time------"+new Date());
	}
	@Test
	public void Test() throws InterruptedException {
		launchUrl("https://en-gb.facebook.com/");
		Assert.assertTrue("verfiy",getCurrentUrl().contains("facebook"));
		LoginPage l=new LoginPage();
		FillTextBox(l.getsearch(), "hellarymanavalan");		
		Assert.assertEquals("verfiy","hellarymanavalan", getAttribute(l.getsearch()));
		FillTextBox(l.getTextpassword(), "1235467");
		Assert.assertEquals("verfiy","1235467", getAttribute(l.getTextpassword()));
		btnclick(l.getBtnlogin());
		Thread.sleep(5000);
		Assert.assertTrue("verfiy after url",getCurrentUrl().contains("privacy_mutation_token"));
	}
	@After
	public void after() {
		System.out.println("Ending time------"+new Date());
		
	}
	@AfterClass
	public static void afterclass() {
		quit();
	}
}