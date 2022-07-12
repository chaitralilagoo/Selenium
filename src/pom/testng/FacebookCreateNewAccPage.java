package pom.testng;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FacebookCreateNewAccPage 
{
	@FindBy (xpath="//input[@name='firstname']") private WebElement firstName;
	@FindBy (xpath="//input[@name='lastname']") private WebElement lastName;
	@FindBy (xpath="//input[@name='reg_email__']") private WebElement emailId;
	@FindBy (xpath="//input[@aria-label='Re-enter email address']") private WebElement reEmailId;
	@FindBy (xpath="//input[@name='reg_passwd__']") private WebElement password;
	@FindBy (xpath="//select[@aria-label='Day']") private WebElement birthDate;
	@FindBy (xpath="//select[@aria-label='Month']") private WebElement birthMonth;
	@FindBy (xpath="//select[@aria-label='Year']") private WebElement birthYear;
	@FindBy (xpath="//label[text()='Female']") private WebElement genderFemale;
	@FindBy (xpath="//label[text()='Male']") private WebElement genderMale;
	@FindBy (xpath="//label[text()='Custom']") private WebElement genderCustom;
	@FindBy (xpath = "//select[@name='preferred_pronoun']") private WebElement pronoun;
	@FindBy (xpath = "//button[text()='Sign Up'][1]") private WebElement signIn;
	@FindBy (xpath = "//span[@class='_5k_2 _5dba']") private List<WebElement> gender;
	
	//@FindBy (how = How.CLASS_NAME, using = "_5k_2 _5dba") private List<WebElement> gender;
	
	public FacebookCreateNewAccPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void enterFirstName(String firstName)
	{
		this.firstName.sendKeys(firstName);
	}
	public void enterLastName(String lastName)
	{
		this.lastName.sendKeys(lastName);
	}
	public void enterEmailId(String emailId)
	{
		this.emailId.sendKeys(emailId);
	}
	public void reEnterEmailId(String reEmailId)
	{
		this.reEmailId.sendKeys(reEmailId);
	}
	public void enterPassword(String password)
	{
		this.password.sendKeys(password);
	}
	public void selectBirthDate(String day)
	{
		Select selDay = new Select(birthDate);
		selDay.selectByValue(day);
	}
	public void selectBirthMonth(String month)
	{
		Select selMonth = new Select(birthMonth);
		selMonth.selectByValue(month);
	}
	public void selectBirthYear(String year)
	{
		Select selYear = new Select(birthYear);
		selYear.selectByValue(year);
	}
	public void clickFemaleGender()
	{
		genderFemale.click();
	}
	public void clickMaleGender()
	{
		genderMale.click();
	}
	public void clickCustomGender(int pronoun)
	{
		genderCustom.click();
		selectPronoun(pronoun);
	}
	public void selectPronoun(int pronoun)
	{
		Select selPronoun = new Select(this.pronoun);
		selPronoun.selectByIndex(pronoun);
		/*
		 		1. She
		 		2. He
		 		3. They
		 */
	}
	
//	public void clickGender(int i)
//	{
//		gender.get(i).click();
//	}
	public void clickGender(int i, int pronoun)
	{
		gender.get(i).click();
		if(i==2)
			selectPronoun(pronoun);
	}
	public void clickSignIn()
	{
		signIn.click();
	}
}
