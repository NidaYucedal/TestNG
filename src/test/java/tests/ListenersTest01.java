package tests;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class ListenersTest01 {

    @Test
    public void test1() {
        System.out.println("Test Case 1 - PASS");
        Assert.assertTrue(true);//
    }

    @Test
    public void test2() {
        System.out.println("Test Case 2 - FAILED");
        Assert.assertTrue(false);//fail
    }

    @Test
    public void test3() {
        System.out.println("Test Case 3 - SKIPPED");
        throw new SkipException("Skip Edilecek");//skip
    }
}