package person.models;

public class FullName extends Param {
    private final String lastName;
    private final String firstName;
    private final String middleName;

    public FullName(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    @Override
    public String toString() {
        return String.join("\n", lastName, firstName, middleName);
    }
}
