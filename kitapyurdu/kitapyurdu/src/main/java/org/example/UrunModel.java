package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;

import java.util.List;
import java.util.Random;


public class UrunModel {
    WebDriver driver;

    public UrunModel(WebDriver driver){

        this.driver = driver;
    }

    public void Search(){
        WebElement searchBar = driver.findElement(By.id("search-input"));
        searchBar.sendKeys("roman");
        searchBar.sendKeys(Keys.ENTER);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void ClickRandomBook() {
        try {
            List<WebElement> books = driver.findElements(By.className("product-cr"));

            Random rand = new Random();
            int randomNumber = rand.nextInt(books.size()-4)+3;
            WebElement bookToAdd = books.get(randomNumber);

            String bookId = bookToAdd.getAttribute("id");
            WebElement bookToAddChild = bookToAdd.findElement(By.xpath("//*[@id='" + bookId + "']/div[1]/div[2]/a"));
            bookToAddChild.click();

            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
