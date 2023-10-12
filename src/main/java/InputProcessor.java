import person.PersonFactory;

public class InputProcessor {

    public final String processInput(final String input) {
        String result = "Invalid input.";

        if (input.trim().matches("\\d{4}")) {
            result = PersonFactory.getPerson(input).toString();
        }
        return result;
    }
}
