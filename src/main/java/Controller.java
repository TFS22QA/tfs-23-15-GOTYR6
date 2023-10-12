import java.nio.charset.Charset;
import java.util.Scanner;

public enum Controller {
    INSTANCE;

    private final InputProcessor processor = new InputProcessor();

    public void launch() {
        String input;
        Scanner scan = new Scanner(System.in, Charset.defaultCharset());
        while (true) {
            System.out.println("Print 4 digits (0-9, no spaces). Q to exit");
            input = scan.nextLine();
            if ("q".equalsIgnoreCase(input)) {
                break;
            } else {
                System.out.println(processor.processInput(input));
                System.out.println("------------");
            }
        }
    }
}
