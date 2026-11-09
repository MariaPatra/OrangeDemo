package org.example.orangedemo.runners

import io.cucumber.testng.AbstractTestNGCucumberTests
import io.cucumber.testng.CucumberOptions

@CucumberOptions(
    features = ["src/test/resources/features"],
    glue = ["org.example.orangedemo.steps","org.example.orangedemo.hooks"],
    plugin = ["pretty", "json:target/cucumber-report.json"],
    monochrome = false
)
class Runner : AbstractTestNGCucumberTests() {
    // Keep this class body completely clean and empty
}
