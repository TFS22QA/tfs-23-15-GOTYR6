package generators;

import person.models.Physical;

public class PhysicalGenerator {
    private static final int DIVIDER_HUNDRED = 100;
    private static final int DIVIDER_THOUSAND = 1000;
    private static final int MULTIPLIER = 10;
    private static final int AGE_MULTIPLIER = 10;
    private static final int WEIGHT_MIN = 30;
    private static final double HEIGHT_MIN = 100;

    public Physical generate(final int code) {
        final int codeSecondDigit = code % DIVIDER_THOUSAND / DIVIDER_HUNDRED;
        int age = (codeSecondDigit + 1) * AGE_MULTIPLIER;
        int weight = WEIGHT_MIN + codeSecondDigit * MULTIPLIER;
        double height = (HEIGHT_MIN + codeSecondDigit * MULTIPLIER) / HEIGHT_MIN;
        return new Physical(age, weight, height);
    }
}
