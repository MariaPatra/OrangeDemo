package org.example.orangedemo.hooks

import io.cucumber.java.Before
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import java.util.concurrent.TimeUnit

open class Hook {
    companion object {
        lateinit var driver: WebDriver

    }

    @Before
    fun setup() {
        driver = ChromeDriver()
        driver.manage().window().fullscreen()
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)


    }


    //
  /*  @After
    fun tearDown() {
        driver.quit()
    }*/
}