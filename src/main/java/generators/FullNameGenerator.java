package generators;

import person.models.FullName;

import static utils.FileReader.getLinesFromFile;
import static utils.MyMath.getDigitsSum;

public class FullNameGenerator {
    private static final int DIVIDER_HUNDRED = 100;

    public FullName generate(final int code) {
        final int codeDigitsSum = getDigitsSum(code);
        final String sex = (codeDigitsSum % 2 == 0) ? "f" : "m";
        final String lastName = getLinesFromFile("lastNames_" + sex).get(codeDigitsSum);
        final String firstName = getLinesFromFile("names_" + sex)
                .get(getDigitsSum(code / DIVIDER_HUNDRED));
        final String middleName = getLinesFromFile("middleNames_" + sex)
                .get(getDigitsSum(code % DIVIDER_HUNDRED));
        return new FullName(lastName, firstName, middleName);
    }
}
