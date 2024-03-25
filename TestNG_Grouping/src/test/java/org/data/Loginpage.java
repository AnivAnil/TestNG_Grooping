package org.data;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage<WebEmenemnt> extends BaseMethod{
	public Loginpage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='username']") 
	    private WebElement user;

	public WebElement user() {
		return user;
	}
   @FindBy(id="password")
   private WebElement pass;
   public WebElement pass() {
	return pass;
	   
   }
	   @FindBy(id="login")
	   private WebElement login;
	   public WebElement login() {
		return login;
		   
	   }
	   @FindBy(id="location")
	   private WebElement location;
	   public WebElement location(){
		return location;
				   
	   }
	   @FindBy(id="hotels")
	   private WebElement hotels;
	   public WebElement hotels() {
		return hotels;
		   
	   }
	   @FindBy(id="room_type")
	   private WebElement room;
	   public WebElement room() {
		return room;
	}
	   @FindBy(id="adult_room")
	   private WebElement room1;
	   public WebElement room1() {
		return room1;
	}
	   @FindBy(id="child_room")
	   private WebElement room2;
	   public WebElement room2() {
		return room2;
	}  
	   @FindBy(id="datepick_in")
	   private WebElement date;
	   public WebElement date() {
		return date;
	   }
	   @FindBy(id="datepick_out")
	   private WebElement date2;
	   public WebElement date2() {
		return date2;
	}  
	   @FindBy(id="Submit")
	   private WebElement Submit;
	   public WebElement Submit() {
		return Submit;
	}  
	   @FindBy(id="radiobutton_1")
	   private WebElement radiobutton;
	   public WebElement radiobutton() {
		return radiobutton;
	}   
	   @FindBy(id="continue")
	   private WebElement continu;
	   public WebElement continu() {
		return continu;
	}
	   @FindBy(id="first_name")
	   private WebElement firstname;
	   public WebElement firstname() {
		return firstname;
	}
	   @FindBy(id="last_name")
	   private WebElement lastname;
	   public WebElement lastname() {
		return lastname;
	}
	   @FindBy(id="address")
	   private WebElement address;
	   public WebElement address() {
		return address;
	}
	   @FindBy(id="cc_num")
	   private WebElement ccnum;
	   public WebElement ccnum() {
		return ccnum;
	}
	   @FindBy(id="cc_type")
	   private WebElement cctype;
	   public WebElement cctype() {
		return cctype;
	}
	   @FindBy(id="cc_exp_month")
	   private WebElement ccexpmonth;
	   public WebElement ccexpmonth() {
		return ccexpmonth;
	}
	   @FindBy(id="cc_exp_year")
	   private WebElement ccexpyear;
	   public WebElement ccexpyear() {
		return ccexpyear;
	}
	   @FindBy(id="cc_cvv")
	   private WebElement cccvv;
	   public WebElement cccvv() {
		return cccvv;
	}
	   @FindBy(id="book_now")
	   private WebElement booknow;
	   public WebElement booknow() {
		return booknow;
	}
	  @FindBy(id="order_no")
	  private WebElement order;
	  public WebElement order() {
		return order;
		  
	  }
	   
	   
	  
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
}


