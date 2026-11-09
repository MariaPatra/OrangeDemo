package org.example.orangedemo.steps

import io.cucumber.java.PendingException
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import org.example.orangedemo.hooks.Hook
import org.example.orangedemo.pages.LoginPage
import org.testng.Assert


class LoginStep {
    private val loginPage by lazy { LoginPage(Hook.driver) }

    @Given("the user is on the login page")
    fun the_user_is_on_the_login_page() {
        Hook.driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
    }


    @When("the user enters incorrect username as <{string}> and incorrect password as <{string}>")
    fun the_user_enters_incorrect_username_and_incorrect_password(
        incorrectUserName: String,
        incorrectPassword: String
    ) {
        loginPage.enterUserName(incorrectUserName)
        loginPage.enterPassword(incorrectPassword)
    }

    @Then("the user should get error message <{string}>")
    fun the_user_should_get_error_message(errorMessage: String) {
        loginPage.incorrectCredentialsErrorMessage(errorMessage)
    }

    @When("the user enters username as {string} and password as {string}")
    fun the_user_enters_username_as_and_password_as(userName: String, password: String) {
        loginPage.enterUserName(userName)
        loginPage.enterPassword(password)
    }

    @When("the user clicks on login button")
    fun the_user_clicks_on_login_button() {
        loginPage.clickLogin()
    }

    @Then("the user should be directed to the dashboard")
    fun the_user_should_be_directed_to_the_dashboard() {
        val currentUrl = Hook.driver.getCurrentUrl()
        Assert.assertTrue(currentUrl!!.contains("dashboard"), "Automation Framework was unsuccessful:$currentUrl")
    }

    //TODO
}