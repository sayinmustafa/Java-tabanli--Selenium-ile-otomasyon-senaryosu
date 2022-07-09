package org.example;

public class App {

    public static void main(String[] args){

        Kitapyurdu kitapyurdu;
        kitapyurdu = new Kitapyurdu();
        kitapyurdu.Setup();
        kitapyurdu.Search();
        kitapyurdu.ClickRandomBook();
        kitapyurdu.AddToBasket();
        kitapyurdu.CheckBasketValue("1");
        kitapyurdu.GoToBasket();
        kitapyurdu.UpdateBookAmount();
        kitapyurdu.ClickRefreshButton();
        kitapyurdu.CheckBasketUpdated();
        kitapyurdu.RemoveBookFromBasket();
        kitapyurdu.CheckBasketValue("0");

    }
}
