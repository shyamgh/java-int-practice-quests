package tests;

import java.util.HashMap;
import java.util.Map;

public class CheckNumberSigns {

    public static void main(String[] args) {
        checkNum(2, -5);

        checkNum(2, 5);
    }

    private static void checkNum(int a, int b) {
        Map<Boolean, String> res = new HashMap<Boolean, String>();
        res.put(false, "opposite signs");
        res.put(true, "same sign");
        boolean x = (a ^ b) > 0;
        System.out.println(res.get(x));
    }

}
