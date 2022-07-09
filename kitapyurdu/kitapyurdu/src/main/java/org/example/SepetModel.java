package org.example;

import org.junit.Assert;
import org.openqa.selenium.*;

class SepetModel {
    WebDriver driver;

    public SepetModel(WebDriver driver){

        this.driver = driver;
    }

    public void AddToBasket(){
        try {
            WebElement addBasketButton = driver.findElement(By.id("button-cart"));
            addBasketButton.click();
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void CheckBasketValue(String value){
        try{
            WebElement basket = driver.findElement(By.id("cart-items"));
            String basketItemCount = basket.getText();
            Assert.assertEquals(value, basketItemCount);
            Thread.sleep(1500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public void GoToBasket(){
        try{
            WebElement basketButton = driver.findElement(By.id("cart"));
            basketButton.click();
            Thread.sleep(1000);
            WebElement goToBasketButton = driver.findElement(By.id("js-cart"));
            goToBasketButton.click();
            Thread.sleep(1500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public void UpdateBookAmount(){
        try{
            WebElement amountInput = driver.findElement(By.xpath("//form[@class='js-cart-update-product']/input"));
            amountInput.sendKeys(Keys.BACK_SPACE);
            amountInput.sendKeys("2");
            Thread.sleep(1500);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public void ClickRefreshButton(){
        try{
            WebElement refreshButton = driver.findElement(By.xpath("//i[@class='fa fa-refresh green-icon']"));
            refreshButton.click();
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public void CheckBasketUpdated(){
        try{
            WebElement basketUpdatedModalText = driver.findElement(By.id("swal2-title"));
            Assert.assertEquals("Sepetiniz güncelleniyor!",basketUpdatedModalText.getText());
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public void RemoveBookFromBasket(){
        try{
            WebElement removeButton = driver.findElement(By.xpath("//i[@class='fa fa-times red-icon']"));
            removeButton.click();
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
