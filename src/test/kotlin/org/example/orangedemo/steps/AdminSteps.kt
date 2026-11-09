package org.example.orangedemo.steps

import io.cucumber.java.PendingException
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import org.example.orangedemo.hooks.Hook
import org.example.orangedemo.pages.AdminPage


class AdminSteps {
    private val adminPage by lazy { AdminPage(Hook.driver) }

    @Given("the user navigates to the Admin menu screen")
    fun the_user_navigates_to_the_admin_menu_screen() {

        adminPage.navigateToAdminPage()
    }

    @When("the user clicks on the Add button")
    fun the_user_clicks_on_the_add_button() {
        // Write code here that turns the phrase above into concrete actions
        throw PendingException()
    }

    @When("the user fills the form to create a new admin user with username {string}")
    fun the_user_fills_the_form_to_create_a_new_admin_user_with_username(string: String?) {
        // Write code here that turns the phrase above into concrete actions
        throw PendingException()
    }

    @Then("the account creation process should complete successfully")
    fun the_account_creation_process_should_complete_successfully() {
        // Write code here that turns the phrase above into concrete actions
        throw PendingException()
    }
}