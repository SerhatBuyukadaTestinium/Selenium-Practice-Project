package com.automationpractice.tests;

import com.automationpractice.cases.positive.BuyProduct;
import com.automationpractice.cases.positive.Registration;
import com.automationpractice.cases.positive.SearchProduct;
import com.automationpractice.driver.BaseTest;
import org.junit.Test;
import org.openqa.selenium.By;

public class PositiveTests extends BaseTest {

    @Test
    public void positiveRegistrationTest() { // Automate User Registration process of e-commerce website.
        Registration registration = new Registration();

        registration.clickSignInButton();
        registration.insertEmail();
        registration.clickCreateAccount();
        registration.enterInformation();
        registration.clickRegisterButton();
    }

    @Test
    public void positiveSearchProduct() { // Automate 'Search Product' feature of e-commerce website with Selenium.
        SearchProduct searchProduct = new SearchProduct();
        searchProduct.openWomenTshirtCategory();
        searchProduct.getInformationOfFirstProduct();
        searchProduct.searchTheProduct();
        searchProduct.validateProduct();
    }

    @Test
    public void positiveBuyProduct(){
        BuyProduct buyProduct = new BuyProduct();
        buyProduct.loginToWebsite();
        buyProduct.openCategory();
        buyProduct.openFirstProduct();
        buyProduct.increaseQuantity();
        buyProduct.selectSize();
        buyProduct.selectColor();
        buyProduct.clickAddToCart();
        buyProduct.buyTheProduct();
    }
}

