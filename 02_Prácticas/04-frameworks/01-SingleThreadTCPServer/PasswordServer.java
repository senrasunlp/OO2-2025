import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PasswordServer extends SingleThreadTCPServer {

    private static final int PASSWORD_LENGTH = 8;
    private final Random random = new Random();

    @Override
    public void handleMessage(String message, PrintWriter out) {
        String[] args = message.split("\\s+");

        if (args.length != 3) {
            out.println("ERROR: You must provide exactly 3 arguments: <letters> <numbers> <specialChars>");
            return;
        }

        String letters = args[0];
        String numbers = args[1];
        String specials = args[2];

        if (letters.isEmpty() || numbers.isEmpty() || specials.isEmpty()) {
            out.println("ERROR: All character sets (letters, numbers, specials) must be non-empty.");
            return;
        }

        String password = generatePassword(letters, numbers, specials);
        out.println("Generated password: " + password);
    }

    private String generatePassword(String letters, String numbers, String specials) {
        List<Character> passwordChars = new ArrayList<>();

        // Add at least one number
        passwordChars.add(randomChar(numbers));

        // Add exactly one special character
        char specialChar = randomChar(specials);
        passwordChars.add(specialChar);

        // Remaining characters (6) from letters + numbers
        for (int i = 0; i < PASSWORD_LENGTH - 2; i++) {
            passwordChars.add(randomChar(letters + numbers));
        }

        // Shuffle to avoid predictable position of number/special
        Collections.shuffle(passwordChars, random);

        StringBuilder password = new StringBuilder();
        for (char c : passwordChars) {
            password.append(c);
        }

        return password.toString();
    }

    private char randomChar(String chars) {
        return chars.charAt(random.nextInt(chars.length()));
    }

    public static void main(String[] args) {
        PasswordServer server = new PasswordServer();
        server.startLoop(args);
    }
}
