package org.example.orangedemo.pages

import org.example.orangedemo.hooks.Hook.Companion.driver
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory

class LoginPage(driver: WebDriver) {


    init {
        PageFactory.initElements(driver, this)
    }

    @FindBy(xpath = "//input[@placeholder='Username']")
    private lateinit var usernameField: WebElement

    @FindBy(xpath = "//input[@type='password']")
    private lateinit var passwordField: WebElement

    @FindBy(xpath = "//button[@type='submit']")
    private lateinit var loginButton: WebElement

    @FindBy(xpath = "//div[@class='oxd-alert-content oxd-alert-content--error']")
    private lateinit var invalidCredentialsErrorMessage: WebElement


    fun enterUserName(username: String) {
        usernameField.sendKeys(username)
    }

    fun enterPassword(password: String) {
        passwordField.sendKeys(password)

    }

    fun clickLogin(): AdminPage {
        loginButton.click()
        return AdminPage(driver)
    }

    fun incorrectCredentialsErrorMessage(errorMessage: String) {
        loginButton.sendKeys(errorMessage)
    }
}