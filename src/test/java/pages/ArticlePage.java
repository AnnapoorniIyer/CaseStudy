package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ArticlePage {
    
	WebDriver driver;
	
	// PageFactory pattern
    @FindBy(css = "ul.nav.navbar-nav.pull-xs-right > li.nav-item:nth-child(2)")
    WebElement newArticleLink;
    
    @FindBy(css = "input[name='title']")
    WebElement titleField;
    
    @FindBy(css = "input[name='description']")
    WebElement descField;
    
    @FindBy(css = "textarea[name='body']") 
    WebElement bodyField;
    
    @FindBy(css = "input[name='tags']")
    WebElement tagField;
    
    @FindBy(css = ".btn.btn-lg.pull-xs-right.btn-primary") 
    WebElement publishBtn;
    
    
    @FindBy(css = "ul.nav.navbar-nav.pull-xs-right > li.nav-item:nth-child(1)") 
    WebElement  clickhome;
    
    @FindBy(xpath = "//button[@class='nav-link '][1]") 
    WebElement  clickGlobal;
    
    @FindBy(xpath = "//h1[text() = 'Test125 Title']") 
    WebElement  viewarticleClick;
    
    @FindBy(xpath = "//a[@class='nav-link' and text()=' Edit Article']") 
    WebElement  editArticleBtn;
    
    @FindBy(xpath  = "//button[contains(@class, 'btn') and contains(@class, 'btn-sm') and contains(., 'Delete Article')]") 
    WebElement  deleteBtn;

  
   
	
	public ArticlePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	

		
	public void createArticle(String title, String description, String content,String tag) throws InterruptedException {
		
		newArticleLink.click();
		titleField.sendKeys(title);
		descField.sendKeys(description);
		bodyField.sendKeys(content);
		tagField.sendKeys(tag);
		publishBtn.click();
		Thread.sleep(3000);
		clickhome.click();
		
	}
	
	public void globalFeed() {
			
			clickGlobal.click();
			
			
		}
	public void viewArticle() {
		
		viewarticleClick.click();
		
		
	}
	
	
	
	public void updateArticle(String newTitle,String newDesc, String newContent) {
			
			editArticleBtn.click();
			titleField.clear();
			titleField.sendKeys(newTitle);
			descField.clear();
			descField.sendKeys(newDesc);
			bodyField.clear();
			bodyField.sendKeys(newContent);
			publishBtn.click();
			
		}
	
	public void deleteArticle() {
		
		deleteBtn.click();
		Alert confirm=driver.switchTo().alert();
		confirm.accept();
		
	}
	
	
	
	
	public void editClickArticle() {
		
		editArticleBtn.click();
		titleField.clear();
		descField.clear();
		bodyField.clear();
		tagField.clear();
		
	}
	
	public void editArticle(String title, String description, String content,String tag) {
		
		
		titleField.sendKeys(title);
		descField.sendKeys(description);
		bodyField.sendKeys(content);
		tagField.sendKeys(tag);
		publishBtn.click();
	
		
	}
	

}
