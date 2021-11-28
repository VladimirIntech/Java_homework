package ru.stqa.pft.addressbook;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class NewPhoneCreater {
  private WebDriver wd;
  private JavascriptExecutor js;

  @BeforeMethod(alwaysRun = true)
  public void setUp() throws Exception {
    wd = new ChromeDriver();
    wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    js = (JavascriptExecutor) wd;
    login("admin", "secret");
  }

  /**
   * Задание 4 , создан тест на добавление клиента
   **/
  @Test
  public void testUntitledTestCase() throws Exception {

    goToNewContact();
    fillingOutTheForm(new PhoneCreator("Ivan", "Ivanovich", "Ivanov", "nagibator3000", "909090909", "909090909", "88888888", "888888@fax.ru", "email@email.com", "1", "January", "1999", "sdsds", "sdsd", "sdsds"));
    endFilling();
    getHome_page();
   /* wd.findElement(By.id("1")).click();
    wd.findElement(By.id("1")).click();*/
  }

  private void getHome_page() {
    wd.findElement(By.linkText("home page")).click();
  }

  private void endFilling() {
    wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
  }

  private void fillingOutTheForm(PhoneCreator phoneCreator) {
    wd.findElement(By.name("firstname")).click();
    wd.findElement(By.name("firstname")).clear();
    wd.findElement(By.name("firstname")).sendKeys(phoneCreator.getName());
    wd.findElement(By.name("middlename")).clear();
    wd.findElement(By.name("middlename")).sendKeys(phoneCreator.getMiddlename());
    wd.findElement(By.name("lastname")).clear();
    wd.findElement(By.name("lastname")).sendKeys(phoneCreator.getLastname());
    wd.findElement(By.name("nickname")).clear();
    wd.findElement(By.name("nickname")).sendKeys(phoneCreator.getNickname());
    wd.findElement(By.name("home")).clear();
    wd.findElement(By.name("home")).sendKeys(phoneCreator.getHome());
    wd.findElement(By.name("mobile")).clear();
    wd.findElement(By.name("mobile")).sendKeys(phoneCreator.getMobile());
    wd.findElement(By.name("work")).clear();
    wd.findElement(By.name("work")).sendKeys(phoneCreator.getWork());
    wd.findElement(By.name("fax")).clear();
    wd.findElement(By.name("fax")).sendKeys(phoneCreator.getFax());
    wd.findElement(By.name("email")).click();
    wd.findElement(By.name("email")).clear();
    wd.findElement(By.name("email")).sendKeys(phoneCreator.getEmail());
    wd.findElement(By.name("email2")).click();
    wd.findElement(By.name("bday")).click();
    new Select(wd.findElement(By.name("bday"))).selectByVisibleText(phoneCreator.getBday());
    wd.findElement(By.name("bmonth")).click();
    new Select(wd.findElement(By.name("bmonth"))).selectByVisibleText(phoneCreator.getBmonth());
    wd.findElement(By.name("byear")).click();
    wd.findElement(By.name("byear")).clear();
    wd.findElement(By.name("byear")).sendKeys(phoneCreator.getByear());
    wd.findElement(By.name("new_group")).click();
    wd.findElement(By.name("address2")).click();
    wd.findElement(By.name("address2")).clear();
    wd.findElement(By.name("address2")).sendKeys(phoneCreator.getAddress2());
    wd.findElement(By.name("theform")).click();
    wd.findElement(By.name("phone2")).click();
    wd.findElement(By.name("phone2")).clear();
    wd.findElement(By.name("phone2")).sendKeys(phoneCreator.getPhone2());
    wd.findElement(By.name("notes")).click();
    wd.findElement(By.name("notes")).clear();
    wd.findElement(By.name("notes")).sendKeys(phoneCreator.getNotes());
    wd.findElement(By.name("theform")).click();
  }

  private void goToNewContact() {
    wd.findElement(By.linkText("add new")).click();
  }

  private void login(String username, String password) {
    wd.get("http://localhost/addressbook/");
    wd.findElement(By.name("user")).click();
    wd.findElement(By.name("user")).clear();
    wd.findElement(By.name("user")).sendKeys(username);
    wd.findElement(By.name("pass")).click();
    wd.findElement(By.name("pass")).clear();
    wd.findElement(By.name("pass")).sendKeys(password);
    wd.findElement(By.xpath("//input[@value='Login']")).click();
  }

  @AfterMethod(alwaysRun = true)
  public void tearDown() throws Exception {
    wd.quit();

  }

  private boolean isElementPresent(By by) {
    try {
      wd.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      wd.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

}
