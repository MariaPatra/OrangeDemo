package org.example.orangedemo.pages

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory

class AdminPage(driver: WebDriver) {
    init {
        PageFactory.initElements(driver,this)
    }

    @FindBy(linkText = "web/index.php/admin/viewAdminModule")
    private lateinit var adminMenu: WebElement

    fun navigateToAdminPage() {
        adminMenu.click()

    }
}