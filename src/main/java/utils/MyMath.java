package utils;

public class MyMath {

    public static int getDigitsSum(final int code) {
        int sum = 0;
        for (String stringDigit : String.valueOf(code).split("")) {
            sum += Integer.parseInt(stringDigit);
        }
        return sum;
    }
}
