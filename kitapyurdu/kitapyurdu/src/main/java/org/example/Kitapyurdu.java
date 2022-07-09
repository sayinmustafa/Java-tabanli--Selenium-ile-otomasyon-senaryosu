package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kitapyurdu{

    WebDriver driver;
    String url = "https://www.kitapyurdu.com/";
    UrunModel urunModel;
    SepetModel sepetModel;


    public void Setup(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Musta\\IdeaProjects\\SeleniumProject\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        urunModel = new UrunModel(driver);
        sepetModel = new SepetModel(driver);

        driver.get(url);
        driver.manage().window().maximize();
    }

    public void ClickRandomBook(){
        urunModel.ClickRandomBook();
    }

    public void Search(){
        urunModel.Search();
    }
    public void AddToBasket(){
        sepetModel.AddToBasket();
    }

    public void CheckBasketValue(String value){
        sepetModel.CheckBasketValue(value);
    }

    public void GoToBasket(){
        sepetModel.GoToBasket();
    }
    public void UpdateBookAmount(){
        sepetModel.UpdateBookAmount();
    }
    public void ClickRefreshButton(){
        sepetModel.ClickRefreshButton();
    }
    public void CheckBasketUpdated(){
        sepetModel.CheckBasketUpdated();
    }
    public void RemoveBookFromBasket(){
        sepetModel.RemoveBookFromBasket();
    }

}
