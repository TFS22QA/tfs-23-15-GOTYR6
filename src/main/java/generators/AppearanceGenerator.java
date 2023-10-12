package generators;

import person.models.appearance.Appearance;
import person.models.appearance.Hair;
import person.models.appearance.enums.EyesColor;
import person.models.appearance.enums.HairColor;

public class AppearanceGenerator {
    private static final int DIVIDER_TEN = 10;
    private static final int DIVIDER_HUNDRED = 100;

    public Appearance generate(final int code) {
        final int codeThirdDigit = code % DIVIDER_HUNDRED / DIVIDER_TEN;
        String eyesColor = EyesColor.values()[codeThirdDigit / 2].name().toLowerCase();
        String hairColor = null;
        if (codeThirdDigit > 0) {
            hairColor = HairColor.values()[codeThirdDigit - 1].name().toLowerCase();
        }
        return new Appearance(eyesColor, new Hair(codeThirdDigit, hairColor));
    }
}
