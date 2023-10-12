package generators;

import person.models.Phone;
import utils.MyMath;

import java.util.Random;

public class PhoneGenerator {
    private boolean isPalindrome(final int code) {
        final String codeStr = String.valueOf(code);
        return codeStr.contentEquals(new StringBuilder(codeStr).reverse());
    }
    public Phone generate(final int code) {
        if (isPalindrome(code)) {
            return new Phone("N/A");
        }
        else {
            final String number = "+79"
                    + String.format("%02d", MyMath.getDigitsSum(code))
                    + String.format("%03d", new Random().nextInt(1000))
                    + String.format("%04d", code);
            return new Phone(number);
        }
    }
}
