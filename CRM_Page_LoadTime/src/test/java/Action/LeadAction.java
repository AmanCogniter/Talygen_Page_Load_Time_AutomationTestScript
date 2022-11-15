package Action;

import org.openqa.selenium.WebDriver;

import PageObjects.LeadPage;




public class LeadAction {
	WebDriver driver ; 
	LeadPage leadPage;
	
	public LeadAction(WebDriver driver)
	{
		this.driver= driver;
		leadPage= new LeadPage(driver);

	}
	
	public void GoToCRMPage()
	{
		leadPage.clickFullMenuDropDown();	
		leadPage.clickOnCRM();	
		
		
	}
	/*Method  for Lead Sub Module of CRM */
	public void GoToLeadPage()
	{
		
		leadPage.clickOnLead();	
		
		
	}
	/*Method  for Select Entries in Lead Sub Module of CRM */
	public void GoToSelectEntries()
	{
		leadPage.clickOnEntriesNumber();	
		
		
	}
	/*Method  for Capture Page Load Time with Filter in Lead Sub Module of CRM */
	public void GoToSelectFilter()
	{
		leadPage.clickOnLead();	
		leadPage.clickOnSearch();	
		
		
	}
	/*Method  for Capture Page Load Time with MultipleFilter in Lead Sub Module of CRM */
	public void GoToSelectMultipleFilter()
	{
		leadPage.clickOnLead();	
		leadPage.clickOnSearchWithMultipleFilter();	
		
		
	}
}
