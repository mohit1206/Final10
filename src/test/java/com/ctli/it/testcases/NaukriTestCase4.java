package com.ctli.it.testcases;

import org.testng.annotations.Test;

import com.ctli.it.lib.TestNgInitialization;
import com.ctli.it.webpage.NaukriHomePage;

public class NaukriTestCase4 extends TestNgInitialization{
	
	@Test
	public void test() throws InterruptedException{
		NaukriHomePage nHomePage = new NaukriHomePage(driver, testReport);
		nHomePage.verifyHomePage();
	//	nHomePage.searchJobs();
	//	nHomePage.filterCritaria();
	//	nHomePage.jobDetails();
	}

}
