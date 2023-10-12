package person;

import person.models.FullName;
import person.models.Phone;
import person.models.Physical;
import person.models.appearance.Appearance;

public class Person {

    private final String id;
    private final FullName fullName;
    private final Physical phys;
    private final Appearance appearance;
    private final Phone phone;

    public Person(String id, FullName fullName, Physical phys, Appearance appearance, Phone phone) {
        this.id = id;
        this.fullName = fullName;
        this.phys = phys;
        this.appearance = appearance;
        this.phone = phone;
    }

    @Override
    public final String toString() {
        return id + "\n" + fullName + "\n" + phys + "\n" + appearance + "\n" + phone;
    }
}
