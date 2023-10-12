package person;

import generators.AppearanceGenerator;
import generators.FullNameGenerator;
import generators.PhoneGenerator;
import generators.PhysicalGenerator;
import person.models.FullName;
import person.models.Phone;
import person.models.Physical;
import person.models.appearance.Appearance;


public class PersonFactory {

    public static Person getPerson(final String strCode) {
        int code = Integer.parseInt(strCode);
        Phone phone = new PhoneGenerator().generate(code);
        FullName fullName = new FullNameGenerator().generate(code);
        Physical physical = new PhysicalGenerator().generate(code);
        Appearance appearance = new AppearanceGenerator().generate(code);
        return new Person(
                strCode,
                fullName,
                physical,
                appearance,
                phone
        );
    }

}


