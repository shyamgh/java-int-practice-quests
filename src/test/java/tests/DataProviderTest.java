package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

    @Test(dataProvider = "dp", dependsOnMethods = {})
    public void f(Integer n, String s) {

        System.out.print(n + " " + s);

    }

    @DataProvider
    public Object[][] dp() {
        return new Object[][] { new Object[] { 1, "a" }, new Object[] { 2, "b" }, new Object[] { 3, "c" },
                new Object[] { 4, "d" }, new Object[] { 5, "e" }, new Object[] { 6, "f" }, };
    }

}
