package org.example.generic;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ITestResultDemo {

    @Test
    public void test1() {
        Assert.assertEquals(4, 4);

    }

    @Test
    public void test2() {
        Assert.assertEquals(10, 10);
    }

    @AfterMethod
    public void result(ITestResult testResult) {
        if (testResult.getStatus() == ITestResult.FAILURE) {
            System.out.println("Failed:" + testResult.getName());
        }
        if (testResult.getStatus() == ITestResult.SUCCESS) {
            System.out.println("Passed :" + testResult.getName());
        }
    }

}




