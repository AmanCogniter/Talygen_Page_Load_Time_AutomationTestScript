package TestCases;

import static reporting.ComplexReportFactory.getTest;

import org.testng.annotations.Test;

import Action.LeadAction;
import Action.LoginAction;
import utils.WebTestBase;

public class LeadTest extends WebTestBase{
	static String Screenname = "<b>CRM</b>"; 
	/*
	 * Check Page load time of Lead module
	 */
	@Test(priority=0)
	public void ValidatePageLoadTimeOfLeadPageWithTenEntries()
	{
		test=getTest(Screenname + ": Validate Page Load Time Of Lead Page With Ten Entries");
		LeadAction leadAction = new LeadAction(driver);
		new LoginAction(driver).logoutLogin();
		leadAction.GoToCRMPage();
		leadAction.GoToLeadPage();
		
	}
	/*
	 * Check Page load time of Lead module with 100 Entries
	 */
	@Test(priority=1)
	public void ValidatePageLoadTimeOfLeadPageWithHundredEntries()
	{
		test=getTest(Screenname + ": Validate Page Load Time Of Lead Page With Hundred Entries");
		LeadAction leadAction = new LeadAction(driver);
		new LoginAction(driver).logoutLogin();
		leadAction.GoToCRMPage();
		leadAction.GoToSelectEntries();
		
	}
	 /*
	 * Check Page load time of Lead module with Applying Filter
	 */
	@Test(priority=2)
	public void ValidatePageLoadTimeOfLeadPageWithFilter()
	{
		test=getTest(Screenname + ": Validate Page Load Time Of Lead Page With Filter");
		LeadAction leadAction = new LeadAction(driver);
		new LoginAction(driver).logoutLogin();
		leadAction.GoToCRMPage();
		leadAction.GoToSelectFilter();
		
	}
	/*
	 * Check Page load time of Lead module with Applying Multiple Filter
	 */
	@Test(priority=3)
	public void ValidatePageLoadTimeOfLeadPageWithMultipleFilter()
	{
		test=getTest(Screenname + ": Validate Page Load Time Of Lead Page With Multiple Filter");
		LeadAction leadAction = new LeadAction(driver);
		new LoginAction(driver).logoutLogin();
		leadAction.GoToCRMPage();
		leadAction.GoToSelectMultipleFilter();
		
	}
}
