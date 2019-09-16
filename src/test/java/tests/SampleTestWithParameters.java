package tests;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SampleTestWithParameters {

    @Parameters({ "a", "b" })
    @Test
    public void t1(@Optional String a, @Optional int b) {
        System.out.println(a);

    }

}